package b_Zadania_Domowe.a_Dzien_1;

//W pliku `Main6.java` umieść metodę o sygnaturze `static int evenSum(int[][] arr)`.
//
//1. Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów z nieparzystych indeksów.
//2. Metoda ma zwrócić sumę.
//Przykład: dla tablicy int arr[][] = {{1,2,3},{4,5,6}}; int sum = 2 + 5;

public class Main6 {

    public static void main(String[] args) {
        int[][] someArrays = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}, {5, 4, 3}};
        System.out.println(
                "Sum of odd indexes = " + evenSum(someArrays));
    }

    private static int evenSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
