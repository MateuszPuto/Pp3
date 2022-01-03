public class User
{
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    
    User(){}
    User(String firstname, String lastname, String email, String phone){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phone;
    }
    
    public String getName(){
        return this.firstname + " " + this.lastname;
    }
    public void setName(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String getPhone(){
        return this.phoneNumber;
    }
    public void setPhone(String phone){
        this.phoneNumber = phone;
    }
}
