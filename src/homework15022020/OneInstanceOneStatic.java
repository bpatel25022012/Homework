package homework15022020;

public class OneInstanceOneStatic {

    // Declaration on Instance and Static Variable

    int a = 15;
    static int b = 30;

    // Instance method declaration

        public void instance() {

    // calling instance variable to instance method

        System.out.println(a);

    // calling static variable to instance method

        System.out.println(OneInstanceOneStatic.b);
    }
    // static method declaration

        public static void sta(){

    // Object creation to call instance variable to static method

        OneInstanceOneStatic object = new OneInstanceOneStatic();

    // calling instance variable to static method

        System.out.println(object.a);

    // calling static variable to static method

        System.out.println(b);

        }

        public static void main(String[] args) {

    // calling static method to main method
        sta();

        OneInstanceOneStatic object1 = new OneInstanceOneStatic();

    // calling instance method to main method

        object1.instance();



    }


    }











