public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.name = "Балто";
        wolf.sex = "муж";
        wolf.color = "серый";
        wolf.weight = 40;
        wolf.age = 8;

        System.out.println(wolf.name);
        System.out.println(wolf.sex);
        System.out.println(wolf.color);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}