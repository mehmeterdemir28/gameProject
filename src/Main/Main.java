package Main;

import java.util.Calendar;

import Adapter.MernisServiceAdapter;
import concretes.GameManager;
import concretes.GamerCheckManager;
import concretes.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		

		Calendar releaseDate = Calendar.getInstance();
		releaseDate.set(2005, 2, 16);

		Gamer gamer = new Gamer(1, "Mehmet", "Erdemir", releaseDate, "94219849212");

		Game game = new Game(14, "Half life", "Aksiyon,Macera ", 18);
		
		Campaign campaign =new Campaign(2, "Sonbahar", 20);

		GameManager gameManager = new GameManager();
		GamerManager gamerManager =new GamerManager(new MernisServiceAdapter());
		
		
		gameManager.buy(game,gamer, campaign);
		gameManager.sell(game);
		gameManager.returnGame(game);
		gameManager.addGame(game);
		gameManager.deleteGame(game);
		gameManager.update(game);
		
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
	}

}
