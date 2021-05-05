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
			System.out.println(gamer.getName() + " Adl� ki�i ba�ar�yla kay�t oldu. ");

		} else {
			System.err.println(gamer.getName() + " Adl� ki�i do�rulanamad�.");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() + " Adl� ki�i sistemden silindi.");
	}

	@Override
	public void update(Gamer gamer) {

		System.out.println(gamer.getName() + " Adl� ki�i bilgilerini g�ncelledi");

	}

}
