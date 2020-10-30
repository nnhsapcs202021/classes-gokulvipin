public class VendingMachine 
{
    private int cans;
    private int tokens;
    
    
    /**
     * Default constructor for the VendingMachine class.
     *      Initializes can number to 10 and token number to 0
     */
    public VendingMachine(){
        this.cans = 10;
        this.tokens = 0;
    }
    
    /**
     * Constructs a new VendingMachine object with the specified can and token numbers
     * 
     * @param numOfCans the number of cans in the machine
     */
    public VendingMachine(int numOfCans){   
        this.cans = numOfCans;
        this.tokens = 0;      
    }
    
    
    /**
     * Returns the total number of cans
     * 
     * @return the total number of cans
     */
    public int getCanCount(){
        return this.cans;
    }
    
    
    /**
     * Returns the total number of tokens
     * 
     * @return the total number of tokens
     */
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    /**
     * Adds one to the TokenCount and decreases one from the CanCount
     */
    public void insertToken(){
        this.tokens += 1;
        this.cans -= 1;
    }
    
    /**
     * Fills up the machine with 10 cans
     */
    public void fillUp(){
        this.cans = 10;
    }
}