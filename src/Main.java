public class Main {

    public static void main(String[] args)
    {



        Wallet  wallet = new Wallet();


        wallet.addmoney(new Money(1000));
        wallet.checkbalance();
        wallet.removemoney(new Money(200));
        wallet.checkbalance();
    }
}
