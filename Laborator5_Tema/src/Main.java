import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IFileInputOutputService ioService= new FileInputOutputService();
        List<Player> playerFromFile = ioService.getUsersFromFile("src/final_data.csv");

        Collections.sort(playerFromFile);

        for (var player: playerFromFile) {
            System.out.println(player);
        }

    }
}