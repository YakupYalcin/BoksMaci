public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name,int damage,int health,int weight,double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    public int hit (Fighter foe){
        System.out.println(" ------------------ ");
        System.out.println(this.name +" => "+foe.name +" " + this.damage + "" + " hasar vurdu !" );
        if (isDodge()){
            System.out.println(foe.name + " " + " gelen hasarı blokladı ! ");
            return foe.health;
        }
        if ((foe.health-this.damage< 0)){
            return 0;
        }
        return foe.health-this.damage;
    }

    boolean isDodge(){
        double randomValue=Math.random()*100;
        return randomValue<this.dodge;
    }

}
