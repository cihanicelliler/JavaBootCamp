package concretes;

import abstracts.GameSaleService;
import entities.Campaign;
import entities.Game;
import entities.GameSale;
import entities.User;

public class GameSaleManager implements GameSaleService{

	@Override
	public void sellGameWithCampaign(Game game, User user, Campaign campaign, GameSale gamesale) {
		System.out.println("The sale was made. "+user.getFirstName()+" "+user.getLastName()+", "+game.getGameName()+" /"+gamesale.getAmountOfPayment(game,campaign)+" /"+campaign.getCampaignName());
		
	}

	@Override
	public void sellGameWithOutCampaign(Game game, User user, GameSale gamesale) {
		System.out.println("The sale was made. "+user.getFirstName()+" "+user.getLastName()+","+game.getGameName()+" /"+gamesale.getTotalAmount(game)+" /without campaign");
		
	}

}
