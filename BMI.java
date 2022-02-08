package Week4;

public class BMI {
    private Double height;
    private Double weight;
    double bmier;
    String interpretation;

    public BMI(Double height, Double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    public double calculateBMI() {
        bmier = weight / (height * height);
        return bmier;
    }

    public String checkBMI() {
        if (bmier < 18.5) {
            interpretation = "Underweight";
        }
        else if (bmier < 25.0) {
            interpretation = "Normal";
        }
        else if (bmier < 30.0) {
            interpretation = "Overweight";
        }
        else {
            interpretation = "Obese";
        }
        return interpretation;
    }
}
