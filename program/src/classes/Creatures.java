package classes;

import java.time.LocalDate;

public abstract class Creatures {
    private int crId;
    private int age;
    private int actualDate = LocalDate.EPOCH.getYear();
    private int birthDate;
    private char sex;

    public Creatures(int crId, int age, char sex) {
        this.crId = crId;
        this.age = age;
        this.birthDate = actualDate - age;
        this.sex = sex;
    }

    public abstract String display();

    public int getBirthDate() {
        return birthDate;
    }

    public int getCrId() {
        return crId;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
}
