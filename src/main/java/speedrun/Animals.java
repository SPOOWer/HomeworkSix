package speedrun;

public abstract class Animals {
    protected String name;
    protected int age;
    protected int run;
    protected int swim;



    public Animals(String name, int age, int run, int swim) {
        setName(name);
        System.out.print(this.name);
        setAge(age);
        setRun(run);
        setSwim(swim);


    }

    public String getName() {
        return name;
    }

    public Animals setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animals setAge(int age) {
        this.age = age;
        return this;
    }

    public int getRun() {
        return run;
    }

    public Animals setRun(int run) {
        this.run = run;
        return this;
    }

    public int getSwim() {
        return swim;
    }

    public Animals setSwim(int swim) {
        this.swim = swim;
        return this;
    }
}