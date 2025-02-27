import java.util.*;
public class Library
{
    private ArrayList<Book> bookList=new ArrayList<Book>();
    
    public void setBookList(ArrayList<Book> bookList)
    {
        this.bookList=bookList;
    }
    
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    
    public void addBook(Book bobj)
    {
        bookList.add(bobj);
    }
    
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    
    public ArrayList<Book> viewAllBooks()
    {
        return bookList;
    }
    
    public ArrayList<Book> viewBooksByAuthor(String author)
    {
        ArrayList<Book> result=new ArrayList<Book>();
        Iterator it=bookList.iterator();
        while(it.hasNext()){
            Book b=(Book)it.next();
            if(b.getAuthor().equalsIgnoreCase(author))
                result.add(b);
        }
        return result;
    }
    
    public int countnoofbook(String bname){
        int count=0;
        Iterator it=bookList.iterator();
        while(it.hasNext()){
            Book b=(Book)it.next();
            if(b.getBookName().equalsIgnoreCase(bname))
                count++;
        }
        return count;
    }
}