public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Weapon Rifle = new Weapon();

        Rifle.name = "Sniper RIfle";
        Rifle.damage = 357;
        Rifle.weight = 5.0f;
        Rifle.rarity = "Legendary";
        Rifle.description = "Sniper Rifle owned by rainier!";

        Rifle.showAllRifleAttributes();
      
        Gear Helm = new Gear();

        Helm.type = "biker helmet";
        Helm.name = "Lakad Matatag Helmet";
        Helm.rarity = "Very Rare";
        Helm.weight = 100.0f;
        Helm.description = "LAKAD MATATAG!";
        Helm.isElemental = true;

        Helm.showHelmAttributes();
        
        Gear Boots = new Gear();

        Boots.type = "shoes";
        Boots.name = "Black Air force 1s";
        Boots.rarity = "Extremely Rare";
        Boots.weight = 70.9f;
        Boots.description = "ZAMN BRO U GOT THE DRIP!";
        Boots.isStraightFire = true;

    
        Boots.showGearAttributes();


    }
}
