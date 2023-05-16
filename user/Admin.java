package user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Admin extends User{
    public Admin(String name) {
        super(name);
    }
    public static void readLogs(String logFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
