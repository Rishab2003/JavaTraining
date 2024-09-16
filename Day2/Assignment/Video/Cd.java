package Assignment.Video;

public class Cd extends MediaItem {

    private String Artist;
    private String genre;
    

    public Cd(int id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        Artist = artist;
        this.genre = genre;
    }

    @Override
    protected void addItem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addItem'");
    }

    @Override
    protected void checkOut() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkOut'");
    }

    @Override
    protected void CheckIn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CheckIn'");
    }
    
}
