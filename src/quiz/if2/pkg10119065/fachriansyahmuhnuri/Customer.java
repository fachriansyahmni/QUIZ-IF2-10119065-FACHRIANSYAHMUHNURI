package quiz.if2.pkg10119065.fachriansyahmuhnuri;

/**
 *
 * @author Fachriansyah PC
 */
public class Customer implements CustomerInvoice{
    private String name, email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    
    @Override
    public String currentTime()
    {
        return "asd";
    }
}
