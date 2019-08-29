import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Group group = new Group("java");
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        readFromFile(sb);
        String json = sb.toString();
        Group restoredGroup = gson.fromJson(json, Group.class);
        System.out.println(restoredGroup);

    }

    private static void readFromFile(StringBuilder sb) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                sb.append(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
