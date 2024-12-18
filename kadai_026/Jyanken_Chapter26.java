package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    // 自分の手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("じゃんけんの手を入力してください (r:グー, s:チョキ, p:パー): ");
        String choice = scanner.nextLine();
        
        // 入力がr, s, p以外の場合は再入力
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な入力です。r, s, pのいずれかを入力してください:");
            choice = scanner.nextLine();
        }
        return choice;
    }

    // 対戦相手の手を乱数で選ぶメソッド
    public String getRandom() {
        String[] hands = {"r", "s", "p"}; // じゃんけんの手
        int randomIndex = (int) Math.floor(Math.random() * 3); // 0, 1, 2のいずれか
        return hands[randomIndex];
    }

    // じゃんけんの勝敗を判定するメソッド
    public void playGame(HashMap<String, String> handMap) {
        String myChoice = getMyChoice();          // 自分の手
        String opponentChoice = getRandom();      // 対戦相手の手

        System.out.println("自分の手: " + handMap.get(myChoice));
        System.out.println("対戦相手の手: " + handMap.get(opponentChoice));

        // 勝敗の判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです！");
        } else {
            System.out.println("自分の負けです。");
        }
    }
}
