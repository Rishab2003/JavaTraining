package Assignment.Video;

public class Video extends MediaItem {
    private String director;
    private String genre;
    private String year;
    public Video(int id, String title, int copies, int runtime, String director, String genre, String year) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.year = year;
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
