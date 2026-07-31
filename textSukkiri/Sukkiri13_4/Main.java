package textSukkiri.Sukkiri13_4;

public class Main {
    public static void main(String args[]){
        Wand wand = new Wand();
        Wizard wizard = new Wizard();
        try{
            wand.setName("A");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try{
            wand.setPower(0.2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try{
            wizard.setName("B");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try{
            wizard.setMp(-204);
            wizard.setWand(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try{
            wizard.setHp(-1080);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try{
            wizard.setWand(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
