package Template_Method;

public class Main {
    public static void main(String[] args) {

        // 상위 클래스에서 처리의 뼈대를 결정하고 하위 클래스에서 구체적으로 그 내용을 결정하는 패턴
        // 템플릿 메서드 패턴
        /*
        * AbstractDisplay 는 메서드 display만 구현된 추상클래스이다.
        * CharDisplay 는 메서드 open, print, close 를 구현하는 클래스이다.
        * StringDisplay 는 메서드 open,print,close 를 구현하는 클래스이다.
        * */

        // 'H'를 가진 CharDisplay 인스턴스를 하나 만든다
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world."를 가진 StringDisplay 인스턴스를 하나 만든다
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있다
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해진다
        d1.display();
        d2.display();
    }
}

