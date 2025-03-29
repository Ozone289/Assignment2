package DAO.TransferObject;

public class Flight {

    private String name;
    private String date;
    private Status status;

    private String departureAirport;
    private String departureIATA;
    private String departureTimeZone;
    private String departureTime;
    private String departureGate;
    private String departureTerminal;

    private String arrivalAirport;
    private String arrivalIATA;
    private String arrivalTimeZone;
    private String arrivalTime;
    private String arrivalGate;
    private String arrivalTerminal;
    
    private static int limit;
    private static int total;

    // Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    
    
    public String getDepartureAirport() {
        return departureAirport;
    }
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureIATA() {
        return departureIATA;
    }
    public void setDepartureIATA(String departureIATA) {
        this.departureIATA = departureIATA;
    }

    public String getDepartureTimeZone() {
        return departureTimeZone;
    }
    public void setDepartureTimeZone(String departureTimeZone) {
        this.departureTimeZone = departureTimeZone;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureGate() {
        return departureGate;
    }
    public void setDepartureGate(String departureGate) {
        this.departureGate = departureGate;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }
    public void setDepartureTerminal(String departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    
    
    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalIATA() {
        return arrivalIATA;
    }
    public void setArrivalIATA(String arrivalIATA) {
        this.arrivalIATA = arrivalIATA;
    }

    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }
    public void setArrivalTimeZone(String arrivalTimeZone) {
        this.arrivalTimeZone = arrivalTimeZone;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalGate() {
        return arrivalGate;
    }
    public void setArrivalGate(String arrivalGate) {
        this.arrivalGate = arrivalGate;
    }

    public String getArrivalTerminal() {
        return arrivalTerminal;
    }
    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }
    
    
    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\n' +
                ", date='" + date + '\n' +
                ", status=" + status +
                ", departureAirport='" + departureAirport + '\n' +
                ", departureIATA='" + departureIATA + '\n' +
                ", departureTimeZone='" + departureTimeZone + '\n' +
                ", departureTime='" + departureTime + '\n' +
                ", departureGate='" + departureGate + '\n' +
                ", departureTerminal='" + departureTerminal + '\n' +
                ", arrivalAirport='" + arrivalAirport + '\n' +
                ", arrivalIATA='" + arrivalIATA + '\n' +
                ", arrivalTimeZone='" + arrivalTimeZone + '\n' +
                ", arrivalTime='" + arrivalTime + '\n' +
                ", arrivalGate='" + arrivalGate + '\n' +
                ", arrivalTerminal='" + arrivalTerminal + '\n' +
                '}';
    }
}
