package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    
  
    // givenNameフィールドに太郎をセットするメソッド
    public void setGivenName() {
        this.givenName = "太郎"; 
    }
    
    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}