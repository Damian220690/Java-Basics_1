package b_Zadania_Domowe.a_Dzien_1;

//W pliku `Main4.java` umieść metodę o sygnaturze `static int[] lessMore(int[][] arr)`.
//
//1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej obliczyć średnią arytmetyczną.
//2. Oblicz ile elementów jest mniejszych a ile większych od średniej.
//3. Metoda ma zwrócić tablicę składającą się z 2 elementów 1 - ilość elementów mniejszych od średniej,
// 2- ilość elementów większych.

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[][] someArray = {{2,2,2},{3,3,3},{4,4,4,6}};
        System.out.println(Arrays.toString(lessMore(someArray)));
    }

    private static int[] lessMore(int[][] arr){
        int sum = 0;
        double numberOfElements = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
                numberOfElements++;
            }
        }
        int[] lowerOrHigher = new int[2];

        double arithmeticAverage = sum/numberOfElements;
        int higherThanAve = 0;
        int lowerThanAve = 0;
        System.out.println("arithmetic average: " + arithmeticAverage);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > arithmeticAverage){
                    higherThanAve++;
                }
                else{
                    lowerThanAve++;
                }
            }
            lowerOrHigher[0] = higherThanAve;
            lowerOrHigher[1] = lowerThanAve;
        }
        System.out.println("Higher than average: "+ lowerOrHigher[0]);
        System.out.println("Lower than average: "+ lowerOrHigher[1]);
        return lowerOrHigher;

    }


}
