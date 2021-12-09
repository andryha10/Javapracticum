package T4_0;

public class ConnMan {
    private Conn cons[];
    private int n;
    private int current;

    ConnMan(){
        current = 0;
    }

    ConnMan(int n){
        this.n = n;
        cons = new Conn[n];
        current = 0;
    }

    ConnMan(String[] mas){
        current = 0;
        this.n = mas.length;
        cons = new Conn[this.n];
        for(int i = 0; i < mas.length; i++){
            cons[i] = new Conn(mas[i]);
        }
    }

    public Conn getConnection(int i){
        assert (i>=0): "Negative index";
        if(i >= n)
            return new Conn("No connection");
        return cons[i];
    }

    public Conn getConnection(){
        assert (current<n): "no connection";
        return cons[current++];
    }

    public boolean existConnection(){
        return current<n;
    }
}
