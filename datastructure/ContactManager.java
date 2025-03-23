package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {

    private static final ArrayList<Contact> contacts = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addBusinessContact();
                    break;
                case 2:
                    addPersonalContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요: ");
    }

    private static void addBusinessContact() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("회사명을 입력하세요: ");
        String company = scanner.nextLine();
        contacts.add(new BusinessContact(name, phoneNumber, company));
    }

    private static void addPersonalContact() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("관계를 입력하세요: ");
        String relationship = scanner.nextLine();
        contacts.add(new PersonalContact(name, phoneNumber, relationship));
    }

    private static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                contact.display();
            }
        }
    }

    private static void searchContact() {
        System.out.print("검색할 이름을 입력하세요: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.name.equals(searchName)) {
                contact.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}