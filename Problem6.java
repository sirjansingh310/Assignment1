package Assignment1;
class ParentClass{
    public void print(){
        System.out.println("In parent class");
    }
}
class ChildClass extends ParentClass{
    public void print() {
        System.out.println("In Child class");
    }
}
public class Problem6 {
    public static void main(String args[]){
        ParentClass parent = new ParentClass();
        ParentClass child  = new ChildClass();
        parent.print();
        child.print(); //Dynamic Binding.
    }
}
