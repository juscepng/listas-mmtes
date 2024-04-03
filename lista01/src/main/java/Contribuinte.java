public class Contribuinte {

    int age;
    String gender;
    int contributionTime;

    public Contribuinte(int age, String gender, int contributionTime) {
        this.age = age;
        this.gender = gender;
        this.contributionTime = contributionTime;
    }

    public boolean validateEligible() {
        if ("F".equals(gender)) {
            return age >= 62 && contributionTime >= 15;
        } else if ("M".equals(gender)) {
            return age >= 65 && contributionTime >= 20;
        }
        
        return false;
    }

}
