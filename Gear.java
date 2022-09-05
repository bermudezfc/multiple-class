public class Gear {
    // Gear Attributes
    String type;
    String name;
    String rarity;
    float weight;
    String description;
    boolean isElemental;
    boolean isStraightFire;

    // Methods
    public void showHelmAttributes() {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Rarity: " + rarity);
        System.out.println("Weight: " + weight + " Kilograms");
        System.out.println("Description: " + description);
        System.out.println("Is Elemental: " + isElemental);
    }
    public void showGearAttributes() {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Rarity: " + rarity);
        System.out.println("Weight: " + weight);
        System.out.println("Description: " + description);
        System.out.println("does he have the drip? = " + isStraightFire);
    }
        

        
   
        



}
