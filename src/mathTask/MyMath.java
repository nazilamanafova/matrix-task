package mathTask;

public class MyMath {

    static int factorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    static int power( int num , int quvvet ){
        int result = 1;
        for (int i = 1; i <= quvvet; i++) {
            result *= num;
        }
        return result;
    }

}
