package com.qldb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        String choose;

//        ContactManager.listContact.add(new Contact(1, "1", "1", "1", "1", "1", "1"));
//        ContactManager.listContact.add(new Contact(2, "1", "1", "1", "1", "1", "1"));
//        ContactManager.listContact.add(new Contact(3, "1", "1", "1", "1", "1", "1"));
//        ContactManager.listContact.add(new Contact(4, "1", "1", "1", "1", "1", "1"));
//        ContactManager.listContact.add(new Contact(5, "1", "1", "1", "1", "1", "1"));
//        ContactManager.listContact.add(new Contact(6, "1", "1", "1", "1", "1", "1"));
//        ContactManager.listContact.add(new Contact(7, "1", "1", "1", "1", "1", "1"));

        while (true) {
            try {
                showMenu();
                choose = input.nextLine();

                switch (choose) {
                    case "1":
                        if (ContactManager.listContact.isEmpty()) {
                            System.out.println("Danh sách trống!!!");
                            break;
                        }
                        contactManager.displayContact();
                        break;
                    case "2":
                        contactManager.addContact();
                        break;
                    case "3":
                        if (ContactManager.listContact.isEmpty()) {
                            System.out.println("Danh sách trống!!!");
                            break;
                        }
                        contactManager.editContact();
                        break;
                    case "4":
                        if (ContactManager.listContact.isEmpty()) {
                            System.out.println("Danh sách trống!!!");
                            break;
                        }
                        contactManager.deleteContact();
                        break;
                    case "5":
                        if (ContactManager.listContact.isEmpty()) {
                            System.out.println("Danh sách trống!!!");
                            break;
                        }
                        System.out.println("1. Tìm kiếm theo số điện thoại");
                        System.out.println("2. Tìm kiếm theo họ tên");
                        System.out.println("0. Exit");
                        System.out.print("Choose: ");
                        String select = input.nextLine();
                        switch (select) {
                            case "1":
                                contactManager.findByNumberPhone();
                                break;
                            case "2":
                                contactManager.findByName();
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("Lựa chọn ngoài phạm vi!!!");
                        }
                        break;
                    case "6":
                        FileManager.readFile();
                        break;
                    case "7":
                        FileManager.writeFile();
                        break;
                    case "8":
                        System.out.println("Goodbye!!!");
                        System.exit(1);
                    default:
                        System.err.println("Lựa chọn ngoài phạm vi!!!");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Nhập sai định dạng!!!");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.print("Chọn chức năng: ");
    }
}
