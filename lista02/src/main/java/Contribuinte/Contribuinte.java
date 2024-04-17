package Contribuinte;

import java.util.Objects;

public class Contribuinte {
    int age;
    String gender;
    int contributionTime;

    public Contribuinte(int age, String gender, int contributionTime) {

        if (!gender.equals("M") && !gender.equals("m") && !gender.equals("F") && !gender.equals("f")) {
            throw new IllegalArgumentException("O gênero informado não é um gênero válido.");
        }

        if(age <= 0 || contributionTime <= 0){
            throw new IllegalArgumentException("O valor em anos informado nao e valido.");
        }

        if(age < contributionTime){
            throw new IllegalArgumentException("O tempo de contribuição e maior do que a idade.");
        }

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
