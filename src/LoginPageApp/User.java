package LoginPageApp;

public class User {

    //3-name ,username,email,paasword
    private String name;
    private String username;
    private String password;
    private String email;
    //4-user objesi olusturulurken ozellikler set edilsin..

    public User(String name,String username,String email,String password){
        this.name=name;
        this.username=username;
        this.email=email;
        this.password=password;
    }
//private oldugu icin ulasilsin am a sadece goruntulensin istedigim icin getter metodu kullaniyorum...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
