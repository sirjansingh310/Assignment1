package Assignment1;
abstract class abt{
    public abstract int returnTimesFive(int x);

}
interface infA{
  public int returnTimesTwo(int x);
}
interface infB{
    public int returnTimesTen(int x);
}
class Demo extends abt implements infA,infB {
    public int returnTimesTwo(int x){
        return x*2;
    }
    public int returnTimesTen(int x){
        return x*10;
    }
    public int returnTimesFive(int x){
        return x*5;
    }
}
public class Problem5 {
    public static void main(String args[]){
        Demo d = new Demo();
        System.out.println(d.returnTimesTwo(3));
        System.out.println(d.returnTimesTen(3));
        System.out.println(d.returnTimesFive(3));
    }
}

