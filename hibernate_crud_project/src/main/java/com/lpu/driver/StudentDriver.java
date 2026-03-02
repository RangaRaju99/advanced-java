package com.lpu.driver;

import java.util.List;
import java.util.Scanner;

import com.entity.Student;
import com.lpu.service.AuthService;
import com.lpu.service.StudentService;

public class StudentDriver {

    public static void main(String[] args) {

        String role = AuthService.login();

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while(true){

        	System.out.println(
        	        "1. Add Student\n" +
        	        "2. Find Student\n" +
        	        "3. View All\n" +
        	        "4. Update Name\n" +
        	        "5. Delete\n" +
        	        "6. Exit"
        	);


            int choice = sc.nextInt();

            try{

                switch(choice){

                    case 1 -> {

                        if(!role.equals("ADMIN")){
                            System.out.println("Unauthorized!");
                            break;
                        }

                        System.out.print("Id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Phone: ");
                        long phone = sc.nextLong();

                        service.register(new Student(id,name,phone));
                    }

                    case 2 -> {
                        System.out.println(service.getStudent(sc.nextInt()));
                    }

                    case 3 -> {

                        List<Student> list = service.getAll(0,5);

                        list.forEach(System.out::println);
                    }

                    case 4 -> {

                        if(!role.equals("ADMIN")){
                            System.out.println("Unauthorized!");
                            break;
                        }

                        System.out.print("Id:");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("New Name:");
                        String name = sc.nextLine();

                        service.updateName(id,name);
                    }

                    case 5 -> {

                        if(!role.equals("ADMIN")){
                            System.out.println("Unauthorized!");
                            break;
                        }

                        service.delete(sc.nextInt());
                    }

                    case 6 -> System.exit(0);
                }

            }catch(Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}

