package homework15022020;

public class TwoInstanceTwoStatic {

    // declaration of 2 instance and 2 static variable
        int a = 10; // instance variable
        int b = 20; // instance variable


        static int c = 30; // static variable
        static int d = 40; // static variable

    // instance method creation

        public void instance() {
    // calling 2 instance variable to instance method

        System.out.println(a);
        System.out.println(b);

    // calling 2 static variable to instance method
        System.out.println(TwoInstanceTwoStatic.c);
        System.out.println(TwoInstanceTwoStatic.d);


    }

        public static void sta() {

    // object creation to call instance variable to static method

        TwoInstanceTwoStatic object = new TwoInstanceTwoStatic();

        System.out.println(object.a);
        System.out.println(object.b);

    // calling 2 static variable to static method

        System.out.println(c);
        System.out.println(d);


    }
    // declaration of main method

        public static void main(String[] args) {

    // calling static method to main  method

        sta();

    // object creation to call instance method to main mehtod

        TwoInstanceTwoStatic object1 = new TwoInstanceTwoStatic();

    // Calling instance method to main method

        object1.instance();


    }


}
