public class Review01 {
    public static void main(String[] args) {
        // 商品価格
        int productPrice = 3000;

        // taxメソッドを呼び出して消費税額を取得
        int taxAmount = tax(productPrice);

        // 税込価格を計算
        int totalPrice = productPrice + taxAmount;

        // 結果を表示
        System.out.println(productPrice + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }

    // 消費税計算メソッド
    private static int tax(int price) {
        // 消費税率（将来的に変更がある場合に備えて変数として定義）
        double taxRate = 0.1;

        // 消費税額を計算して整数値に変換
        int taxAmount = (int) (price * taxRate);

        return taxAmount;
    }
}