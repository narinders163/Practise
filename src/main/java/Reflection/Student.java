package Reflection;

public class Student {
    private double age;
    private double roll_no;
    public Student()
    {
        System.out.println("In default constructor");
    }
    public Student(double i , double j)
    {
        age = i;
        roll_no = j;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(double roll_no) {
        this.roll_no = roll_no;
    }
}
