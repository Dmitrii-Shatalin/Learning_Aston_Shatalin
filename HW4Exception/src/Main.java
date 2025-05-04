public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        String fileName = "output.txt";
        String content = "Hello";

        try {
            processor.writeToFile(fileName, content);
            System.out.println("Данные успешно записаны в файл.");

            String readData = processor.readFromFile(fileName);
            System.out.println("Содержимое файла:\n" + readData);

        } catch (ProcessingException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
            e.printStackTrace();
        }
    }
}