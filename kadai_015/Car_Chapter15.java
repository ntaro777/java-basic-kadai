package kadai_015;

public class Car_Chapter15 {
    private int gear = 1; // 以前のギアを保持するフィールド
    private int speed = 10;

//   // public Car_Chapter15(int gear, int speed) {
//        this.currentGear = gear;
//        this.speed = speed;
//    }

    public void gearChange(int afterGear) {
        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
         this.gear  = afterGear;
         this.speed = switch (afterGear) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            case 4 -> 40;
            case 5 -> 50;
            default -> 10;
        };
    }

    public void run() {
       System.out.println("速度は時速" + this.speed + "kmです");
    }
}