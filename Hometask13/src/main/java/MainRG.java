import java.io.*;
public class MainRG {
    public static void main(String[] args) {
        String content = "Romeo: text for Romeo\n" +
                "Text for Romeo\n" +
                "Text for Romeo\n" +
                "Gulieta: text fo Gulieta\n" +
                "text fo Gulieta\n" +
                "text fo Gulieta\n" +
                "text fo Gulieta\n" +
                "Romeo: text for Romeo\n" +
                "Text for Romeo\n" +
                "Text for Romeo";

        try {
            FileWriter writer = new FileWriter("RomeoAndGulieta.txt");
            writer.write(content);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader br = new BufferedReader(new FileReader("RomeoAndGulieta.txt"))) {
            String line = br.readLine();
            BufferedWriter romeoWrite = new BufferedWriter(new FileWriter("Romeo.txt"));
            BufferedWriter gulietaWrite = new BufferedWriter(new FileWriter("Gulieta.txt"));
            while (line != null) {
                while ((line != null) && !(line.startsWith("Gulieta:"))) {
                    romeoWrite.write(line + "\n");
                    line = br.readLine();
                }
                while ((line != null) && !(line.startsWith("Romeo:"))) {
                    gulietaWrite.write(line + "\n");
                    line = br.readLine();
                }
            }
            romeoWrite.close();
            gulietaWrite.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

