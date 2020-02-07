public class Person {
    private String firstName;
    private String lastName;
    private double weight;

    private String[] goals;

    public Person(String first, String last, double weight, String[] goals) {
        this.firstName = first;
        this.lastName = last;
        this.weight = weight;
        this.goals = goals;
    }

    /*--Setter methods--*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGoals(String[] goals) {
        this.goals = goals;
    }

    /*--Getter methods--*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return this.weight;
    }


    public String[] getGoals() {
        return this.goals;
    }
}
