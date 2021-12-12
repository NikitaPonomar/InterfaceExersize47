import java.util.List;

public class Main {
    public static void main(String[] args) {
        ISaveable player = new Monster("novic", 30,40);
        player.write();


        System.out.println(player);




    }
}
