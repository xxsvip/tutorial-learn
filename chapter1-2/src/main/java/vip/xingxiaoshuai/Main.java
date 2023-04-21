package vip.xingxiaoshuai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        demo();
//        demo2();
//        demo3();
//        demo4();
        demo5();
    }



    private static  void demo(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if("a".equals(word)){
                words.remove(word);
            }
        }
    }

    private static  void demo2(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (String word: words) {
            if("a".equals(word)){
                words.remove(word);
            }
        }
        System.out.println(words);
    }

    private static  void demo3(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if("a".equals(word)){
                iterator.remove();  //not words.remove
            }
        }
    }

    private static  void demo4(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        words.forEach(word ->{
            if("a".equals(word)){
                words.remove(word);
            }
        });
    }

    private static  void demo5(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        words.removeIf(word -> "a".equals(word));
        System.out.println(words);
    }

}