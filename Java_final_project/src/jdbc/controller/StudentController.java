package jdbc.controller;

import jdbc.entity.Student;
import jdbc.service.Impl.StudentServiceImpl;
import jdbc.service.StudentService;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) throws SQLException, IOException, ParseException {

        StudentService studentService = new StudentServiceImpl();

        // Show menu bar
        HomePage.group();
        HomePage.menu();

        String menu;
        String name;
        String address;
        String phone;
        Long id;

        // table header
        MainController mainController = new MainController();
        List<String> headersList = new ArrayList<>();
        headersList.add("Id");
        headersList.add("Name");
        headersList.add("Address");
        headersList.add("Phone");
        headersList.add("Date of Birth");
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select the menu: ");

            menu = scanner.nextLine();
            if(menu.equalsIgnoreCase("v")){

                // table body
                List<List<String>> rowsList = new ArrayList<>();
                List<Student> studentList = studentService.findAll();
                if(studentList.size() != 0){
                    for(Student ar : studentList){
                        List<String> row = new ArrayList<>();
                        row.add(ar.getIdToString());
                        row.add(ar.getName());
                        row.add(ar.getAddress());
                        row.add(ar.getPhone());
                        row.add(ar.getDateToString());

                        rowsList.add(row);
                    }
                }
                System.out.print("Student List : ");
                System.out.print(mainController.generateTable(headersList, rowsList));
                System.out.println("Total student(s): " + studentList.size());
            } else if (menu.equalsIgnoreCase("c")) {
                System.out.print("Please input student name: ");
                name = scanner.nextLine();
                System.out.print("Please input address: ");
                address = scanner.nextLine();
                System.out.print("Please input phone number: ");
                phone = scanner.nextLine();

                // create student
                Student student = new Student();
                student.setName(name);
                student.setAddress(address);
                student.setPhone(phone);
                if(studentService.save(student)){
                    System.out.println("Insert successfully");
                }else {
                    System.out.println("Cannot Insert.");
                }

                HomePage.menu();

            } else if (menu.equalsIgnoreCase("u")) {
                try{
                    System.out.print("Please set the name: ");
                    name = scanner.nextLine();
                    System.out.print("Please set the address: ");
                    address = scanner.nextLine();
                    System.out.print("Please set the phone: ");
                    phone = scanner.nextLine();
                    System.out.print("Please set the id: ");
                    id = scanner.nextLong();

                    // update
                    Student student = new Student();
                    student.setName(name);
                    student.setAddress(address);
                    student.setPhone(phone);
                    student.setId(id);
                    if(studentService.update(student)){
                        System.out.println("Update successfully");
                    }else{
                        System.out.println("Student Not found....!");
                    }
                }catch (InputMismatchException e){
                    System.out.println("ID accept only number...!");
                }

                HomePage.menu();

            } else if (menu.equalsIgnoreCase("d")) {
                try{
                    System.out.print("Please input the id: ");
                    id = scanner.nextLong();
                    // delete
                    if(studentService.delete(id)){
                        System.out.println("Delete successfully");
                    }else{
                        System.out.println("Student Not found....!");
                    }
                }catch (InputMismatchException e){
                    System.out.println("ID is only number...!");
                }

                HomePage.menu();

            } else if (menu.equalsIgnoreCase("fn")) {
                System.out.print("Please input student: ");
                name = scanner.nextLine();

                // FILTER BY NAME
                List<Student> studentList = studentService.findByName(name);
                List<List<String>> rowsList = new ArrayList<>();
                if(!studentList.isEmpty()){
                    for(Student a : studentList){
                        List<String> row = new ArrayList<>();
                        row.add(a.getIdToString());
                        row.add(a.getName());
                        row.add(a.getAddress());
                        row.add(a.getPhone());
                        row.add(a.getDateToString());

                        rowsList.add(row);
                    }
                    System.out.println(mainController.generateTable(headersList, rowsList));
                    System.out.println("Total student(s): " + studentList.size());
                }else {
                    System.out.println("Student Not found....!");
                }

                HomePage.menu();

            } else if (menu.equalsIgnoreCase("f")) {
                System.out.print("Please input your id: ");
                id = scanner.nextLong();
                // FILTER BY ID
                Student findStudentId = studentService.findById(id);
                List<List<String>> rowsList = new ArrayList<>();
                if (findStudentId != null) {
                    List<String> row = new ArrayList<>();
                    row.add(findStudentId.getIdToString());
                    row.add(findStudentId.getName());
                    row.add(findStudentId.getAddress());
                    row.add(findStudentId.getPhone());
                    row.add(findStudentId.getDateToString());

                    rowsList.add(row);
                    System.out.println(mainController.generateTable(headersList, rowsList));
                } else {
                    System.out.println("Student Not found....!");
                }

                HomePage.menu();

            } else if (menu.equalsIgnoreCase("e")) {
                System.out.println("You have sign out...!");
                System.out.println("Thank you for using student management!");
                break;
            }else {
                System.out.println("Please select the menu before start");
            }

        }

    }
}
