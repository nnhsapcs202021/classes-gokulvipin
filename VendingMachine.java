public class VendingMachine 
{
    private int cans;
    private int tokens;
    
    public VendingMachine(){
        this.cans = 10;
        this.tokens = 0;
    }
    public VendingMachine(int numOfCans){   
        this.cans = numOfCans;
        this.tokens = 0;      
    }
    
    public int getCanCount(){
        return this.cans;
    }
    public int getTokenCount()
    {
        return this.tokens;
    }
    public void insertToken(){
        this.tokens += 1;
    }
    public void fillUp(){
        this.cans = 10;
        }
}