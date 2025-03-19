package com.startsteps;

public class StaticStuff {
        public static final int A = 5;
        public static final int B;//note that it is not   public static final int B = null;
    // note that since B is final, it can be initialized only once.
        //Static initializer block, which is executed only once when the class is loaded.
        static {
            if(A == 5)
                B = 10; else
                B = 5; }
        public StaticStuff(){} //constructor is called only after static initializer block }
}

  class Test{
    public static void main(String[] args) {
        System.out.println("A =" + StaticStuff.A + ", B =" + StaticStuff.B);    }
}