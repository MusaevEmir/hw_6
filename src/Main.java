public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1234);
        boss.setDamage(500);
        boss.setName("Boss");
        boss.weapon.setWeaponName("Blunderbuss");
        boss.weapon.setWeaponType(WeaponType.FIREARMS);
        System.out.println("Health: " + boss.getHealth() + "Damage: "
                + boss.getDamage() + "Name: " + boss.getName() + "Weapon: " + boss.weapon.getWeaponName() +
                "Type weapon" + boss.weapon.getWeaponType());
    }
}