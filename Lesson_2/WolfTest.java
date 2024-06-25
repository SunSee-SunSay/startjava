public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setName("Балто");
        wolf.setSex("муж");
        wolf.setColor("серый");
        wolf.setWeight(40);
        wolf.setAge(8);

        System.out.println(wolf.getName());
        System.out.println(wolf.getSex());
        System.out.println(wolf.getColor());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}