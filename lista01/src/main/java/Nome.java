public class Nome {

    private String title;
    private String principalName;
    private String middleName;
    private String lastName;

    public Nome(String title, String principalName, String middleName, String lastName) {
        this.title = title;
        this.principalName = principalName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String mountName() {
        return (title.isEmpty() ? "" : title + " ") + (principalName.isEmpty() ? "" : principalName + " ") + (middleName.isEmpty() ? "" : middleName + " ") + (lastName.isEmpty() ? "" : lastName);
    }

}
