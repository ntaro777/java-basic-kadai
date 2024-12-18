package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 各子クラスのインスタンスを作成して紹介を実行する
        Kato_Chapter18 taro = new KatoTaro_Chapter18();
        taro.execIntroduce();

        Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.execIntroduce();

        Kato_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.execIntroduce();
    }
}
