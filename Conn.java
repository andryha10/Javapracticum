package T4_0;
public class Conn {
    String message = "No message";

    public Conn(){
    }

    public Conn(String s){
        this.message = s;
    }

    void show(){
        System.out.println("connectoin message: " + message);
    }
}