/*
                            Lunchtime
items = "FDFDFD", return 3
the first "FD" creates the first balanced meal.
the second "FD" creates the second balanced meal.
the third "FD" creates the third balanced meal.
 */



public class DevByte42 {

    public static  int lunchTime(String items) {

        int balancedMeal=0;
        int count =0;

        for (int i=0;i < items.length();i++){

            if (items.charAt(i)=='F') {
                count++;
            }
            else if (items.charAt(i)=='D') {
                count--;
            }

            if (count==0)
                 balancedMeal++;
        }

        return balancedMeal;
    }

    public static void main(String[] args){


        System.out.println(lunchTime("FDFFDFDD"));

    }


}
