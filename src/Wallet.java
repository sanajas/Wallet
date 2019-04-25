public class Wallet
{
    public  double bal = 0;
    public  double amount = 2000;
    //public double draw = 300;

    public void addmoney(Money money)
    {
        bal = bal+ money.getValue();


    }

    public void removemoney(Money money)
    {
        bal = bal - money.getValue() ;

    }

    public void checkbalance()

    {
        System.out.println("Current blance: "+bal);
    }

}





