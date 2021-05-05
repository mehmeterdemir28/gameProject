package Abstract;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface GameService {

	
	
	void buy(Game game, Gamer gamer, Campaign campaign);

	void sell(Game game);

	void returnGame(Game game);
	
	void addGame(Game game);
	
	void deleteGame(Game game);
	
	void update(Game game);
	
	void buy(Game game, Gamer gamer);
	
	
}
