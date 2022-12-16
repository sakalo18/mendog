public class Main {
    public static void main(String[] args) {
     Men men=new Men("valera",5,45);
     Cat cat=new Cat("barsik",8,70);
     Robot robot=new Robot("valli",2,5);



     Wall wall=new Wall(6,0);
     Rail rail=new Rail(0,50);

     Pereskoda[] pereskoda=new Pereskoda[]{wall,rail};
     Participal[]participals=new Participal[]{cat,robot,men};

     for (Participal participal:participals){
       for (Pereskoda pereskoda1:pereskoda){
           pereskoda1.overcome(participal);
     }
    }
}
}