public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,100,80,30);
        Fighter f2 = new Fighter("B",15,70,90,25);

        Match m =new Match(f1,f2,75,95);

        m.run();
    }
}