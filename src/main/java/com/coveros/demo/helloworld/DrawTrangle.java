package com.coveros.demo.helloworld;

public class DrawTrangle {

   public  static void DrawMyTriangle (double cordinate1, double cordinate2, double cordinate3, double cordinate4){
        StdDraw.line(cordinate1, cordinate2, cordinate3, cordinate4);
        }

    public static void main(String[] args) {


        double t = Math.sqrt(3.0) / 2.0;

       DrawMyTriangle(1.0, 0.0, 0.5, t);
       DrawMyTriangle(1.0, 0, 0.0, 0.0);
       DrawMyTriangle(0.0,0.0,0.5,t);

      //  DrawMyTriangle(1.0, 0.2, 0.5, 0.0);
    //    DrawMyTriangle(1.0, 0.0, 0.5, t);
      //  DrawMyTriangle(0.5, t, 0.0, 0.0);

    }
}
