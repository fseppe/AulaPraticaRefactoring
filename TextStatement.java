import java.util.Enumeration;

public class TextStatement extends Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = makeCustomerMessage(aCustomer);
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           result += makeRentalMessage(each);
        }
        result += makeTotalChargeMessage(aCustomer);
        result += makeTotalFrequentRenterPointsMessage(aCustomer);
        return result;
    }

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