public class HelloFromCity {

    public static String sayHello(String [] name, String city, String state){
        //code here
        String HelloString = new String();
        String nameString =  new String();

        for (String s:name)
            nameString =nameString+s+" ";

        HelloString= "Hello, "+nameString.trim()+"! Welcome to "+city+", "+state+"!";
        return HelloString ;
    }

    public static void main(String[] args){

        String[] name = {"John", "Smith"};
        String abc;


        System.out.print(sayHello(name,"Monroe","NJ"));

        /*
        expected:<...llo, Franklin Delano[ Roosevelt]! Welcome to Chicago...> but was:<...llo, Franklin Delano[]! Welcome to Chicago...>
         */
    }

}
