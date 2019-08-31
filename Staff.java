public class Staff
{
    // Instance Variables
    String staffID;
    boolean hasWork;

    // Constructors
    public Staff (String staffID, boolean hasWork)
    {
        this.staffID = staffID;
        this.hasWork = hasWork;
    }

    // Getters & Getters
    public String getStaffID()
    {
      return staffID;
    }
    public void setStaffID(String staffID)
    {
      this.staffID = staffID;
    }

    // Brain Methods
    public void workOrHome()
    {
      if (hasWork)
        System.out.println("Don't forget to sort the books!");
      else if (!hasWork)
        System.out.println("Alright have a good day!");
    }

    // toString
    public String toString()
    {
        return "=+ Staff Member +=" + "\nStaff ID Number: " + staffID + "\nGot work?: " + hasWork;
    }

}
