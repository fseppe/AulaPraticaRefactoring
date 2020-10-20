public class TextStatement extends Statement {

    public String makeCustomerMessage(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String makeRentalMessage(Rental rental) {
        return "\t" + rental.getMovie().getTitle()+ "\t" + 
            String.valueOf(rental.getCharge()) + "\n";
    }

    public String makeTotalChargeMessage(Customer aCustomer) {
        return "Amount owed is " + 
            String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String makeTotalFrequentRenterPointsMessage(Customer aCustomer) {
        return "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
    }

}