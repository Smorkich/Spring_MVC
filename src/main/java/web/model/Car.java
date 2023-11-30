package web.model;


public class Car {
    private String brand;
    private String model;
    private String yearOfProduction;
    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = year;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
