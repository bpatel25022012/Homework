package homework29022020;

public class No19Bank {
    public int getRateOfInterest() {
        return 0;
    }
}
//Creating child classes
class SBI extends No19Bank {
    public int getRateOfInterest() {
        return 8;
    }
}
class ICICI extends No19Bank {
    public int getRateOfInterest() {
        return 7;
    }
}
class AXIS extends No19Bank {
    public int getRateOfInterest() {
        return 9;
    }
}
//Test class to create objects and call the methods
class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }

}