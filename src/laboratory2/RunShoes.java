package laboratory2;

import javax.swing.*;
import java.lang.reflect.Constructor;

public class RunShoes {
    private String brand; //
    private String typSport; //
    private Double saze; //
    private Color color;
    private Boolean quickLacingSyst; // Система быстрой шнуровки
    private Long price;

    public RunShoes() {
    }

    public RunShoes(String brand, String typSport, Double saze, Color color, Boolean quickLacingSyst, Long price) {
        this.brand = brand;
        this.typSport = typSport;
        this.saze = saze;
        this.color = color;
        this.quickLacingSyst = quickLacingSyst;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
}
    public String getTypSport() {
        return typSport;
    }
    public void setTypSport(String typSport) {
        this.typSport = typSport;
    }
    public Double getSaze() {
        return saze;
    }
    public void setSaze(Double saze) {
        this.saze = saze;
    }
    public Color getColor() {
        return color;
  }
  public void setColor(Color color) {
        this.color = color;
  }
    public Boolean getQuickLacingSyst() {
        return quickLacingSyst;
    }
    public void setQuickLacingSyst(Boolean quickLacingSyst1) {
        quickLacingSyst = quickLacingSyst1;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RunShoes{" +
                "brand='" + brand + '\'' +
                ", typSport='" + typSport + '\'' +
                ", saze=" + saze +
                ", color=" + color +
                ", quickLacingSyst=" + quickLacingSyst +
                ", price=" + price +
                '}';
    }
}
