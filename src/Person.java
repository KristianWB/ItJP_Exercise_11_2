public class Person {

    // Defining variables

    String name;
    String address;
    String phoneNumber;
    String email;

    // Constructing a default person
    Person()   {
        name = "John Doe";
        address = "#null#";
        phoneNumber = "#null#";
        email = "#null#";
    }

    // Constructing a defined person
    person(String newName, String newAddress, String newPhoneNumber, String newEmail)   {
        name = newName;
        address = newAddress;
        phoneNumber = newPhoneNumber;
        email = newEmail;
    }
}


