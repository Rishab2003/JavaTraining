package Assignment.Video;

public abstract class WrittenItem extends Item{

    private String author;

    public WrittenItem(int id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    @Override
    protected void CheckIn() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void addItem() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void checkOut() {
        // TODO Auto-generated method stub
        
    }

    
    

    

    
    
}
