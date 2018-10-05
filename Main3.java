package b_Zadania_Domowe.a_Dzien_1;

//W pliku `Main3.java` umieść metodę o sygnaturze `static int[] minimum(int[][] arr)`.
//
//        1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej dla każdego jej wiersza
//        wyznaczyła minimalną wartość.
//        2. Poszczególne minimalne wartości mają być umieszczone w tablicy, którą metoda zwraca.

public class Main3 {

    public static void main(String[] args) {
        minimum(new int[2][3]);
    }

    private static int[] minimum(int[][] arr){
        int minValueInRow;

        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length; j++){
                minValueInRow = arr[i][j];
            }
        }
       return arr[0];
    }
}
