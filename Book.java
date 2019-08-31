public class Book implements SchoolLibrary
{
    // Instance Variables
    int pageNum;
    String author, bookName, ID; // ID: 0xy
    boolean hasLibCard, isFiction, isNonFiction;

    // Constructors
    public Book()
    {
        pageNum = 0;
        ID = "000";
        author = "Chris P. Bacon";
        bookName = "The Joys of Pig Farming";
        isFiction = false;
        isNonFiction = true;
    }

    public Book(int pageNum, String ID, String author, String bookName, boolean hasLibCard, boolean isFiction, boolean isNonFiction)
    {
        this.pageNum = pageNum;
        this.ID = ID;
        this.author = author;
        this.bookName = bookName;
        this.hasLibCard = hasLibCard;
        this.isFiction = isFiction;
        this.isNonFiction = isNonFiction;
    }

    // Setters & Getters
    public int getPageNum()
    {
        return pageNum;
    }
    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }

    public String getID()
    {
        return ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getBookName()
    {
        return bookName;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    // Brain Methods
    public void checkOut()
    {
        if (hasLibCard)
          System.out.println("Here's your book! Please return within 3 weeks time.");
        else 
          System.out.println("Sorry, but you need a library card to check this out.");
    }

    // toString
    public String toString()
    {
        return "~ Book ~" + "\nBook Name:" + bookName + "\nAuthor: " + author + "\nNumber Of Pages: " + pageNum +
        "\nID Number: " + ID + "\nFiction?: " + isFiction + "\nNon-Fiction?: " + isNonFiction + "\n\nValid Library Card?: " +
        hasLibCard;
    }
}
