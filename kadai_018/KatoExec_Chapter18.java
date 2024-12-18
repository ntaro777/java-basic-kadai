package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 各子クラスのインスタンスを作成して紹介を実行する
    	KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.setGivenName();
        taro.execIntroduce();

        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setGivenName();
        ichiro.execIntroduce();

        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}
