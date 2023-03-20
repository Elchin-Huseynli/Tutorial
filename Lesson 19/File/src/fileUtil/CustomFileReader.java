package fileUtil;

import java.io.*;

public class CustomFileReader {
    public static String readFileString(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found!");
        }
        else {
            try {
                Reader reader = new FileReader(file);
                int i = 0;
                while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return fileName;
    }

    public static String readFileByte(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found!");
        }
        else {
            try {
                InputStream inputStream = new FileInputStream(file);
                int i = 0;
                while ((i = inputStream.read()) != -1) {
                    System.out.print((char) i);
                }
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return fileName;
    }


    public static String readerFileObject(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found!");
        }
        else {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                User user = (User) objectInputStream.readObject();
                System.out.println(user);
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return fileName;
    }
}
