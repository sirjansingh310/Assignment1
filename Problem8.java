package Assingment1Problem8;
class myclass
{
    private String s = "Private Member";
    public void printS(){
        System.out.println(s);
    }
    protected String s1 = "Protected member";
    String s2="Default member";
}

public class Problem8 {
    public static void main(String args[]){
      myclass p = new myclass();

      System.out.println(p.s);// private member, can only be accessed withing the class.
      p.printS(); // this is how  s can be printed... check printS() method in class "parentclass"
        System.out.println(p.s1);// protected member... can be accessed within the package
        Problem8inOtherPackage obj = new Problem8inOtherPackage();
        System.out.println(obj.s);// cant access protected member in other package
        System.out.println(p.s2);// default access from same package
        System.out.println(obj.s2);// can't be done .. default from other package

    }
}
