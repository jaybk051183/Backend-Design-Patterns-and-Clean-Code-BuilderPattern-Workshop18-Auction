public class Auction extends Subject {
    public void offer(Item item) {
        super.notify(item);
    }
}
