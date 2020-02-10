import java.util.*;

public class GymApp {

    private static ArrayList<Membership> memberships = new ArrayList<>();
    private static HashMap<Person, Membership> membershipHash = new HashMap<>();
    private static Set<Integer> membershipIDs = new HashSet<>();
    private static int totalMembers = 3;

    public static void main(String[] args) {
        /*--create initial persons--*/
        Person michael = new Person("michael", "jordan", 200, new String[]{"get faster", "get stronger"});
        Person magic = new Person("magic", "johnson", 230, new String[]{"gain 10lbs", "get stronger"});
        Person lebron = new Person("lebron", "james", 260, new String[]{"lose 10lbs", "get buffer"});
        /*--create initial memberships--*/
        Membership member1 = new Membership(michael, GymApp.generateRandomMemberID(), Membership.MembershipTypes.ELITE, 40.00, "monthly", true);
        Membership member2 = new Membership(magic, GymApp.generateRandomMemberID(), Membership.MembershipTypes.BASIC, 20.00, "monthly", true);
        Membership member3 = new Membership(lebron, GymApp.generateRandomMemberID(), Membership.MembershipTypes.GOLD, 30.00, "monthly", true);
        /*--Add initial members--*/
        addMember(member1);
        addMember(member2);
        addMember(member3);
        /*--Add new member without assigning variable to object--*/
        addMember(new Membership(
                new Person("allen", "iverson", 175, new String[]{"get muscle", "get stronger"}), GymApp.generateRandomMemberID(), Membership.MembershipTypes.ELITE, 400.00, "annual", true)
        );

        for (Membership member : GymApp.memberships) {
            printPersonInfo(member.getPerson());
        }
        printMemberIDMap();
    }



    public static int generateRandomMemberID() {
        int randomNum = (int) Math.floor(Math.random() * 999) + 1;
        while (!GymApp.membershipIDs.add(randomNum)) {
            randomNum = (int) Math.floor(Math.random() * 999) + 1;
        }
        return randomNum;
    }

    /*--Prints the person's information--*/
    public static void printPersonInfo(Person personObj) {
        System.out.print("Person's information below:\n");
        System.out.printf("First Name: %-15s\n" +
                "Last Name: %-15s\n" +
                "Weight: %-3.2f\n", personObj.getFirstName(), personObj.getLastName(), personObj.getWeight());
        System.out.println("Their goals: ");
        for (String goals : personObj.getGoals()) {
            System.out.printf("%-10s ", goals);
        }
        System.out.println("\n");
    }

    public static void printMemberIDMap() {
        for (Membership membership : GymApp.membershipHash.values()) {
            System.out.printf("First: %-15s Last: %-15s ID: %09d\n", membership.getPerson().getFirstName(), membership.getPerson().getLastName(), membership.getMemberID());
        }
    }

    // Edit Person Info
    public static void deletePersonInfo() {

    }

    /*--Method to add member to the app's array/hashmap--*/
    public static void addMember(Membership newMembership) {
        GymApp.memberships.add(newMembership);
        GymApp.membershipHash.put(newMembership.getPerson(), newMembership);
        GymApp.totalMembers++;
    }

}
