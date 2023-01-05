package assignment01;
/**
 * File name: MyHealthDataTest.java
 * Author: Lin Chen, 041053912
 * Course: CST8284-304-OOP
 * Assignment: Lab1
 * Date: 2022-09-10
 * Professor: Hesham Saadawi
 * Purpose: to write a program in java for digitization of health records of patients 
 * to be shared using computer systems to facilitate better patient care.
 * Class list: 1.MyHealthDataTest.java; 2.MyHealthData.java.
 * 
 */
import java.time.LocalDate;
import java.util.Scanner;
/**
 * Purpose: input and output the health data for the patients and do some calculations
 * for the values of the data.
 * @author Lin
 * @version 1.2
 * @see java.lang.Object
 * @since openjdk version "11.0.15" 
 */
public class MyHealthDataTest 
{
/**
 * Default Constructor(no arguments)
 */
	public MyHealthDataTest()
	{		
	}
/**
 * This is the entry point for the application.
 * @param args command line arguments are used by this program.
 */
	public static void main(String[] args)
	{
/**
 * to get patients' health data from keyboard.
 */
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String firstName = keyboard.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = keyboard.nextLine();
		System.out.print("Please enter your gender: ");
		String gender = keyboard.nextLine();
		System.out.print("Please enter your date of birth: ");
		int birthYear = keyboard.nextInt();
		System.out.print("Please enter your current year: ");
		int currentYear = LocalDate.now().getYear();
		System.out.println(currentYear);
		System.out.print("Please enter your height(inches): ");
		Double height = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Please enter your weight(pounds): ");
		Double weight = keyboard.nextDouble();
		keyboard.nextLine();
		keyboard.close();
/**
 * to instantiate an object of the class MyHealthData.		
 */
		MyHealthData data = new MyHealthData(firstName, lastName, gender,birthYear,currentYear,height,weight);
/**
 * to get the displayMyHealthData method for this MyHealthDataTest.
 */
		data.displayMyHealthData();
		
	}
}
