import java.io.*;

public class Methods {

    public void serialize(File file, Serializable object) throws Exception {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();

    }

    public Serializable deserialize(File file) throws Exception {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable object = (Serializable) ois.readObject();
        ois.close();
        is.close();
        return object;

    }
}
