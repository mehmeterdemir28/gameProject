package concretes;

import Abstract.CampaignService;
import entities.Campaign;


public class CampaignManager implements CampaignService {

	@Override

	public void add(Campaign campaign) {
		System.out.println(
				campaign.getCampaignName() + " Adl� kampanyam�z ba�lam��t�r. Oyun fiyatlar�n� kontrol ediniz.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub

	}

}
