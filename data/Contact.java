package data;

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.print("이름: " + name + ", 전화번호: " + phoneNumber);
    }
}