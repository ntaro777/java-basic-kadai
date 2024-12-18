package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    
    // コンストラクタでgivenNameをセット
    public KatoIchiro_Chapter18() {
        this.setGivenName(); // "this." を追加して、明確にメソッド呼び出しを指定
    }
    
    // givenNameフィールドに一郎をセットするメソッド
    public void setGivenName() {
        this.givenName = "一郎"; // "this." を追加して、フィールドへのアクセスを明確化
    }
    
    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
