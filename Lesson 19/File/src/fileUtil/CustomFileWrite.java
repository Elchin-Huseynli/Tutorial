package fileUtil;

import java.io.*;

public class CustomFileWrite {
    public static String writeFileString(String fileName, String data) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            Writer writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return fileName;
    }


    public static String writeFileByte(String fileName, String data) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.getMessage();
        }
        return fileName;
    }


    public static String writeFileObject(String fileName, User user) {
        File file = new File(fileName);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                objectOutputStream.writeObject(user);
                objectOutputStream.close();
            }
            catch (IOException e) {
                e.getMessage();
            }

        return fileName;
    }
}