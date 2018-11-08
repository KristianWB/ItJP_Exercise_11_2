public class Faculty extends Employee{

    // Declaring essential variables
    int officeHours;
    int rank;

    Faculty()   {
        officeHours = 0;
        rank = 0;
    }

    Faculty(int newOfficeHours, int newRank)   {
        officeHours = newOfficeHours;
        rank = newRank;
    }
}
