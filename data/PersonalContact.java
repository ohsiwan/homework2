package data;

public class PersonalContact extends Contact {
    String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 관계: " + relationship);
    }
}