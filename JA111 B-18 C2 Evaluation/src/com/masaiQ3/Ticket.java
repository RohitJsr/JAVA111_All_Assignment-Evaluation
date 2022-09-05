package com.masaiQ3;

import java.util.Scanner;

public class Ticket {
    int ticketid;
    int price;
    static int availableTickets;
    private int totalAmount;

    public int calculateTicketCost(int nooftickets){

        while(nooftickets > availableTickets && nooftickets !=0) {
            availableTickets = availableTickets - 1;
            totalAmount = nooftickets * availableTickets;
            return totalAmount;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookings;

        System.out.println("Enter Number Of Bookings");

        bookings = sc.nextInt();

        System.out.println("Enter no of bookings"+" "+bookings);

        Ticket tic = new Ticket();

        System.out.println("Enter Available Tickets");

        availableTickets = sc.nextInt();

        System.out.println("Enter The available tickets"+" "+ availableTickets);

        System.out.println("Enter the price of ticket");

        tic.price = sc.nextInt();

        System.out.println("Enter the price"+" "+ tic.price);

        System.out.println("Enter the number of tickets");

        int cc;

        cc = sc.nextInt();

        tic.calculateTicketCost(cc);

        System.out.println("Enter the no of ticket"+" "+tic.calculateTicketCost(cc));


        System.out.println("Available Tickets"+" "+availableTickets);


        System.out.println("Total Amount"+" "+ tic.calculateTicketCost(tic.totalAmount));


        System.out.println("Available Tickets After Booking "+" "+availableTickets);


    }
}



