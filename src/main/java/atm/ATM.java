package atm;

/**
 * 
 * Automatic teller machine (ATM). The ATM stores 5 EUR, 20 EUR, and 50 EUR notes. 
 * 
 * @author Georg Schied, Hochschule Ulm
 */
public class ATM
{

    
    /** fills the machine with additional bank notes
     *  @param number5  	number of EUR 5 notes (>= 0)
     *  @param number20 	number of EUR 20 notes (>= 0)
     *  @param number50 	number of EUR 50 notes (>= 0)
     * @throws ATMException 	(illegal values)
     */
    public void refill(int number5, int number20, int number50) throws ATMException {
    	//TODO
    }

    /** total amount available in the machine */
    public int totalAmount() {
    	//TODO
        return 0;
    }
    
    /** number of EUR 5 notes available in the machine */
    public int getCount5EUR() {
    	//TODO
    	return 0;
    }

    /** number of EUR 20 notes available in the machine */
    public int getCount20EUR() {
    	//TODO
    	return 0;
    }

    /** number of  EUR 50 notes available in the machine */
    public int getCount50EUR() {
    	//TODO
    	return 0;
    }

    
    /** Withdraws the requested amount (if possible).
     * Only multiples of EUR 5 are allowed.
     * Tries to pay out with the largest notes available.
     * No partial amount will be withdrawn.
     *  @param amount   amount requested (> 0 and a multiple of €5)     
     *  @return         Cash returned from the machine 
     *                  (number of EUR 5 notes, EUR 20 notes, and EUR 50 notes)
     */
    public Cash withdraw(int amount) throws ATMException {
    	//TODO:
       return null;
    }
}

