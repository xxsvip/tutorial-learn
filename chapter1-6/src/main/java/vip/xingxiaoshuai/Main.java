package vip.xingxiaoshuai;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        demo1();
//        Character b = demo2().orElse('b');
//        System.out.println(b);

    }


    private static Character demo1() {
        String name = null;

        if(name == null){
            return null;
        }
        return name.charAt(0);
    }

    private static Optional<Character> demo2() {
        String name = "xxs";

        if(name == null){
            return Optional.empty();
        }
        return Optional.of(name.charAt(0));
    }


}