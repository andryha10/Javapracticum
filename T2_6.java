package zxc;
import zxc.House;
import java.util.Objects;
import java.util.Scanner;


public class T2_6{

    static void print_same_rooms(House[] houses, int rooms){
        System.out.println("Houses with same rooms: " + rooms);
        for(House house:  houses){
            if(Objects.equals(house.rooms, rooms)) house.show();
        }
    }

    static void print_rooms_over_floors(House[] houses, int rooms, int n, int m){
        System.out.println("houses with " + rooms + " rooms that are between" + n + "and" + m+" floors ");
        for(House house: houses){
            if((Objects.equals(house.rooms, rooms)) && (house.floor >=n && house.floor <= m)) house.show();
        }
    }

    static void print_square_more_than(House[] houses, int n){
        System.out.println("Houses that have square more than " + n );
        for(House house: houses){
            if((house.square > n)) house.show();
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the ammount of houses");
        int n = console.nextInt();

        House[] houses = new House[n];

        for(int i = 0; i < n; i++){
            houses[i] = new House();
        }

        print_same_rooms(houses, 3);
        print_rooms_over_floors(houses, 2, 4, 7);
        print_square_more_than(houses, 65);

    }
}