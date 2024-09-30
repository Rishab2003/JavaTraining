package digitalcomProcess;

import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String[] args) {

		boolean loop=true;
		while(loop) {
			System.out.println("ENter ur option");
			Scanner scan=new Scanner(System.in);
			
			System.out.println("1.RegisterUser");
			System.out.println("2.ViewGames");
			System.out.println("3.SearchByName");
			System.out.println("4.exit");
			
			switch (scan.nextInt()) {
			case 1: 
				{
					User user = new User();
					System.out.println("Enter UserId:");
					String userid=scan.next();
					System.out.println("Enter password");
					String password=scan.next();
					user.addUser(userid, password);
					break;
					
				
				}
			
			case 2:
				{
					GameService gameService=new GameService();
					gameService.viewAll().forEach(e->System.out.println(e.toString()));
					break;
					
				}
				
			case 3:
			{
				System.out.println("Enter name to search");
				String author=scan.next();
				GameService gameService=new GameService();
				String anString=gameService.authorSearch(author);
				System.out.println("The author of game is "+anString);
				break;
			}
			case 4:
			{	loop=false;
				break;
			}
			default:
				
				
			}
		}
		return;
	}
}
