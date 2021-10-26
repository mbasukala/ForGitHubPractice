package com.gihub;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//    Window glass = new Window(20.3F, 5.6F, 10.6F, 15.8F, 6);
//    Window wood = new Window(30.5F, 12.5F, 10.4F, 15.8F, 6);
//    Window metal = new Window(24.3F, 18.4F, 20.6F, 12.5F, 7);
//
//        List<Window> windowList = new ArrayList<>();
//        windowList.add(glass);
//        windowList.add(wood);
//        windowList.add(metal);
//
//
//        House myHouse = new House();
//        myHouse.setArea(217.23F);
//        myHouse.setStory(5);
//        myHouse.setWindows(windowList);
//        myHouse.setDoor(6);
//        myHouse.setColor("Pink");
//
//    float glassLength = myHouse.getWindows().get(0).getLength();
//    float woodLength = myHouse.getWindows().get(1).getLength();
//    float metalLength = myHouse.getWindows().get(2).getLength();
//    float sumLength = glassLength + woodLength + metalLength;
////    System.out.println(sumLength);
//
//    int glassCount = myHouse.getWindows().get(0).getCount();
//    int woodCount = myHouse.getWindows().get(1).getCount();
//    int metalCount = myHouse.getWindows().get(2).getCount();
//    int totalWindows = glassCount + woodCount + metalCount;
//        System.out.println(totalWindows);
//        System.out.println("The " + myHouse.getColor() + " house has got " + totalWindows + " windows.");


        EmployeeAddress Alabama = new EmployeeAddress(372, "W Burming Rd", "Mobile", "AL", 39829);
        EmployeeAddress Oklohama = new EmployeeAddress(789, "N huntington Blvd", "Carvel", "OK", 37867);
        EmployeeAddress Michigan = new EmployeeAddress(9023, "S Inkster Cir", "Troy", "MI", 82006);

        List<EmployeeAddress> employeeAddressList = new ArrayList<>();
        employeeAddressList.add(Alabama);
        employeeAddressList.add(Oklohama);
        employeeAddressList.add(Michigan);

        Employee emp1 = new Employee("Tony", "Squash", employeeAddressList, 12345, 'M', 35, 837829323L);
        Employee emp2 = new Employee("Ram", "Dev", employeeAddressList, 12346, 'M', 45, 289489842L);
        Employee emp3 = new Employee("Gita", "Devi", employeeAddressList, 12347, 'F', 36, 344225443L);
        Employee emp4 = new Employee("Dan", "Lift", employeeAddressList, 12348, 'F', 44, 543562244L);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        Company com1 = new Company("Nabil", 6, 78399216, employeeList);
        Company com2 = new Company("Freezy", 4, 8792363, employeeList);
        Company com3 = new Company("Wemmy", 8, 73279832, employeeList);

        String info = com2.getEmployee().get(1).getEmpAddress().get(2).getStreetName();
//        System.out.println(info);


//    int temp = 30;
//            if (temp >30)
//        {
//            System.out.println("It is a hot day.");
//            System.out.println("Drink a lot of water.");
//        }
//            else if (temp >20 && temp <=30)
//            System.out.println("It's a beautiful day.");
//            else
//            System.out.println("It is cold.");


//            int income = 80_000;
//            boolean hasHighIncome = (income > 100_000);
////        System.out.println(hasHighIncome);

//        int income = 300_000;
//        if (income <100_000)
//            System.out.println("Is in third class");
//        else if (income > 100_000 && income <= 200_000)
//            System.out.println("Is in second class");
//        else {
//            System.out.println("Is in first class");
//            System.out.println("Is richy rich");


//            int income = 300_000;
//            String className = income > 200_000 ? "First" : "Economy";
//            String className1 = income > 500_000 ? "Pilot" : "Co-pilot";
//        System.out.println(className);
//        System.out.println(className1);

//        String role = "admin";
//        if (role == "admin")
//            System.out.println("You are an admin");
//        else if (role == "moderator")
//            System.out.println("You are a moderator");
//        else
//            System.out.println("You are a guest");

//        String role = "prof";
//
//            switch (role) {
//                case "admin":
//                System.out.println("You are an admin");
//                break;
//
//                case "staff":
//                    System.out.println("You are a staff");
//                    break;
//
//                default:
//                    System.out.println("You are a guest");
//        }


//        int status = 2;
//
//        switch (status) {
//            case 1:
//                System.out.println("You are in F1 status");
//                break;
//
//            case 2:
//                System.out.println("You are in H1 status");
//                break;
//
//            default:
//                System.out.println("Need to maintain the status");
//    }

        // FOR LOOP

//        for (int i = 5; i > 0; i--) {
//            System.out.println("Hello Muskan " + i);
//        }

        // WHILE LOOP
//        int i = 3;
//        while (i > 0) {
//            System.out.println ("Hello Muskan " + i);
//            i --;
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scan.next();
//        System.out.println(name);
//
//        System.out.print("Age: ");
//        int age = scan.nextInt();
//        System.out.println(age);
//
//        System.out.println("Thank you " + name + "!!" + " You are " + age + " years old.");


//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner.nextLine().toLowerCase();
//            System.out.println(input);


        // Do while loop --->>> But i don't see any difference than WHILE LOOP, when I execute the code!!
//            Scanner scanner = new Scanner(System.in);
//            String input = "";
//            do {
//                System.out.print("Input: ");
//                input = scanner.nextLine().toLowerCase();
//                System.out.println(input);
//            } while (!input.equals("quit"));


//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//            System.out.print("Input: ");
//            input = scanner.nextLine().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

        // FOR EACH LOOP

        String [] fruits = {"Apple", "Orange", "Grape"};

//        for (String fruit : fruits)
//            System.out.println(fruit);


    }
        }



