import java.util.Enumeration;

abstract public class Statement {

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

    abstract public String makeCustomerMessage(Customer aCustomer);
    abstract public String makeRentalMessage(Rental rental);
    abstract public String makeTotalChargeMessage(Customer aCustomer);
    abstract public String makeTotalFrequentRenterPointsMessage(Customer aCustomer);

}