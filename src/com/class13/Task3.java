package com.class13;
import java.util.Scanner;
//Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL
public class Task3 {

	Scanner input=new Scanner(System.in);
    System.out.println("Moms first name?");
    String momsName=input.nextLine();
    System.out.println("Dad’s first name?");
    String dadName=input.nextLine();
    System.out.println("Boy or Girl?");
    String jender=input.nextLine();
    
    if(jender.equalsIgnoreCase("boy"))System.out.println(dadName.substring(0,dadName.length()/2)+momsName.substring(momsName.length()/2));
    if(jender.equalsIgnoreCase("girl"))System.out.println(momsName.substring(0, momsName.length()/2)+dadName.substring(dadName.length()/2));
