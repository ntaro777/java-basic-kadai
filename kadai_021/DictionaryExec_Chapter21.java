package kadai_021;

import java.util.Arrays;
import java.util.List; // これを追加！

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 zisy = new Dictionary_Chapter21();
        zisy.tuika();

        // 検索する単語の一覧
        List<String> wordsToSearch = Arrays.asList("apple", "banana", "grape", "orange");

        // 繰り返し処理で検索
        zisy.serchMultiple(wordsToSearch);
    }
}
