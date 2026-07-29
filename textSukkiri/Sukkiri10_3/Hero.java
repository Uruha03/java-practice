package textSukkiri.Sukkiri10_3;

public class Hero {
    String name;
    int hp;

    public void damage(int damage){
        hp -= damage;
	    System.out.println(name + "の体力 " + hp);
    }
}
