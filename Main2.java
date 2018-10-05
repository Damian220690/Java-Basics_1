package b_Zadania_Domowe.a_Dzien_1;

//
//W pliku `Main2.java` umieść metodę o sygnaturze `static boolean divisibleBy(int a, int b )`:
//
//        1. Uzupełnij ciało metody tak aby zwracała `true` bądź `false` w zależności czy zmienna `a`
//        jest podzielna przez `b`.


public class Main2 {

    public static void main(String[] args) {
        System.out.println(divisibleBy(8,2));
    }

    private static boolean divisibleBy(int a, int b ){
        if(a % b == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
