package com.curso3.unidade5;

public class ThreadApp {
    public static void main(String[] args) {
        //objeto tipo anônimo que implementa Runnable
        Runnable r = new Runnable(){
            public void run(){
                for (int i = 0; i <= 1000000000; i++){
                    System.out.println(i);
                }
            }
        };
        Thread a = new Thread(r);
        a.start();   
    }
}
