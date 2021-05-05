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

		System.out.println(gamer.getName() + " " + game.getGameName() + " Adlý oyun baþarýyla satýn alýndý .");

	}

	@Override
	public void returnGame(Game game) {

		System.out.println(game.getGameName() + " Adlý oyun baþarýyla iade edildi.");
	}

	@Override
	public void sell(Game game) {

		System.out.println(game.getGameName() + " Adlý oyun baþarýyla satýldý.");
	}

	@Override
	public void addGame(Game game) {

		System.out.println(game.getGameName() + " Adlý oyun pazara baþarýyla eklendi.");

	}

	@Override
	public void deleteGame(Game game) {

		System.out.println(game.getGameName() + " Adlý oyun baþarýyla pazardan kaldýrýldý.");
	}

	@Override
	public void update(Game game) {

		System.out.println(game.getGameName() + " Adlý oyun bilgileri baþarýyla güncellendi.");
	}

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getName() + " " + game.getGameName() + " Adlý oyun baþarýyla satýn alýnmýþtýr.");

	}

}
