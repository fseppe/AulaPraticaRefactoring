public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented) {
        int value = 1;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) 
            value++;
        return value;
     }
}