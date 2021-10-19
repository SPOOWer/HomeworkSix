package speedrun;

public class Dog extends Animals {

    public Dog(String name, int age, int run, int swim) {
        super(name, age, run, swim);
    }


    @Override
    public Animals setName(String name) {
        String newName = "Пёс " + name + " ";
        this.name = newName;
        return this;
    }

    @Override
    public Animals setAge(int age) {
        if (age >= 1 && age < 4) {
            System.out.print(age + " год(а),");
        } else {
            System.out.print(age + " лет,");
        }
        return this;
    }

    @Override
    public Animals setRun(int run) {
        this.run = run;
        if (run <= 600) {
            System.out.print(" пробежал " + run + " метра(ов),");
        } else {
            System.out.print(" устал, и не смог пробежать " + run + " метра(ов),");
        }
        return this;
    }

    @Override
    public Animals setSwim(int swim) {
        this.swim = swim;
        if (swim <= 10) {
            System.out.print(" проплыл " + swim + " метра(ов).");
        } else {
            System.out.println(" не умеет плавать.");
        }
        return this;
    }

}
