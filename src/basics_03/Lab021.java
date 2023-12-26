package src.basics_03;

public class Lab021 {
    public static void main(String[] args){
        //Interview Question
        System.out.println(10 == 10);
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);

        //Character in System.out.println are always integer
        System.out.println("-------");

        System.out.println('A' == 65); //ASCII Value

        byte b = 65;
        System.out.println('A' == b);
        System.out.println('A' == 65.0); //This is a property of java

        System.out.println('A' == 65.0f);
        //between boolean there is no comparison operator
    }
}
