package com.addressbook;
import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        List<AddressBook> c=new ArrayList<AddressBook>(); //Collection of data inside this//Acees functinality of list iterator
        Scanner sc=new Scanner(System.in); //For taking input as a string
        Scanner sc1=new Scanner(System.in); //For taking input as a integer
        int ch ; //choice variable
        do {

            System.out.println("**** WELCOME TO ADDRESSBOOK PROGRAM ****");
            System.out.println("1.ADD");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice:");
            ch=sc.nextInt();
            switch (ch){
                case 1:

                    System.out.print("Enter the Id:");
                    int id=sc.nextInt();
                    System.out.print("Enter the First Name:");
                    String firstname=sc1.nextLine();
                    System.out.print("Enter the Last Name:");
                    String lastName=sc1.nextLine();
                    System.out.print("Enter the Address:");
                    String address=sc1.nextLine();
                    System.out.print("Enter the City:");
                    String city=sc1.nextLine();
                    System.out.print("Enter the State:");
                    String state=sc1.nextLine();
                    System.out.print("Enter the Zip:");
                    int zip=sc.nextInt();
                    System.out.print("Enter the PhoneNumber:");
                    int phoneNumber=sc.nextInt();
                    System.out.print("Enter the Email:");
                    String email=sc1.nextLine();
                    c.add(new AddressBook(id,firstname,lastName,address,city,state,zip,phoneNumber,email));
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    Iterator<AddressBook> i= c.iterator();//function retrieve each record one by one
                    while(i.hasNext()){
                        AddressBook a=i.next();
                        System.out.println(a);

                    }
                    System.out.println("---------------------------------");
                    break;

                case 3:
                    boolean found=false;  //
                    System.out.println("Enter Id For search:");
                     id=sc.nextInt();
                    System.out.println("---------------------------------");
                    i= c.iterator();//function retrieve each record one by one
                    while(i.hasNext()){
                        AddressBook a=i.next();
                        if (a.getId() == id){
                            System.out.println(a);
                            found = true;
                        }
                    }
                    System.out.println("---------------------------------");
                    if (!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("---------------------------------");
                    break;
                case 4:
                     found=false;  // Delete the record
                    System.out.println("Enter Id to Delete Record:");
                    id=sc.nextInt();
                    System.out.println("---------------------------------");
                    i= c.iterator();//function retrieve each record one by one
                    while(i.hasNext()){
                        AddressBook a=i.next();
                        if (a.getId() == id){
                           i.remove();;
                            found = true;
                        }
                    }
                    System.out.println("---------------------------------");
                    if (!found){
                        System.out.println("Record not found");
                    }
                    else {
                        System.out.println("Record Delete SucessFully:");
                    }
                    System.out.println("---------------------------------");
                    break;

                case 5:
                    found=false;  // Delete the record
                    System.out.println("Enter Id to Uodate Record:");
                    id=sc.nextInt();
                    System.out.println("---------------------------------");
                   ListIterator<AddressBook>li= c.listIterator();//fInitialize collection to list iterator
                    while(li.hasNext()){
                        AddressBook a=li.next();
                        if (a.getId() == id){
                            System.out.print("Enter the Id:");
                             id=sc.nextInt();
                            System.out.print("Enter the First Name:");
                             firstname=sc1.nextLine();
                            System.out.print("Enter the Last Name:");
                             lastName=sc1.nextLine();
                            System.out.print("Enter the Address:");
                             address=sc1.nextLine();
                            System.out.print("Enter the City:");
                             city=sc1.nextLine();
                            System.out.print("Enter the State:");
                             state=sc1.nextLine();
                            System.out.print("Enter the Zip:");
                             zip=sc.nextInt();
                            System.out.print("Enter the PhoneNumber:");
                             phoneNumber=sc.nextInt();
                            System.out.print("Enter the Email:");
                             email=sc1.nextLine();
                            li.set(new AddressBook(id,firstname,lastName, address, city,  state, zip, phoneNumber, email));
                            found = true;
                        }
                    }
                    System.out.println("---------------------------------");
                    if (!found){
                        System.out.println("Record not found");
                    }
                    else {
                        System.out.println("Record Updated SucessFully:");
                    }
                    System.out.println("---------------------------------");
                    break;
            }
        }while(ch!=0);
    }
}
