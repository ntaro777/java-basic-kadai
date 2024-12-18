package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    
    // コンストラクタでgivenNameをセット
    public KatoTaro_Chapter18() {
        this.setGivenName(); // "this." を追加して、明確にメソッド呼び出しを指定
    }
    
    // givenNameフィールドに太郎をセットするメソッド
    public void setGivenName() {
        this.givenName = "太郎"; // "this." を追加して、フィールドへのアクセスを明確化
    }
    
    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}