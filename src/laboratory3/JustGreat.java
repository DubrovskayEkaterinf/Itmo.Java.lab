package laboratory3;

import laboratory2.Color;

public class JustGreat {
    public JustGreat(Color color) {
        this.color = color;
    }

    public JustGreat(Color color, double weight) {
        this.color = color;
        this.weight = weight;
            }
    public JustGreat() {
    }

        private Color color;
    private String name;
    private double weight;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printCar() {
        System.out.println(this.name + " " + this.color + " " + this.weight);
    }
}





