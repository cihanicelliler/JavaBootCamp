package abstracts;

import entities.Campaign;
import entities.Game;
import entities.GameSale;
import entities.User;

public interface GameSaleService {
	void sellGameWithCampaign(Game game,User user,Campaign campaign,GameSale gamesale);
	void sellGameWithOutCampaign(Game game,User user,GameSale gamesale);
}
