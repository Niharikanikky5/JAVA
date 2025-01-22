package OCT.ex18102024Strings_Wrapper;

public class Lab160_String_Functions {
    //equal
    public static void main(String[] args) {
        String s1 = "Hello"; //Scp
        String s4 = "Hello";//Scp
        String s2 = new String("Hello");//Object area
        String s3 = new String("Hello");
        String s5 = new String("hello");
        //  System.out.println(s1 == s2);
        // System.out.println(s2 == s3);
        // System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));




    }
}
