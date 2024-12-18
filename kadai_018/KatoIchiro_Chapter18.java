package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    
    // コンストラクタでgivenNameをセット
    public KatoIchiro_Chapter18() {
        this.setGivenName();
    }
    
    // givenNameフィールドに一郎をセットするメソッド
    public void setGivenName() {
        this.givenName = "一郎"; 
    }
    
    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
