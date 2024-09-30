package digitalcomProcess;


public class Game {

	private String gameName;
	private String authorName;
	private float price;
	public String getGameNameString() {
		return gameName;
	}
	public void setGameNameString(String gameNameString) {
		this.gameName = gameNameString;
	}
	public String getAuthorNameString() {
		return authorName;
	}
	public void setAuthorNameString(String authorNameString) {
		this.authorName = authorNameString;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Game(String gameNameString, String authorNameString, float price) {
		super();
		this.gameName = gameNameString;
		this.authorName = authorNameString;
		this.price = price;
	}
	@Override
	public String toString() {
		return "gameName=" + gameName + ", authorName=" + authorName + ", price=" + price;
	}
	
	
}
