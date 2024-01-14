/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentlist;

/**
 *
 * @author Erika
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> students = new HashMap<>();
        System.out.println("Enter student number and first name:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + (i + 1) + " number: ");
            String number = input.nextLine();
            while (number.length() != 11) {
                System.out.println("Invalid student number. Please enter a 11-digit number.");
                System.out.print("Student " + (i + 1) + " number: ");
                number = input.nextLine();
            }
            System.out.print("Student " + (i + 1) + " first name: ");
            String name = input.nextLine();
            students.put(number, name);
        }
        System.out.println("The keys and values of the map are:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Deleting the mapping of the third entry...");
        int i = 0;
        for (Map.Entry<String, String> entry : students.entrySet()) {
            if (i == 2) {
                students.remove(entry.getKey());
                break;
            }
            i++;
        }
        System.out.print("Enter your student number: ");
        String number = input.nextLine();
        while (number.length() != 11) {
            System.out.println("Invalid student number. Please enter a 11-digit number.");
            System.out.print("Enter your student number: ");
            number = input.nextLine();
        }
        System.out.print("Enter your first name: ");
        String name = input.nextLine();
        students.put(number, name);
        System.out.println("Student Lists:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
