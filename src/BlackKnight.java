public class BlackKnight {

    public String FullName;
    Integer arms = 2;
    public Integer legs = 2;
    public Integer head = 1;
    public boolean alive;

    public BlackKnight(String FullName, Integer arms, Integer legs, Integer head, boolean alive) {

        this.FullName = FullName;
        this.arms = arms;
        this.legs = legs;
        this.head = head;
        this.alive = alive;


        public Integer cutOffArm () {
            if (arms > 0) {
                System.out.println("You lost one arm");
                arms--;
            } else {
                System.out.println("Sorry, no arms anymore");

            }

        }
        public Integer cutOffLeg () {
            if (legs > 0) {
                System.out.println("You lost one leg");
                legs--;
            } else {
                System.out.println("Sorry, no legs anymore");
            }
        }

        public Integer cutOffHead() {
            if (head == 1) {
                System.out.println("You lost a head");
                head--;
            } else {
                System.out.println("Sorry, you lost your head");
            }
        }

        public static Boolean alive () {
            if (arms == 0 && legs == 0 && head == 0) {
                System.out.println("You are dead");
            }
        }
    }
}
