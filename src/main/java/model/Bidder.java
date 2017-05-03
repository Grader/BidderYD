package model;

public class Bidder {

    public double correct (double bid, double priceClick) {

        double newBid;

        if (bid < priceClick) {
            newBid = priceClick + priceClick / 10;
        }
        else newBid = bid;
        return newBid;
    }
}
