public class Rail extends Pereskoda {
    public Rail(double height,double lenght) {
        super(height, 50);
    }

    @Override
    public void overcome(Participal participal) {
        if (participal.getRun() > lenght) {
            participal.run();
        } else {
            System.out.println("не пробежал"+"\n"+participal.getName());
        }
    }

}