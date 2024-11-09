package collectionFlixBusExample;

public class FlixBusPassenger {
    private String firstName;
    private String lastName;
    private String birthday;
    private String docNumber;
    private String ticketNumber;


    public FlixBusPassenger(String firstName, String lastName, String birthday, String docNumber, String ticketNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.docNumber = docNumber;
        this.ticketNumber = ticketNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return "FlixBusPassenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", docNumber='" + docNumber + '\'' +
                ", ticketNumber='" + ticketNumber + '\'' +
                '}';
    }
}
