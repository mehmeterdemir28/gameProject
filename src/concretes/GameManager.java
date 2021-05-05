package concretes;

import Abstract.GameService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void buy(Game game, Gamer gamer, Campaign campaign) {

		double indirimTutari = 100 - campaign.getDiscount();

		double fiyat = indirimTutari * game.getPrice() / 100;

		System.out.println(fiyat);

		System.out.println(gamer.getName() + " " + game.getGameName() + " Adl� oyun ba�ar�yla sat�n al�nd� .");

	}

	@Override
	public void returnGame(Game game) {

		System.out.println(game.getGameName() + " Adl� oyun ba�ar�yla iade edildi.");
	}

	@Override
	public void sell(Game game) {

		System.out.println(game.getGameName() + " Adl� oyun ba�ar�yla sat�ld�.");
	}

	@Override
	public void addGame(Game game) {

		System.out.println(game.getGameName() + " Adl� oyun pazara ba�ar�yla eklendi.");

	}

	@Override
	public void deleteGame(Game game) {

		System.out.println(game.getGameName() + " Adl� oyun ba�ar�yla pazardan kald�r�ld�.");
	}

	@Override
	public void update(Game game) {

		System.out.println(game.getGameName() + " Adl� oyun bilgileri ba�ar�yla g�ncellendi.");
	}

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getName() + " " + game.getGameName() + " Adl� oyun ba�ar�yla sat�n al�nm��t�r.");

	}

}
