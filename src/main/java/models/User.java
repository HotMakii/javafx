package models;

public class User {
    //1. variables
    private String username;
    private String password;

    //get set

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //3. constructor
    public User(){
        username ="test";
        password = "test";

    }

    public User(String username, String password){
        setUsername(username);
        setPassword(password);
    }


    //4. to string
    public String toString() {
        return username;
    }

    


    
}
