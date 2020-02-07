public class Membership {
    private Person person;
    private final int MEMBER_ID;
    private MembershipTypes membershipType;
    private double membershipCost;
    private String subscription;
    private boolean active;

    public Membership(Person person, int memberID, MembershipTypes membershipType, double membershipCost, String subscription, boolean active) {
        this.person = person;
        this.MEMBER_ID = memberID;
        this.membershipType = membershipType;
        this.membershipCost = membershipCost;
        this.subscription = subscription;
        this.active = active;
    }

    /*--Setter Methods--*/
    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMembershipType(MembershipTypes membershipType) {
        this.membershipType = membershipType;
    }

    public void setMembershipCost(double membershipCost) {
        this.membershipCost = membershipCost;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /*--Getter Methods--*/
    public Person getPerson() {
        return this.person;
    }

    public int getMemberID() {
        return this.MEMBER_ID;
    }

    public MembershipTypes getMembershipType() {
        return this.membershipType;
    }

    public double getMembershipCost() {
        return this.membershipCost;
    }

    public String getSubscription() {
        return this.subscription;
    }

    public boolean getActive() {
        return this.active;
    }


    enum MembershipTypes {
        BASIC,
        GOLD,
        ELITE
    }
}
