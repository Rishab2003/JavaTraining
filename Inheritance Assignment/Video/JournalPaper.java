package Assignment.Video;

public class JournalPaper extends WrittenItem {
    private int yearOfPub;

    

    public JournalPaper(int id, String title, int copies, String author, int yearOfPub) {
        super(id, title, copies, author);
        this.yearOfPub = yearOfPub;
    }


    @Override
    protected void checkOut() {
        this.setCopies(getCopies()-1);
    }

    @Override
    protected void CheckIn() {
        this.setCopies(getCopies()+1);
    }

}
