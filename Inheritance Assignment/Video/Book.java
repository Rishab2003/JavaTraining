package Assignment.Video;

import java.util.ArrayList;

public class Book extends WrittenItem {
    
    
    public Book(int id, String title, int copies, String author) {
        super(id, title, copies, author);
        //TODO Auto-generated constructor stub
    }

    

   
    protected void  checkOut() {
        this.setCopies(getCopies()-1);
    }

    protected void CheckIn() {
       this.setCopies(getCopies()+1);
    }


    @Override
    public String toString() {
        return "Book []";
    }

    

}
