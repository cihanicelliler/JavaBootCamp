import java.time.LocalDate;

import adapter.MernisCheckAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GameSaleManager;
import concretes.OrderManager;
import concretes.UserManager;
import entities.Campaign;
import entities.Game;
import entities.GameSale;
import entities.User;

public class Main {

	public static void main(String[] args) throws Exception {
		User user = new User(1, "CÝHAN", "ÝÇELLÝLER", LocalDate.of(2001, 10, 27), "11111111111");
		Game game = new Game(1, "CoD", 125);
		Campaign campaign = new Campaign(1, "Winter Campaign", 10); 
		GameSale sale = new GameSale(1, 1, 1, 1, 1);

		UserManager userManager = new UserManager(new MernisCheckAdapter());
		userManager.Add(user);
		userManager.Delete(user);
		userManager.Update(user);

		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);

		OrderManager orderManager = new OrderManager();
		orderManager.add(sale);
		orderManager.delete(sale);
		orderManager.update(sale);

		GameSaleManager salesManager = new GameSaleManager();
		salesManager.sellGameWithCampaign(game, user, campaign, sale);
		salesManager.sellGameWithOutCampaign(game, user, sale);

	}

}
