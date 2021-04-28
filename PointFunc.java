package com.company;

import java.awt.*;

public class PointFunc {

    public static void main(){

    }
    public static void func(Point a, Point b){

        try{
            double sum = (a.x - b.x) / (a.y - b.y);
        }catch (NullPointerException e){
            System.out.println("Error");
        }catch (ArithmeticException e){
            System.out.println("Error");
        }

    }
}
