package digitalcomProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameService {

	private static ArrayList<Game> games;
	
	public GameService() {
		// TODO Auto-generated constructor stub
		games=new ArrayList<>();
		games.add(new Game("SnowBird","Danny",300));
		games.add(new Game("FreshFood","Ram",450));
		games.add(new Game("Batsman","Kate",400));
		games.add(new Game("Pokiman","Steeve",600));
		games.add(new Game("YammyTommy","Narayan",350));
		
	}
	
	public  ArrayList<Game> viewAll(){
		return this.games;
	}
	
	public String authorSearch(String author) {
		
		Optional<Game> g=this.games.stream().filter(game->game.getAuthorNameString().equals(author))
		.findFirst();
		
		if(g.isPresent()) {
			return g.get().getGameNameString();
		}
		else {
			return "not found";
		}
	}
}
