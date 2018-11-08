public class Employee extends Student {
    String office;
    double salary;
    String currentDate;
    MyDate date = new MyDate();

    Employee()   {
        office = "#null#";
        salary = 0;
        currentDate = "" + date.getDay() + ":" + date.getMonth() + ":" + date.getYear();
    }

    Employee(String newOffice, int newSalary)   {
        office = newOffice;
        salary = newSalary;
        currentDate = date.getDay() + ":" + date.getMonth() + ":" + date.getYear();
    }
}
