package com.myblog.blog.controller.vo;



class A {
    volatile int a=0;
    int b=0;

    int c=0;
    public synchronized void addC(){
        c++;
    }
    public synchronized int getC(){
       int i=c;
       return i;
    }
    public void update(){
        for(;;){
            int c=a+1;
            if(c==a+1){
                a=c;
                return ;
            }
        }
    }
}

public class Main {


    public static void main(String[] args) {
      A a=new A();
        System.out.println(a.a);

//        for (int i = 0; i <20 ; i++) {
//            new Thread(()->{
//                for (int j = 0; j < 1000; j++) {
//                    a.update();
//                }
//            },String.valueOf(i)).start();
//        }
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(a.a);

        new Thread(()->{
            for (int j = 0; j < 1000;) {
                System.out.println(a.getC());
            }
        },String.valueOf(1)).start();
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a.addC();
        },String.valueOf(2)).start();
    }

}
