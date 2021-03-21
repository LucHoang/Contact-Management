package com.qldb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    static List<Contact> listContact = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public ContactManager() {

    }

    public void displayContact() {
        boolean isLoop = true;
        int start = 0;
        int end = 4;
        System.out.println("Chọn 1 để thêm mới");

        int count = 0;

        while (isLoop) {
            for (int i=start; i<=end; i++) {
                if (i> listContact.size()-1) {
                    break;
                }
                System.out.println("STT "+(i+1)+": "+ listContact.get(i));
                count++;
            }
            System.out.print("Đã hiển thị "+count+"/"+listContact.size());

            if (end>= listContact.size()-1) break;
            System.out.println(" | Enter để xem tiếp");
            start+=5;
            end+=5;

            String check = input.nextLine();
            if (check.equalsIgnoreCase("1")) {
                addContact();
                isLoop = false;
            }
        }
    }

    public void addContact() {
        Contact contact = new Contact();
        inputContact(contact, true);

        listContact.add(contact);
        System.out.println("Đã thêm thành công");
    }

    public void inputContact(Contact contact, boolean check) {
        if (check) {
            System.out.print("Nhập số điện thoại: ");
            while (true) {
                String temp = input.nextLine();
                int numberPhone = Integer.parseInt(temp);
                if (temp.isEmpty()) {
                    System.err.print("Nhập số điện thoại (không được để trống): ");
                } else {
                    boolean isExist = true;
                    for (Contact element : listContact) {
                        if (element.getNumberPhone() == numberPhone) {
                            System.err.print("Số điện thoại đã tồn tại! Hãy nhập lại: ");
                            isExist = false;
                            break;
                        }
                    }
                    if (isExist) {
                        contact.setNumberPhone(numberPhone);
                        break;
                    }
                }
            }
        }

        System.out.print("Nhập nhóm của danh bạ: ");
        while (true) {
            String group = input.nextLine();
            if (!group.isEmpty()) {
                contact.setGroup(group);
                break;
            }
            System.err.print("Nhập nhóm của danh bạ (không được để trống): ");
        }

        System.out.print("Nhập họ tên: ");
        while (true) {
            String name = input.nextLine();
            if (!name.isEmpty()) {
                contact.setName(name);
                break;
            }
            System.err.print("Nhập họ tên (không được để trống): ");
        }

        System.out.print("Nhập giới tính: ");
        while (true) {
            String gender = input.nextLine();
            if (!gender.isEmpty()) {
                contact.setGender(gender);
                break;
            }
            System.err.print("Nhập giới tính (không được để trống): ");
        }

        System.out.print("Nhập địa chỉ: ");
        while (true) {
            String address = input.nextLine();
            if (!address.isEmpty()) {
                contact.setAddress(address);
                break;
            }
            System.err.print("Nhập địa chỉ (không được để trống): ");
        }

        System.out.print("Nhập ngày sinh: ");
        while (true) {
            String birthDay = input.nextLine();
            if (!birthDay.isEmpty()) {
                contact.setBirthDay(birthDay);
                break;
            }
            System.err.print("Nhập ngày sinh (không được để trống): ");
        }

        System.out.print("Nhập email: ");
        while (true) {
            String email = input.nextLine();

            if (email != null && email.contains("@") && !email.contains(" ")) {
                contact.setEmail(email);
                break;
            }
            System.err.print("Nhập lại email (email phải chứa @ và không có ký tự khoảng trắng): ");
        }
    }

    public void editContact() {
        while (true) {
            System.out.print("Nhập số điện thoại của danh bạ cần sửa: ");
            String temp = input.nextLine();
            int numberFind = Integer.parseInt(temp);
            boolean isFind = true;
            boolean isEdit = true;

            if (temp.isEmpty()) {
                break;
            } else {
                for (Contact contact : listContact) {
                    if (contact.getNumberPhone() == numberFind) {
                        inputContact(contact,false);

                        System.out.println("Đã cập nhật thành công");
                        isFind = false;
                        isEdit = false;
                        break;
                    }
                }
                if (isFind) {
                    System.out.println("Không tìm được danh bạ với số điện thoại trên.");
                }
            }
            if (!isEdit) break;
        }
    }

    public void deleteContact() {
        while (true) {
            System.out.print("Nhập số điện thoại của danh bạ muốn xóa: ");
            String temp = input.nextLine();
            int numberFind = Integer.parseInt(temp);
            boolean isFind = true;
            boolean isEdit = true;

            if (temp.isEmpty()) {
                break;
            } else {
                for (Contact contact : listContact) {
                    if (contact.getNumberPhone() == numberFind) {
                        System.out.print("Bạn chắc chắn muốn xóa sản phẩm -> Y?");
                        String chosse = input.nextLine();
                        if (chosse.equalsIgnoreCase("Y")) {
                            listContact.remove(contact);

                            System.out.println("Đã xóa thành công");
                            isFind = false;
                            isEdit = false;
                            break;
                        }
                        isFind = false;
                        isEdit = false;
                    }
                }
                if (isFind) {
                    System.out.println("Không tìm được danh bạ với số điện thoại trên.");
                }
            }
            if (!isEdit) break;
        }
    }

    public void findByName() {
        System.out.print("Nhập họ tên cần tìm: ");
        String name = input.nextLine();
        boolean isFind = true;

        for (Contact contact: listContact) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                isFind = false;
            }
        }
        if (isFind) {
            System.out.println("Không tìm thấy!");
        }
    }

    public void findByNumberPhone() {
        System.out.print("Nhập số điện thoại cần tìm: ");
        int numberPhone = Integer.parseInt(input.nextLine());
        boolean isFind = true;

        for (Contact contact: listContact) {
            if (contact.getNumberPhone() == numberPhone) {
                System.out.println(contact);
                isFind = false;
                break;
            }
        }
        if (isFind) {
            System.out.println("Không tìm thấy!");
        }
    }
}
