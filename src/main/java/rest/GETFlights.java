package rest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import DAO.TransferObject.Flight;
import read.AppProperties;

public class GETFlights {
	private GETFlights() {}
	
	private static String get(String IATACode) throws IOException, InterruptedException {
		 String url = "http://api.aviationstack.com/v1/flights?access_key="+ AppProperties.getApiKey() +"&dep_iata=" + IATACode;
		 
		 HttpClient client = HttpClient.newHttpClient();
		 HttpRequest request = HttpRequest.newBuilder()
		         .uri(URI.create(url))
		     .GET()
		     .build();
		
		 HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		 //System.out.println("Status Code: " + response.statusCode());
		 return response.body();
	}
	 
	 public static void GetFlightsByDeparture(String IATACode) throws IOException, InterruptedException {
		 List<Flight> Flights = new ArrayList<Flight>();
		 
		String jsonResponse = get(IATACode);
		// Parse JSON response
        JsonObject root = JsonParser.parseString(jsonResponse ).getAsJsonObject();

        // Access pagination
        JsonObject pagination = root.getAsJsonObject("pagination");
        int limit = pagination.get("limit").getAsInt();
        int total = pagination.get("total").getAsInt();

        System.out.println("Pagination: Limit=" + limit + ", Total=" + total);

        // Access flight data
        JsonArray dataArray = root.getAsJsonArray("data");
        for (int i = 0; i < dataArray.size(); i++) {
            JsonObject flight = dataArray.get(i).getAsJsonObject();
            
            JsonObject departure = flight.getAsJsonObject("departure");
            JsonObject arrival = flight.getAsJsonObject("arrival");
            JsonObject airline = flight.getAsJsonObject("airline");
            JsonObject flite = flight.getAsJsonObject("flight");
            
            Flight f = new Flight();
            
            f.setName(airline.get("name").getAsString()+" "+flite.get("number").getAsString());
            f.setDate(flight.get("flight_date").getAsString());
            
//            switch() {
//            	
//            }
            f.setStatus(null);
            
            f.setDepartureAirport(jsonResponse);
            f.setDepartureIATA(jsonResponse);
            f.setDepartureTimeZone(jsonResponse);
            f.setDepartureTime(jsonResponse);
            f.setDepartureGate(jsonResponse);
            f.setDepartureTerminal(null);
            
            f.setArrivalAirport(jsonResponse);
            f.setArrivalIATA(jsonResponse);
            f.setArrivalTimeZone(jsonResponse);
            f.setArrivalTime(jsonResponse);
            f.setArrivalGate(jsonResponse);
            f.setArrivalTerminal(null);
            
            String flightDate = flight.get("flight_date").getAsString();
            String flightStatus = flight.get("flight_status").getAsString();

            
            String departureAirport = departure.get("airport").getAsString();

            String arrivalAirport = arrival.get("airport").getAsString();

            System.out.println("Flight Date: " + flightDate);
            System.out.println("Flight Status: " + flightStatus);
            System.out.println("Departure Airport: " + departureAirport);
            System.out.println("Arrival Airport: " + arrivalAirport);
            System.out.println("----------------------"+(i+1));
        }
    }
}
