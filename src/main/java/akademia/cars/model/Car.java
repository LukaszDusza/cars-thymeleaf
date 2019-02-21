package akademia.cars.model;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Car {

//    @NotEmpty
//    @Size(min = 2, max = 50)
    private String brand;


    private String model;


    private String power;

    private String yearProduction;

    private String foto;

    public Car(String brand, String model, String power, String yearProduction, String foto) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.yearProduction = yearProduction;
        this.foto = foto;
    }

    public Car() {
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(String yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", yearProduction=" + yearProduction +
                ", foto='" + foto + '\'' +
                '}';
    }
}
