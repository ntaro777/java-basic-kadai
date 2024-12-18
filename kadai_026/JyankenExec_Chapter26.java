package kadai_026;

import java.util.HashMap;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        // じゃんけんの手をマッピング
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // じゃんけんクラスのインスタンスを作成し、ゲームを実行
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
        jyanken.playGame(handMap);
    }
}
