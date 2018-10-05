package b_Zadania_Domowe.a_Dzien_1;

//W pliku `Main5.java` umieść metodę o sygnaturze `static int[] append(int[] arr)`.
//
//1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy,
// której rozmiar ma być 2-krotnie większy od tablicy podanej.
//2. Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
//3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
//Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1}

import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(append(arr)));
    }

    private static int[] append(int[] arr){
        int arrTmpSize = arr.length * 2;
        int  tmpCounter = arr.length;
        int[] arrTmp = Arrays.copyOf(arr, arrTmpSize);

        for(int i = arr.length - 1; i >= 0; i--){
            arrTmp[tmpCounter] = arr[i];
            tmpCounter++;
        }
        return arrTmp;
    }
}
