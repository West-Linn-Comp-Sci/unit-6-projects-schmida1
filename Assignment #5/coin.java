public class coin
{
     
private double myVal; 
private String myName; 
 
    public coin(double val, String name) { 
        myVal = val; 
        myName = name; 
    } 
 
    public double getValue() { 
        return myVal; 
    } 
 
    public String getName() { 
        return myName;
    }    
 

public boolean equals(coin coin1, coin coin2) { 
    if(coin1.getValue()==(coin2.getVal())&&(coin1.getName().equals(coin2.getName()))){
    return true;
    }else{
    return false;
    }
}
}
