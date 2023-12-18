package laboratory3;

import java.time.LocalDate;

public class Home {
    private int numberFloors;
    private String name;
    private int yearConstruction;

    public void setHome(String name, int numberFloors, int yearConstruction) {
        this.numberFloors = numberFloors;
        this.name = name;
        this.yearConstruction = yearConstruction;
    }


    public void printHome() {
        System.out.println(this.name + " " + this.yearConstruction + " " + this.numberFloors);
    }

    public int yearHome() {
        return LocalDate.now().getYear() - this.yearConstruction;
    }
}
