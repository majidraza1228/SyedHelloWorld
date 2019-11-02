package com.coveros.demo.helloworld;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        int index =1;
        int occurCount =1;
        int[] k={elements.length};


        for ( int i=0; i< elements.length-1;i++){
            if ( elements[i] != elements[index+1]) {
                  k[i]=elements[i];
                  index++;
            } else {
            if ( occurCount!=maxOccurrences)  {
                k[i] =elements[i];
                occurCount++;
                index++;
            }  else {
                occurCount=1;
            }
            }

        }

        return  k;
    }

    public   static void main (String  args[]) {

        EnoughIsEnough objClass = new EnoughIsEnough();
/*
        int a[] ={1,1,2,2,3,4};
        int c[] = objClass.deleteNth(a,2);

        for ( int j =0; j<c.length-1;j++){
            System.out.println(c[j]);
        }

 */
    }

}