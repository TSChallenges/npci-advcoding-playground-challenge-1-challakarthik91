class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        // TODO
        this.currentPrice = newPrice;
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
        return this.quantity * (this.currentPrice-this.buyingPrice);
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        return this.currentPrice*this.quantity;
    }
}
