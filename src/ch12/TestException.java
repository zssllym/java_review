package ch12;

public class TestException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            System.out.println("Main: Catched Exception!");
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception{
        try {
            method2();
        } catch (Exception ex) {
            System.out.println("method1: Catched Exception!");
            throw ex;
        }
    }
    public static void method2() throws Exception{
        throw new Exception("Exception in method2");
    }
}
