public class Textbook implements SchoolLibrary
{
    // Instance Variables
    String bookName, subject, ID;
    boolean hasLibCard, advanced, hasContact;

    // Constructors
    public Textbook()
    {
        bookName = "Reading & Reading";
        subject = "English";
        advanced = false;
        hasContact = false;
        ID = "100";
    }

    public Textbook(String bookName, String subject, boolean advanced, boolean hasContact, String ID)
    {
        this.bookName = bookName;
        this.subject = subject;
        this.advanced = advanced;
        this.hasContact = hasContact;
        this.ID = ID;
    }

    // Setters & Getters
    public String getBookName()
    {
        return bookName;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public boolean getAdvanced() 
    { 
      return advanced; 
    }
    public void setAdvanced(boolean advanced) 
    { 
      this.advanced = advanced; 
    }

    public boolean getHasContact()
    {
       return hasContact; 
    }
    public void setHasContact(boolean hasContact) 
    { 
      this.hasContact = hasContact; 
    }

    public String getID()
    {
        return ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }

    // Brain Methods
    public void checkOut()
    {
        if (advanced && hasContact)
          System.out.println("Don't stress! You'll get through.");
        else if (advanced && hasContact == false)
          System.out.println("I'm sorry, but you'll need a contact to check out this textbook");
    }

    // toString
    public String toString()
    {
      //  int ID = 0;
        return "~ TextBook ~" + "\nBook Name: " + bookName + "\nSubject: " + subject +
        "\nID Number: " + ID + "\nAP Or Honors Textbook?: " + advanced + "\n\nValid Library Card?: " + hasLibCard +
        "\nAP & Honors Contact?: " + hasContact;
    }
}
