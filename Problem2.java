package Assignment1;
// Method overloading and Method overriding
class A {
    String s = "";
    A(){

    }
    A(String s){
        this.s = s;
        System.out.println(s);
    }
    String name = "Parent Class";
    public void getClassType(){
        System.out.println(name);
    }
}
class B extends A{
    int x ;
    B() {
        super("Calling parent constructor from child class");
    }
    String name = "Child Class";
    public void getClassType(){
        System.out.println(name);
    }
    public int getLength(int x){
        int count = 0;
        while(x>0){
            x = x/10;
            count++;
        }
        return count;

    }

    public int getLength(String s){
        return s.length();
    }


}
public class Problem2 {
    public static void main(String args[]){
      A a = new A();
      B b = new B();
      a.getClassType();// Method Overriding
      b.getClassType();
      System.out.println(b.getLength(112));
      System.out.println(b.getLength("Hello"));
    }
}
