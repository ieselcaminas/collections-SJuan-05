package InterfazComparable;

public class Human implements Comparable<Human>{
    private String name;
    private double salary;

    public Human(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return this.name + " - " + this.salary;
    }
    @Override
    public int compareTo(Human  other){
        return Double.compare(other.getSalary(), this.getSalary());
    }
}
