package homework22022020;

public class Person {
    // main method declaration

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    // declaration of variable
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // declaration of user define method

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    // declaration of user define method

    public void setLastName(String lname) {

        this.lastName = lname;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    // declaration of user define method
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {

        // if statement for last name and firstname

        if (lastName.isEmpty()) {
            this.lastName = firstName;
            return this.lastName;
        }
        if (firstName.isEmpty()) {
            this.firstName = lastName;
            return this.firstName;
        }
        return firstName + " " + lastName;
    }

}