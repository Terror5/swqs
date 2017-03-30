package atm;

public class ATMExample {
    /** Test für Klasse Geldautomat **/
   
	
    public static void main(String[] args) throws ATMException {
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();

        System.out.println("(1) refill ATM 1: 5x5, 5x20, 5x50");
        atm1.refill(5,5,5);
        System.out.println("available in ATM 1: " + atm1.totalAmount() + " EUR");
        
        
        Cash c1 = atm1.withdraw(200);
        System.out.println("Cash dispensed from ATM 1:" + c1);

    }

}
