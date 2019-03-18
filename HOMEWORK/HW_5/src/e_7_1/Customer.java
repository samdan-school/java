package e_7_1;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
        this.setMember(false);
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.setMember(true);
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Name is " + this.getName() +
                (this.isMember() ? ("\nMember type is " + this.getMemberType()) : "");
    }

    public static void main(String[] args) {
        System.out.println(new Customer("a"));
    }
}
