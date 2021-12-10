package classes;

public abstract class creatures {
    private int crId;
    private int age;
    private int birthDate;
    private char sex;

    public creatures(int crId,int actualDate, int age, char sex) {
        this.crId = crId;
        this.age = age;
        this.birthDate = actualDate - age;
        this.sex = sex;
    }

    public abstract void display();

    public int getBirthDate() {
        return birthDate;
    }

    public void setAge(int age) {
        this.age = age;
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