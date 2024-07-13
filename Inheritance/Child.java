package Inheritance;

public class Child  extends Parent{
    public Child(int age,String name) {
        super(age,name);
        this.age=age;
    }
    String age(){
        return "the age is 22";
    }
}
