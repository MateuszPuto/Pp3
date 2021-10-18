
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
   String accountNumber;
   String ownerName;
   String ownerSurname;
   String bank;
   float balance;
   boolean hasCard;
   
   public void printInfo(){
        System.out.println("account number: " + accountNumber);
        System.out.println("Owner: " + ownerName + " " + ownerSurname);
        System.out.println("Bank: " + bank);
        System.out.println("Balance: " + balance);
        System.out.println("Linked card: " + hasCard);
    }
    
   public void bankTransfer(float amount){
        balance -= amount;
    }
    
   public void addCard(){
        hasCard = !hasCard;
    }
    
    
}
