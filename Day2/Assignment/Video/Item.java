package Assignment.Video;

public abstract class Item {

    private int id;
    private String title;
    private int copies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public Item(int id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    abstract protected void addItem();
    abstract protected void checkOut();
    abstract protected void CheckIn();
    
   
}
