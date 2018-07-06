package Assignment1;
class Student{

    public String toString(){
        return "We are in Student class. Overriding toString() method";
    }
}
public class Problem4 {
    public static void main(String args[]){
        Object o = new Object();
        System.out.println(o.getClass());
        Student s = new Student();
        System.out.println(s.getClass());
        System.out.println(s.toString());
    }
}

