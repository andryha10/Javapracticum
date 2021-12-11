package zxc;

import java.util.Scanner;

public class House {
    int nmb;
    int square;
    int floor;
    int rooms;
    String street;
    String type;
    float time;

    public House(int nmb, int square,int floor,int rooms,String street,String type,float time) {
        this.nmb = nmb;
        this.square = square;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.type = type;
        this.time = time;
    }

    public House() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter nmb: ");
        this.nmb = console.nextInt();
        console.nextLine();
        System.out.println("Enter square: ");
        this.square = console.nextInt();
        console.nextLine();
        System.out.println("Enter floor: ");
        this.floor = console.nextInt();
        console.nextLine();
        System.out.println("Enter rooms: ");
        this.rooms = console.nextInt();
        console.nextLine();
        System.out.println("Enter street: ");
        this.street = console.nextLine();
        System.out.println("Enter type: ");
        this.type = console.nextLine();
        System.out.println("Enter time: ");
        this.time = console.nextFloat();
    }

    public void show() {
        System.out.printf("\nnmb: %d\nsquare: %s\nfloor: %s\nrooms: %d\nstreet: %s\ntype: %f\ntime: %s\n\n", this.nmb, this.square, this.floor, this.rooms, this.street, this.type, this.time);
    }

}