package com.company;

public class FuncBigger {

    public static void main(){

    }
    public static void func(int [] arr1, int [] arr2) {
        int i,j;

        for (i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++) {

            Math.max(arr1[i], arr2[j]);

            try {
                Math.max(arr1[i], arr2[j]);
            } catch (ArithmeticException e) {
                System.out.println("Error");
            }catch (NullPointerException e){
                System.out.println("Error");
            }
        }
    }
}
