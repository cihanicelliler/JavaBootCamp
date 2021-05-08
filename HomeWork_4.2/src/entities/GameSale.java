package entities;

import abstracts.Entity;

public class GameSale implements Entity{
	private int id;
	private int userId;
	private int gameId;
	private int campaignId;
	private int count;
	private int totalAmount;
	private int discountAmount;
	private int amountOfPayment;
	
	public GameSale(int id, int userId, int gameId, int campaignId, int count) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalAmount(Game game) {
		return count * game.getGamePrice();
	}

	public int getDiscountAmount(Game game, Campaign campaign) {
		return (game.getGamePrice()) * (campaign.getDiscountRate()) / 100;
	}

	public int getAmountOfPayment(Game game, Campaign campaign) {
		return getTotalAmount(game) - getDiscountAmount(game, campaign);
	}
	
}
