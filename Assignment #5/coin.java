public class coin
{
     
private double myValue; 
private String myName; 
 
    public coin(double value, String name) { 
        myValue = value; 
        myName = name; 
    } 
 
    public double getValue() { 
        return myValue; 
    } 
 
    public String getName() { 
        return myName;
    }    
 
// returns true if this coin is equal to aCoin, 
// which means the name and the value are both equal 
public boolean equals(Coin aCoin, Coin Bcoin) { 
    if(aCoin.getValue()==(Bcoin.getValue())&&(aCoin.getName().equals(Bcoin.getName()))){
    return true;
    }else{
    return false;
    }
}
}
