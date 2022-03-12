package pl.flaaaxxx;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        User user = new User("Joanna", "JoannaLastName", "Main street");

        // zapisanie pliku
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serialization_file.bin"))) {
            outputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serialization_file.bin"))) {
            User readObject = (User) inputStream.readObject();
            System.out.println(readObject.getName());
            System.out.println(readObject.getLastname());
            System.out.println(readObject.getStreet());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
