package com.coveros.demo.helloworld;

public class Swapper {
    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }


    public static void main(String[] str){

        Integer[] args = new Integer[]{1,2};

        Swapper r= new Swapper(args);
        r.swapValues();
        System.out.print(args[1]);

    }


}
