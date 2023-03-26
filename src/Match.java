public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if (isCheck()){
            double randomNumber=Math.random()*100;
            if (randomNumber<50){
                System.out.println("Müsabakaya" + " " + f1.name + " " + " başladı !");
                while (f1.health > 0 && f2.health > 0){
                    f2.health=f1.hit(f2);
                    if (isWin())break;

                    f1.health=f2.hit(f1);
                    if (isWin())break;
                printScore();

                }
            }else{
                System.out.println("Müsabakaya" + " " + f2.name + " " + " başladı !");
                while (f1.health>0 && f2.health>0){
                    f1.health=f2.hit(f1);
                    if (isWin())break;


                    f2.health=f1.hit(f2);
                    if (isWin())break;
                }
                printScore();


            }


        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor !");
        }
    }
    boolean isCheck(){
        return (f1.weight>=minWeight && f1.weight<=maxWeight)&&(f2.weight>=minWeight &&f2.weight<=maxWeight);
    }



    boolean isWin(){
        if (f1.health == 0){
            System.out.println("Müsabakayı "+ "  " + f2.name + " " + "kazandı !");
            return true;
        }if (f2.health == 0 ){
            System.out.println(" Müsabakayı " + " " + f1.name + " " + "kazandı  !");
            return true;
        }
            return false;
    }



    void printScore(){
        System.out.println("**************");
        System.out.println(f1.name + " " +"  Kalan can : " + " " + f1.health);
        System.out.println(f2.name + " " +"  Kalan can : " + " " + f2.health);
    }
}
