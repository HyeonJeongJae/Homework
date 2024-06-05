package Ex;

// 오버로딩(Overloading) ,오버라이딩(Overriding)
// 다형성이란 하나의 메서드나 클래스가 있을 때
// 그것이 다양한 방법으로 동작하는 것을 뜻하는데 오버로딩과 오버라이딩을 통해서
// 다형성을 지원함


// [오버로딩]
// 자바의 한 클래스 내에 메서드의 이름이 같은 메서드가 있더라도 매개변수의
// 유형과 개수, 그리고 순서를 다르게 하면 같은 이름의 메서드를 정의할 수 있다.
//  - 리턴값만을 다르게 같는 오버로딩은 작성할수 없음

class 음식 {
    public void 먹다 () {}
    public void 먹다 (String name) {}
    public void 먹다 (int cnt) {}
    public void 먹다 (String name, int cnt) {}
    public void 먹다 (int cnt, String name) {}
    public void 먹다 (int cnt, String name, int age) {}
//    public int 먹다 (int cnt, String name, int age) {} // 매개변수가 다르면 리턴 값은 다르게 지정할 수 있음
    private void 먹다 (int cnt, int age, String name) {} // 매개변수가 다르면 접근제어자도 자유롭게 지정할 수 있음
}



// [오버라이딩]
// 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 재정의 하는것을 말함
// 구체화 해놓은 메서드를 상속 받았을 때 그대로 사용해도 되지만 재정의도 가능
// 추상메서드일 경우는 강제로 재정의 해야함
// 오버라이딩 하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야함

abstract class 음료 {
    abstract void 마시다();

    protected void 따르다() {
        System.out.println("한잔");
    }
}
class 주스 extends 음료 {
    @Override
    public void 마시다(){
        System.out.println("원샷");
    }
    @Override
     public void 따르다() {
        System.out.println("두잔");
    }
}

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        주스 오렌지주스 = new 주스();
        오렌지주스.따르다();
    }
}


//오버로딩 - 기존에 없는 새로운 메서드를 추가하는 것
//오버라이딩 - 상속받은 메서드를 재정의 하는것
//
//      -구분-              [Overloading]                               [Overriding]
//                                                            부모 클래스 메서드의 접근 제어자보다
//    접근제어자    모든 접근 제어자를 사용할 수 있음            더 넓은 범위의 접근 제어자를 자식
//                                                            클래스의 메서드에서 설정할 수 있음
//    리턴형                 달라도 가능                                  동일해야 함
//    메서드명               동일해야 함                                  동일해야 함
//    매개변수               달라야 함                                    동일해야 함
//    적용범위         같은 클래스 내에서 적용됨                       상속관계에서 적용됨