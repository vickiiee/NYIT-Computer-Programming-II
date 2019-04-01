package mar4;


public class BankDemo
{
    public static void main(String[] args)
    {
        Bank tinyBank = new Bank(3);    // create Bank that can hold 3 accounts
        tinyBank.openCheckingAccount(100,20);    // balance=100 credit limit = 20
        tinyBank.openSavingsAccount(200, 0.05); // balance=200 interest=5%
        
        tinyBank.openCheckingAccount(300,30);    // balance=300 credit limit = 30
        tinyBank.openSavingsAccount(400,0.05);  // balance=400 interest=5%);
        
        tinyBank.openCheckingAccount(400,40);    // balance=400 credit limit = 40
        tinyBank.openSavingsAccount(400,0.05);  // balance=400 interest=5%);

        tinyBank.printAccounts();
        
        System.out.println("\ntinyBank.deposit(112,500)");
        	tinyBank.deposit(112,500);

        System.out.println("\ntinyBank.withdraw(101,500)");
        	tinyBank.withdraw(101,500);
        System.out.println("\ntinyBank.withdraw(101,110)");
        	tinyBank.withdraw(101,110);
        System.out.println("\ntinyBank.addInterest(101)");
        	tinyBank.addInterest(101);

        System.out.println("\ntinyBank.addInterest(102)");
        	tinyBank.addInterest(102);
        System.out.println("\ntinyBank.withdraw(102,500)");
        	tinyBank.withdraw(102,500);
        System.out.println("\ntinyBank.withdraw(102,200)");
        	tinyBank.withdraw(102,200);

        System.out.println();
        tinyBank.printAccounts();

    }
}