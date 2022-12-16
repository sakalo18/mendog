public class Wall extends Pereskoda{
    public Wall(double height, double lenght) {
        super(6, lenght);
    }
    @Override
    public void overcome(Participal participal) {
        if (participal.getJump() > height) {
            participal.jump();
        } else {
            System.out.println(participal.name+"\n"+"не перепрігнул");

        }
    }
}