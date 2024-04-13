package ch9;

public class TestClassInit {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            System.out.println("Test 1");
            System.out.println("Name:" + s1.name);
            System.out.println("Age:" + s1.age);
            System.out.println("Is Science Major:" + s1.isScienceMajor);
            System.out.println("Gender:" + s1.gender);
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }

        // {
        //     String name;
        //     int age;
        //     boolean isScienceMajor;
        //     char gender;
        //     try {
        //         System.out.println("Test 2");
        //         System.out.println("Name:" + name);
        //         System.out.println("Age:" + age);
        //         System.out.println("Is Science Major:" + isScienceMajor);
        //         System.out.println("Gender:" + gender);
        //     } catch (Exception e) {
        //         System.out.println("Exception:" + e);
        //     }
        // }
    }
}

class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
    static int count;
}
