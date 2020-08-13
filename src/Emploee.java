import java.io.Serializable;

public class Emploee implements Serializable {
    private String lastName;
    private String firsName;
    private transient double salary;
    private int id;

    public Emploee(String lastName, String firsName, double salary, int id) {
        this.lastName = lastName;
        this.firsName = firsName;
        this.salary = salary;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "lastName='" + lastName + '\'' +
                ", firsName='" + firsName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
