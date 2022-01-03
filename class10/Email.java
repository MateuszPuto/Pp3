public class Email extends Message
{
    private User subject;
    private User recipient;
    
    
    Email(User subject, User recipient, String message){
        super(message);
        this.subject = subject;
        this.recipient = recipient;
        this.send();
    }
    
    public User getSubject(){
        return this.subject;
    }
    public User getRecipient(){
        return this.recipient;
    }
    public void setSubject(User newSubject){
        this.subject = newSubject;
    }
    public void setRecipient(User newRecipient){
        this.recipient = newRecipient;
    }
    
    public void send(){
        System.out.println("From: " + this.subject.getName());
        System.out.println("To: " + this.recipient.getName());
        System.out.println("Email message: " + super.getText());
    }
}
