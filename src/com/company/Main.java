package com.company;

public class Main {
    //GITHUB
    static int[] frst = new int[3];
    static double[] scnd = {1.57, 7.654, 9.986};
    static String[] thrd = {"Hello", "world"};

    public static void main(String[] args) {
        frst[0] = 1;
        frst[1] = 2;
        frst[2] = 3;
        task2(frst, scnd, thrd);
        task3(frst, scnd, thrd);
        task4(frst);
    }

    static void task2(int[] frst, double[] scnd, String[] thrd) {
        for(int i = 0; i < frst.length; i++) {
            if(i == frst.length-1) {
                System.out.print(frst[i] + "\n");
            } else {
                System.out.print(frst[i] + ", ");
            }
        }
        for(int i = 0; i < scnd.length; i++) {
            if(i == scnd.length-1) {
                System.out.print(scnd[i] + "\n");
            } else {
                System.out.print(scnd[i] + ", ");
            }
        }
        for(int i = 0; i < thrd.length; i++) {
            if(i == thrd.length-1) {
                System.out.print(thrd[i] + "\n");
            } else {
                System.out.print(thrd[i] + ", ");
            }
        }


    }
    static void task3(int[] frst, double[] scnd, String[] thrd) {
        for(int i = frst.length-1; i >=0; i--) {
            if(i == 0) {
                System.out.print(frst[i] + "\n");
            } else {
                System.out.print(frst[i] + ", ");
            }
        }
        for(int i = scnd.length-1; i >=0; i--) {
            if(i == 0) {
                System.out.print(scnd[i] + "\n");
            } else {
                System.out.print(scnd[i] + ", ");
            }
        }
        for(int i = thrd.length-1; i >=0; i--) {
            if(i == 0) {
                System.out.print(thrd[i] + "\n");
            } else {
                System.out.print(thrd[i] + ", ");
            }
        }
    }
    static void task4(int[] frst) {
        for(int i = 0; i < frst.length; i++) {
            if (frst[i]%2!=0) {
                frst[i] = frst[i] + 1;
            }
            System.out.println(frst[i]);
        }
    }

}
