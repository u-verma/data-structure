package com.org.easysolution.pattern;

public class DrawPattern {

    public static void main(String[] args) {

        for (int outerIndex = 0; outerIndex < 10 ; outerIndex++) {
            for(int innerIndex = outerIndex; innerIndex >=0 ; innerIndex--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int outerIndex = 10; outerIndex > 0  ; outerIndex--) {
            for(int innerIndex = outerIndex; innerIndex >=0 ; innerIndex--){
                System.out.print("*");
            }
            System.out.println();
        }

        int k =0;

        for (int outerIndex = 0; outerIndex < 5; outerIndex++, k =0 ) {
            
        }

    }
}
