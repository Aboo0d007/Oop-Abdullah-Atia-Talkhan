/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication97;

/**
 *
 * @author STUDENT
 */
public class JavaApplication97 {



    public static void main(String[] args) {

        Employee emp = new Employee("Ahmed", 101, 5000.0);
        Manager mgr = new Manager("Sara", 102, 10000.0,
                                  "IT", 2000.0);

        Employee empRef = new Manager("Omar", 103, 12000.0,
                                      "HR", 1500.0);
        System.out.println("Employee Bonus: " +
                           emp.calculateBonus());

        System.out.println("Employee Bonus (15%): " +
                           emp.calculateBonus(15));

        System.out.println("Manager Bonus: " +
                           mgr.calculateBonus());

        System.out.println("Manager Bonus (15%): " +
                           mgr.calculateBonus(15));

        System.out.println("Parent Reference Bonus: " +
                           empRef.calculateBonus());

        System.out.println("Parent Reference Bonus (15%): " +
                           empRef.calculateBonus(15));


        System.out.println("\n--- Employee Information ---");
        emp.displayInfo();

        System.out.println("\n--- Manager Information ---");
        mgr.displayInfo();

        System.out.println("\n--- Parent Reference Information ---");
        empRef.displayInfo();


        System.out.println("\n--- Using toString() ---");
        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(empRef);
    }
}
    
    
}
