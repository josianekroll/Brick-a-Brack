import java.util.concurrent.atomic.AtomicInteger;

public class Auction {
	public int auctionID;
	public String name;
	public String description;
	public String owner;
	public String winner;
	public Bid winningBid;
	
	public static AtomicInteger nextAuctionId = new AtomicInteger(0);

    public Auction(String name, String description, String owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

	
    private static int getNextAuctionId() {
        return nextAuctionId.incrementAndGet();
      }
    
    public Auction() {
    	auctionID=getNextAuctionId();
    }
}
