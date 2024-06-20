package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String series;
    private Color color;

    public Car(String model, String series, Color color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }
    public Car (){};

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return series == car.series && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color=" + color +
                '}';
    }
}