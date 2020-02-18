package homework15022020;

public class TwoInstanceVariable {

    // 2 instance variable declaration

        int a = 10;
        int b = 20;

    // instance method declaration

        public void twovariables() {

        System.out.println(a);
        System.out.println(b);

    }

    // main method declaration

        public static void main(String[] args) {

    //object creation for calling instance method in main method

        TwoInstanceVariable object = new TwoInstanceVariable();

    // using object to call instance method

        object.twovariables();
    }

}




