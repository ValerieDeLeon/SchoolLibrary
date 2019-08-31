class SchoolLibraryDriver {
  public static void main(String[] args)
   {
     Book harrypotter = new Book(357, "092", "Hardcover", "J.K. Rolling", true, true, false);
     Textbook apchem = new Textbook("AP Chemistry", "Chemistry", true, false, "138");
     Textbook history = new Textbook("World History", "Social Studies", false, false, "122");
     Staff msWordsmith = new Staff("501", false);

     SchoolLibrary[] fullStory = {harrypotter, apchem, history};
     for (SchoolLibrary i : fullStory)
     {
        System.out.println(i);
     }

     System.out.println(msWordsmith);
     msWordsmith.setStaffID("500");
     System.out.println("\n*New* Staff ID: " + msWordsmith.getStaffID() + "\n");
     msWordsmith.workOrHome();
     System.out.println("\n" + msWordsmith);
   } // end main method
} // end class SchoolLibraryDriver
