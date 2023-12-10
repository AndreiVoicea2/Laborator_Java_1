import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileInputOutputService implements IFileInputOutputService, Runnable {

    @Override
    public List<Player> getUsersFromFile(String filePath) {
        List<Player> userList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            bufferedReader.readLine(); // this will read the first line

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(",");
                Player player = new Player(lineParts[0], lineParts[1], lineParts[2], Integer.parseInt(lineParts[3]), Integer.parseInt(lineParts[4]), lineParts[5], Float.parseFloat(lineParts[6]),Float.parseFloat(lineParts[7]), Float.parseFloat(lineParts[8]), Float.parseFloat(lineParts[9]), Float.parseFloat(lineParts[10]), Float.parseFloat(lineParts[11]), Float.parseFloat(lineParts[12]), Float.parseFloat(lineParts[13]), Float.parseFloat(lineParts[14]), Float.parseFloat(lineParts[15]), Float.parseFloat(lineParts[16]), Float.parseFloat(lineParts[17]), Float.parseFloat(lineParts[18]), Float.parseFloat(lineParts[19]), Float.parseFloat(lineParts[20]), Float.parseFloat(lineParts[21]), Float.parseFloat(lineParts[22]), Float.parseFloat(lineParts[23]));
                userList.add(player);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return userList;
    }


    @Override
    public void run() {

        String path = "src/final_data.csv";

        List<Player> playerFromFile = getUsersFromFile("src/final_data.csv");

        Collections.sort(playerFromFile);

        for (var player: playerFromFile) {
             System.out.println(player);
        }

    }
}
