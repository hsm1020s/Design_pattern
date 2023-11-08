package Factory_Method;

import Factory_Method.framework.Factory;
import Factory_Method.framework.Product;
import Factory_Method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        // 위 만들기
        // 아래 사용하기
        card1.use();
        card2.use();
        card3.use();
    }
}
