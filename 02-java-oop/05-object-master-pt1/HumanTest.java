public class HumanTest {
    public static void main(String[] args) {
        Human tricia = new Human();
        Human brian = new Human();

        System.out.println(tricia.getHealth());
        System.out.println(brian.getHealth());
        tricia.attack(brian);
        System.out.println(brian.getHealth());
    }
}
