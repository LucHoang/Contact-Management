package com.qldb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileManager {
    static Scanner input = new Scanner(System.in);

    public static void readFile() {
        try {
            File file = new File(".\\data\\import.csv");

            if (!file.exists()) {
                System.out.println("File không tồn tại!");
                return;
            }

            System.out.println("Import thông tin từ file sẽ xóa và cập nhật lại toàn bộ nội dung sản phẩm");
            System.out.println("Nhấn Enter để tiếp tục");
            String choose = input.nextLine();

            if (choose.isEmpty()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                String line = bufferedReader.readLine();

                ContactManager.listContact.clear();

                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split(",");
                    Contact contact = new Contact();

                    contact.setNumberPhone(Integer.parseInt(words[0]));
                    contact.setGroup(words[1]);
                    contact.setName(words[2]);
                    contact.setGender(words[3]);
                    contact.setAddress(words[4]);
                    contact.setBirthDay(words[5]);
                    contact.setEmail(words[6]);

                    ContactManager.listContact.add(contact);
                }
                bufferedReader.close();
                System.out.println("Import thông tin từ file thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        if (ContactManager.listContact.isEmpty()) {
            System.out.println("Danh sách trống!!!");
            return;
        }
        System.out.println("Ghi vào file sẽ cập nhật lại toàn bộ nội dung file");
        System.out.println("Nhấn Enter để tiếp tục");
        String choose = input.nextLine();
        if (choose.isEmpty()) {
            try {
                File file = new File(".\\data\\export.csv");
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fileWriter = new FileWriter(file);

                fileWriter.write("Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email\n");
                for (Contact contact : ContactManager.listContact) {
                    fileWriter.write(contact.formatString() + "\n");
                }

                fileWriter.close();
                System.out.println("Ghi file thành công");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
