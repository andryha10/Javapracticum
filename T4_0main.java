package T4_0;


public class T4_0main {
    public static void main(){
        String mas[] = {"mes1", "mes2", "mes3"};
        ConnectionManager cm = new ConnMan(mas);
        while(cm.existConnection()){
            cm.getConnection().show();
        }
    }
}