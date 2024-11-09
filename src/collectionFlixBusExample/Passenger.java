package collectionFlixBusExample;

public class Passenger {
    private String firstName;
    private String lastName;
    private String birthday;
    private String docNumber;
    private String numberTicket;

    public Passenger(String firstName, String lastName, String birthday, String docNumber, String numberTicket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.docNumber = docNumber;
        this.numberTicket = numberTicket;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNumberTicket() {
        return numberTicket;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberTicket(String numberTicket) {
        this.numberTicket = numberTicket;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", docNumber='" + docNumber + '\'' +
                ", numberTicket='" + numberTicket + '\'' +
                '}';
    }
}
