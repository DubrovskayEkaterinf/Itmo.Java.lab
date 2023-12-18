package laboratory3;

public class Tree {
    public String name;
    public Boolean alive;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, Boolean alive, int age) {
        this.name = name;
        this.alive = alive;
        this.age = age;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}

