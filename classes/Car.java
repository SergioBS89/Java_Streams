package api_stream.classes;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String year;
    private String color;
    private String motor;
    private double price;
    private Salesman salesman;
    private BankEmployee bankEmployee;
    private String owner = null;

    public Car(int id, String brand, String model, String year, String color, String motor, double price, Salesman salesman, BankEmployee bankEmployee) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.motor = motor;
        this.price = price;
        this.salesman = salesman;
        this.bankEmployee = bankEmployee;
    }

    public Car(String owner){
        this.id = 100;
        this.brand = "Ferrari";
        this.model = "F5";
        this.year = "2023";
        this.color = "Red";
        this.motor = "4000cc";
        this.price = 200000.00;
        this.owner = owner;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public BankEmployee getBankEmployee() {
        return bankEmployee;
    }

    public void setBankEmployee(BankEmployee bankEmlpoyee) {
        this.bankEmployee = bankEmlpoyee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", motor='" + motor + '\'' +
                ", price=" + price +
                ", salesman=" + salesman +
                ", bankEmployee=" + bankEmployee +
                ", owner='" + owner + '\'' +
                '}';
    }
}
