package atm;

/**
 * 
 * Automatic teller machine (ATM). The ATM stores 5 EUR, 20 EUR, and 50 EUR notes. 
 * 
 * @author Georg Schied, Hochschule Ulm
 */
public class ATM
{
	private Cash cash;

    
    /** fills the machine with additional bank notes
     *  @param number5  	number of EUR 5 notes (>= 0)
     *  @param number20 	number of EUR 20 notes (>= 0)
     *  @param number50 	number of EUR 50 notes (>= 0)
     * @throws ATMException 	(illegal values)
     */
    public void refill(int number5, int number20, int number50) throws ATMException {
    	if(number5 < 0 || number20 < 0 || number50 < 0)
    		throw new ATMException("Wrong refill amount");
    	this.cash = new Cash(number5, number20, number50);
    }

    /** total amount available in the machine */
    public int totalAmount() {
        return (cash == null)?0:
        	cash.getCount5() * 5 +
        	cash.getCount20() * 20 +
        	cash.getCount50() * 50;
    }
    
    /** number of EUR 5 notes available in the machine */
    public int getCount5EUR() {
    	return (cash == null)?0:cash.getCount5();
    }

    /** number of EUR 20 notes available in the machine */
    public int getCount20EUR() {
    	return (cash == null)?0:cash.getCount20();
    }

    /** number of  EUR 50 notes available in the machine */
    public int getCount50EUR() {
    	return (cash == null)?0:cash.getCount50();
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
    	int amount5 = 0;
    	int amount20 = 0;
    	int amount50 = 0;
    	
    	if(amount % 5 == 0) {
    		amount50 = amount / 50;
    		if(getCount50EUR() < amount50) {
    			amount50 = getCount50EUR();
    		}
    		amount -= amount50 * 50;
    		
    		amount20 = amount / 20;
    		if(getCount20EUR() < amount20) {
    			amount20 = getCount20EUR();
    		}
    		amount -= amount20 * 20;
    		
    		amount5 = amount / 5;
    		if(getCount5EUR() < amount5) {
    			amount5 = getCount5EUR();
    		}
    		amount -= amount5 * 5;
    		
    		if(amount > 0)
    			throw new ATMException("Not enough cash");
    		
    	} else {
    		throw new ATMException("Wrong amount");
    	}
    	
    	Cash cash = new Cash(amount5,amount20,amount50);
    	this.cash = new Cash(getCount5EUR() - amount5,
    			getCount20EUR() - amount20,
    			getCount50EUR() - amount50);
    	return cash;
    }
}

