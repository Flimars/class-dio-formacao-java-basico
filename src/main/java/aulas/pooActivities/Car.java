package aulas.pooActivities;
/*
* Crie uma classe carro. Nessa classe você deverá ter a quantidade de pessoas ter a de
* pessoas que estão dentro do carro. E também é preciso que tenha uma forma de adicionar e remover
* pessoas de dentro do carro.
* */

public class Car {
    private String brand;
    private String model;
    private String variant;
    private int year;
    private int numberPassengers;

    public Car(){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.variant = variant;
    }
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        variant = variant;
    }


    public void doorExit(){
        if (this.numberPassengers > 0 && this.numberPassengers < 5)
            this.numberPassengers -= 1;
    }
    public void doorExit(int numberPassengers){
        if (this.numberPassengers > 0 && this.numberPassengers < 3)
            this.numberPassengers = numberPassengers;
    }

    public void doorIn(){
        if (this.numberPassengers >= 0)
            this.numberPassengers += 1;
    }

    public void doorIn(int numberPassengers){
        if (this.numberPassengers >= 0)
            this.numberPassengers = numberPassengers;
    }

    public int getNumberPassengers(){
        return this.numberPassengers;
    }
}
