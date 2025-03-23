package datastructure;

public class BusinessContact extends Contact {
    String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 회사명: " + company);
    }
}
