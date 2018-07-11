package com.techelevator;

/**
 * This class models an auction with an additional set price (the 'buyout' price) that any bidder 
 * can accept at any time during the auction, thereby immediately ending the auction and winning 
 * the item.  If no bidder chooses to utilize the buyout option before the end of bidding the 
 * highest bidder wins.
 */
public class BuyoutAuction extends Auction {				//Buyout Auction is a type of auction and inherits all the characteristics of Auction
	private int buyoutPrice;
	/**
	 * @param description the description of the auction
	 * @param buyoutPrice the set price that immediately wins the auction
	 					data for superclass/  data for subclass*/
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);								//subclass must invoke a constructor for the superclass/parent class
		this.buyoutPrice = buyoutPrice;					//initialize/define dad for subclass
	}
	/*
	 * This class overrides the default placeBid behavior of the parent class.
	 * If the offeredBid meets or exceeds the buyout price, the bid is set
	 * to the buyout price and all future bids are ignored.
	 */
	@Override										// annotation - note to complier about what its doing in case it can verify or do something with it
													// @Override tells the compiler that the next method is an override s check to be sure its valid
													// method override - logically replacing a superclass method with a subclass method.
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		if(getHighBid().getBidAmount() < buyoutPrice) {
			if(offeredBid.getBidAmount() >= buyoutPrice) {
				offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
			}
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		return isCurrentWinningBid;
	}
	public int getBuyoutPrice() {
		return buyoutPrice;
	}

}
