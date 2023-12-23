public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("mudit", "Sword", 100);
        player.damageByGun1();
        player.damageByGun1();
        player.heal();
        System.out.println(player.getHealth());
        player.damagebyGun2();

    }
}