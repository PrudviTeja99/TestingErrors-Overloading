
class Hello{
    void test(Exception e){
        System.out.println("Exception");
    }
    void test(ArithmeticException ae){
        System.out.println("Arithmetic Exception");
    }void test(Object o){
        System.out.println("Object");
    }

}

public class Main {
    public static void main(String[] args) {
        Hello h=new Hello();
        h.test(null);
    }
}
