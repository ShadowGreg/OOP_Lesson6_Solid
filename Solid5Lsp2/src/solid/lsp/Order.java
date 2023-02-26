package solid.lsp;

public class Order extends AbstractOrder implements Orderable {


    public Order(int qnt, int price) {
        super(price, qnt);
    }

    public int getAmount() {
        return qnt * price;
    }

}
