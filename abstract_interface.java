package week02;

// 추상클래스 (abstract) , 인터페이스 (interface)

// abstract
// 추상클래스란 추상 메서드를 선언하여 상속을 통해 자손 클래스에서 완성하도록 유도하는 클래스
// 그래서 미완성 설계도라고도 표현함
// 상속을 위한 클래스이기 때문에 따로 객체를 생성할 수 없음
// class 앞에 "abstract" 예약어를 사용하여 상속을 통해서
// 구현해야 한다는 것을 알려주고 선언부만 작성하는 추상메서드를 작성할 수 있음

// interface
// 추상클래스가 미완성 설계도라면 인터페이는 기본 설계도라고 할수 있음
// 추상클래스처럼 다른 클래스를 작성하는데 도움을 주는 목적으로 작성하고
// 클래스와 다르게 다중상속(구현)이 가능함
// 변수를 가질수 없지만 변하지 않는 상수는 가질수 있음 (모든 필드는 생략되어 있지만 public static final 키워드가 자동으로 붙음)
// 일반적으로는 추상메서드만 가지지만 일반 메서드처럼 구현시켜놓은 메서드를 가질수 있기도 함
// default, static, private 가 있음

// 공통점
// 추상메서드를 포함하여 하위클래스에서 강제구현해야 함




abstract class 탈것 {

    abstract void 움직이다();

    public void 타다(){
    System.out.println("같이 타자~");
    }
}

class 오픈카 extends 탈것 {

    @Override
    public void 움직이다(){
        System.out.println("악셀을 밟으면 앞으로 가");
    }
}


class 자전거 extends 탈것 {

    @Override
    void 움직이다() {
        System.out.println("페달을 밟으면 앞으로 가");
    }

    public void 안장조절 (){
        System.out.println("안장이 높아서 낮춰야 해");
    }
}




class 자동차 extends 탈것 implements 창문오픈버튼, 와이퍼 {
    @Override
    public void 움직이다() {
        System.out.println("악셀을 밟으면 앞으로 가");
    }
    @Override
    public void 창문을열다() {
        System.out.println("창문 열었어");
    }
    @Override
    public void 유리를닦다() {
        System.out.println("앞유리 닦았어");
    }

}

interface 창문오픈버튼 {
    void 창문을열다();
}
interface 와이퍼 {
    void 유리를닦다();
}




class abstract_interface {

    public static void main(String[] args) {
        자동차 자동차 = new 자동차();
        자동차.유리를닦다();


    }
}

