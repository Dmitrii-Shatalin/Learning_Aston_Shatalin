import java.io.*;

public class Processor {

    public void writeToFile(String filename, String data) throws ProcessingException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
        } catch (IOException e) {
            throw new ProcessingException("Ошибка при записи в файл: " + filename, e);
        }
    }

    public String readFromFile(String filename) throws ProcessingException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new ProcessingException("Ошибка при чтении из файла: " + filename, e);
        }
        return result.toString();
    }
}