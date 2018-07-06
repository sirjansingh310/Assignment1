package Assignment1;
class ABC{
    public void print(){
        System.out.println("In parent");
    }
}
class XYZ extends ABC{
    public void print() {
        System.out.println("In child");
    }
}
public class Problem7 {
    public static void main(String args[]){
        ABC parent = new ABC();
        XYZ child = new XYZ();
        parent.print();// normal
        child.print(); // normal
        /// Upcasting
        XYZ child1= new XYZ();
        ABC upCast = (ABC)child1;
        upCast.print();
        /// Downcasting
        ABC parent1 = new XYZ();
        XYZ downcastParent = (XYZ)parent1;
        downcastParent.print();



    }
}
