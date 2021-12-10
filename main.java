package zxc;

public class main {
    public static void main(String[] args){
        Flower flower = new Flower("green");

        System.out.println("is faded: " + flower.faded());
        flower.blossom();
        System.out.println("is faded: " + flower.faded());

        System.out.println("Bud color: " + flower.bud.color);
    }
}