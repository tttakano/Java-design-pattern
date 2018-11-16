//client
public class Main {
    public static void main(String[] args){
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
/*
adapterクラスを使うことで、既存のadaptされる側のコードを変更せずに
新しいインターフェイスに適応させられる
 */