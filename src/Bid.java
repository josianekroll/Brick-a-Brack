import java.util.Date;

public class Bid {
	public double initialBid;
	public double finalBid;
	public Date openBidDate;
	public Date endBidDate;
	public User[] userBid;
	public int numberOfBids;

	public Bid(double initialBid,double finalBid,Date openBidDate,Date endBidDate,User[] userBid,int numberOfBids ) {
		this.initialBid=initialBid;
		this.finalBid=finalBid;
		this.openBidDate=openBidDate;
		this.endBidDate=endBidDate;
		this.userBid=userBid;
		this.numberOfBids=numberOfBids;
			
	}

}
