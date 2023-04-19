public class Item {
    String itemName;    // item on auction
    long minBid;        // minimum bid on item

    public Item(String name, long minBid) {
        this.itemName = name;
        this.minBid = minBid;

        System.out.println(String.format("Item %s with minimal bid %d", this.itemName, this.minBid));
    }
}
