import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("高橋");
		Product card2 = factory.create("佐藤");
		Product card3 = factory.create("鈴木");

		card1.use();
		card2.use();
		card3.use();
	}

}
