public class User {
    private String FirstName;
    private String Lastname;
    public User(String FirstName, String Lastname) {
        this.FirstName = FirstName;
        this.Lastname = Lastname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public String GetFullName() {
        return FirstName + " " + Lastname;
    }

}
