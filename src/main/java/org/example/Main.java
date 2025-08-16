package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    private static void runDemo() {
        // Nesneler
        Healthplan hp1 = new Healthplan(1, "Company Basic", Plan.BASIC);


        Employee e1 = new Employee(100, "Ada Lovelace", "ada@company.com", "pass123", new String[3]);
        Employee e2 = new Employee(101, "Alan Turing", "alan@company.com", "pass456", new String[3]);

        Company c1 = new Company(10, "Workintech", 1_250_000.0, new String[5]);

        // Dizilere ekleme denemeleri
        e1.addHealthPlan(0, hp1.getName());
        e1.addHealthPlan(5, "OUT_OF_RANGE"); // aralık dışı uyarısı

        c1.addEmployee(0, e1.getFullName());
        c1.addEmployee(0, e2.getFullName()); // dolu uyarısı
        c1.addEmployee(1, e2.getFullName());
        c1.addEmployee(9, "Kimse"); // aralık dışı uyarısı

        // Negatif giro denemesi (encapsulation kuralı)
        c1.setGiro(-5000); // 0'a sabitlenir

        // toString çağrıları
        System.out.println(hp1);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(c1);
    }
    }
