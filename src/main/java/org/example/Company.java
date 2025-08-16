package org.example;
import java.util.Arrays;
public class Company {
    private String name;
    private int id;
    private double giro;
    private String[] developerNames;

    public Company( int id, String name, double giro, String[] developerNames) {
        this.name = name;
        this.id = id;
        this.giro = clampGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            System.out.println("developerNames dizisi tanımlı değil.");
            return;
        }
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
            System.out.println("Çalışan eklendi: " + name + " (index " + index + ")");
        } else {
            System.out.println("Index " + index + " dolu: " + developerNames[index]);
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGiro() { return giro; }
    public void setGiro(double giro) { this.giro = clampGiro(giro); }

    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    private double clampGiro(double value) {
        return value < 0 ? 0 : value;
    }

    @Override
    public String toString() {
        return "Company{id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
