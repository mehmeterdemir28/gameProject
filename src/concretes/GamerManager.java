package concretes;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {

		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {

		if (this.gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getName() + " Adlý kiþi baþarýyla kayýt oldu. ");

		} else {
			System.err.println(gamer.getName() + " Adlý kiþi doðrulanamadý.");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() + " Adlý kiþi sistemden silindi.");
	}

	@Override
	public void update(Gamer gamer) {

		System.out.println(gamer.getName() + " Adlý kiþi bilgilerini güncelledi");

	}

}
