import java.lang.Math.*;

public class Person{
    private String name;
    private int age;
    private double xcoord;
    private double ycoord;

    public Person(String _name, int _age, double _xcoord, double _ycoord){
        this.name = _name;
        this.age = _age;
        this.xcoord = _xcoord;
        this.ycoord = _ycoord;
    }

    public String toString(){
        return this.name + ", " + this.age + ", is at (" + xcoord + ", " + ycoord + ")";
    }

    public void setName(String _name){
        this.name = _name;
    }

    public void setAge(int _age){
        this.age = _age;
    }

    public void setXcoord(double _xcoord){
        this.xcoord = _xcoord;
    }

    public void setYcoord(double _ycoord){
        this.ycoord = _ycoord;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getXcoord(){
        return this.xcoord;
    }

    public double getYcoord(){
        return this.ycoord;
    }

    public double distanceTo(Person other){
        double xcoordDiff = this.xcoord > other.xcoord ? this.xcoord - other.xcoord : other.xcoord - this.xcoord;
        double ycoordDiff = this.ycoord > other.ycoord ? this.ycoord - other.ycoord : other.ycoord - this.ycoord;
        return Math.pow(Math.pow(xcoordDiff, 2) + Math.pow(ycoordDiff, 2), 0.5);
    }
}