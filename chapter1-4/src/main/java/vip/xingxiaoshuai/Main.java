package vip.xingxiaoshuai;

public class Main {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }



    private static boolean demo1(){
        var bool = "a".equals("A");

        if(bool == true){
            return true;
        }

        if(bool == false){
            return false;
        }

        return false;
    }

    private static boolean demo2(){
        var bool = "a".equals("A");

        if(bool){
            return true;
        }

        if(!bool){
            return false;
        }

        return false;
    }


    private static boolean demo3(){
        return  "a".equals("A");
    }

    private static String ternary1(int age){
        if(age >= 18){
            return "Adult";
        }else {
            return "Child";
        }
    }


    private static String ternary2(int age){
        return age >= 18 ? "Adult" : "Child";
    }



}