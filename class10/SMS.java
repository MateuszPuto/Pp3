public class SMS extends Message
{
    private User user;
    
    SMS(User user){
        super();
        this.user = user;
    }
    SMS(User user, String message){
        super(message);
        this.user = user;
    }
    
    public String getPhone(){
        return this.user.getPhone();
    }
    public void setPhone(String phone){
        this.user.setPhone(phone);
    }
    
    public void send(){
        System.out.println("new SMS message to " + getPhone() + ": " + super.getText());
    }
}
