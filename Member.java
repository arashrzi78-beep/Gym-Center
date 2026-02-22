public class Member {
    private String name;
    private String surName;
    private double weight;
    private double height;

    public Member(String name, String sureName, double weight, double height) {
        this.name = name;
        this.surName = sureName;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return surName;
    }

    public void setSureName(String sureName) {
        this.surName = sureName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String display() {
        return "member [ name = " + name + ", surname = " + surName + ", weight = " + weight + ", height = " + height + " ]";
    }

    private double BMI() {
        return weight / (height * height);
    }

    public String weightStatus() {
        double bmi = BMI();
        String status;
        if (bmi < 18.5) {
            status = "Thin";
        } else if (bmi >= 18.5 && bmi <= 25.9) {
            status = "Normal";
        } else if (bmi >= 25.9 && bmi <= 29.9) {
            status = "Fat";
        }else {
            status = "Obese";
        }
        return status;
    }
}
