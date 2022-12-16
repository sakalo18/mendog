public abstract class Participal {
    String name;
    double jump;
    double run;

    public Participal(
            String name,
            double jump,
            double run

    ) {
        this.jump = jump;
        this.run = run;
        this.name = name;
    }


    public void jump() {
        System.out.println("участник" +"\n"+ name +"\n"+ "прыгнул");
    }

    public void run() {
        System.out.println("участник"+"\n"+  name +"\n"+ "пробежал");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }
}