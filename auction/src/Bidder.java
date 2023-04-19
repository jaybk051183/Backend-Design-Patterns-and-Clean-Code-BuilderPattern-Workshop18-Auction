import java.util.Random;

public class Bidder implements Observer {

    @Override
    public void update(Object obj) {
        Item item = (Item) obj;
        double minBid = item.minBid;
        double bidRange = minBid * 2 - minBid;
        double bid =  minBid + Math.random() * bidRange ;
        String formattedBid = String.format("%.2f", bid);

        System.out.println("Bid on " + item.itemName + " with: €" + formattedBid);

    }
}
