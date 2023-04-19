public class AuctionMain {
    public static void main(String[] args) {
        // set up
        Auction auction = new Auction();

        for (int i = 0; i < 5; i++) {
            auction.attach(new Bidder());
        }

        // start auction
        Item item1 = new Item("diamond ring", 100_000);
        auction.offer(item1);

        Item item2 = new Item("painting Van Gogh", 65_000_000);
        auction.offer(item2);
    }
}
