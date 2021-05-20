/*
 Ana Paula Umbelino
23 March 2021
HealthWorkerApp.java
 */
package week4hw;
import java.io.*;

public class HealthWorkerApp {


    public static void main(String args[]) {

    // Create two objects using constructor
    HealthWorker empOne = new HealthWorker ("Maria");
    HealthWorker empTwo = new HealthWorker ( "Gustavo");


    // Requesting methods for each object created
    empOne.lastName("Rodriges");
    empOne.HWorkID("HW201956");
    empOne.MonthSalary(1800);
    empOne.printHealthWorker();



    empTwo.lastName("Navarro");
    empTwo.HWorkID("HW201945");
    empTwo.MonthSalary(1600);
    empTwo.printHealthWorker();


    // Requesting methods for increment the salary

    System.out.println( empOne.fName + " new Salary after increment:  " + empOne.getincriment());
    System.out.println( empTwo.fName + " new Salary after increment:  " + empTwo.getincriment());


    }
