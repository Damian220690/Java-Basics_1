package b_Zadania_Domowe.a_Dzien_1;

//W pliku `Main1.java` umieść metodę o sygnaturze `static double dogAge(double dogAge)` , która przeliczy wiek psa w psich
//        latach.
//
//        * funkcja powinna przyjmować wiek psa jako parametr,
//        * dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
//        * powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//        * funkcja powinna zwrócić wiek psa.


public class Main1 {

    public static void main(String[] args) {
        System.out.println(dogAge(1.5));
    }

    private static double dogAge(double dogAge){
        double age;
        if(dogAge <= 2 && dogAge > 0){
            age = dogAge * 10.5;
            return age;
        }
        else if(dogAge < 0){
            System.out.println("It's wrong value!!!");
            return 0;
        }
        else{
            age = 2 * 10.5 + (dogAge - 2) * 4;
            return age;
        }
    }

}
