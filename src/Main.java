import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("FileEmployee.txt");

        Methods m = new Methods();
        Emploee e = new Emploee("Maks","Bilozir", 1200.00,1);
        Emploee e2 = new Emploee("Oksana","Bilozir", 1200.00,3);
        Emploee e3 = new Emploee("Stepan","Bilozir", 1200.00,2);
        Emploee e4 = new Emploee("Tania","Bilozir", 1200.00,4);
        m.serialize(file,e);
        System.out.println(m.deserialize(file).toString());

        List<Emploee> ems = new ArrayList<>();
        ems.add(e);
        ems.add(e2);
        ems.add(e3);
        ems.add(e4);
        Methods m2 = new Methods();
        m2.serialize(file, (Serializable) ems);
        System.out.println(m2.deserialize(file).toString());


    }
}
