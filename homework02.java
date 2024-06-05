package week02;

// [JAVA 5대 원칙 SOLID]
// 1. SRP (Single responsibility principle) : 단일 책임 원칙
// 2. OCP (Open-closed pricniple) : 개방-폐쇄 원칙
// 3. LSP (Liskov substitution principle) : 리스코프 치환 원칙
// 4. ISP (Interface segregation principle) : 인터페이스 분리 원칙
// 5. DIP (Dependency inversion principle) : 의존관계 역전 원칙


//    1. SRP - 단일 책임 원칙
//            한 클래스는 하나의 책임만 가져야 한다.

// [GoodCase]

// class Actor {
//    public void adjourn() {
//        // 연기하다
//    }
// }
//
// class ProfessionalGamer {
//    public void playAGame () {
//        // 게임하다
// }
//
// class BusDriver {
//    public void drive() {
//        // 운전하다
//        }
// }

// [BadCase]
// 한 클래스가 어떤 변화에 의해 클래스를 변경해야하는
// 이유는 오직 하나여야 하는데 여러 책임을 가지기에 SRP 원칙에 어긋남

// class Human {
//    public void adjourn() {
//        // 연기하다
//    }
//
//    public void playAGame() {
//        // 게임하다
//    }
//
//    public void drive() {
//        // 운전하다
//    }
// }


//    2. OCP - 개방-폐쇄 원칙
//            확장에는 열려있고 변경에는 닫혀 있어야 한다.

// [GoodCase]

// class Dirver {
//    Car car;
//
//    public Dirver(Car car) {
//        this.car = car;
//    }
// }
//
// abstract class Car {
//     public abstract void openWindow();
// }
//
// class Grandeur extends Car {
//
//     @Override
//    public void openWindow() {
//        System.out.println("그랜저 : 창문을 열다");
//        // 창문을 열다
//    }
// }
//
// class Sonata extends Car {
//
//    @Override
//    public void openWindow() {
//        System.out.println("쏘나타 : 창문을 열다");
//        // 창문을 열다
//    }
// }
//
// class Carnival extends Car {
//
//    @Override
//    public void openWindow() {
//        System.out.println("카니발 : 창문을 열다");
//        // 창문을 열다
//    }
// }

//
// [BadCase]
// 운전자는 그랜저,쏘나타,카니발의 변화에 따라 행동이
// 의존적으로 변하게 되므로 OCP 원칙에 어긋남

// class Driver {
//    Car car;
//
//    public Driver(Car car) {
//        this.car = car;
//    }
//    public void openWindow() {
//        car.openWindow();
//    }
// }
//
// interface Car {
//    void openWindow();
// }
//
// class Grandeur implements Car {
//
//    @Override
//    public void openWindow() {
//        System.out.println("그랜저 : 창문을 열다");
//        // 창문을 열다
//    }
// }
//
// class Sonata implements Car {
//
//    @Override
//    public void openWindow() {
//        System.out.println("쏘나타 : 창문을 열다");
//        // 창문을 열다
//    }
// }
//
// class Carnival implements Car {
//
//    @Override
//    public void openWindow() {
//        System.out.println("카니발 : 창문을 열다");
//        // 창문을 열다
//    }
// }


//        3. LSP - 리스코프 치환 원칙
//                서브 타입은 언제나 자신의 기반 타입으로 변경할 수 있어야 한다.

// class Grandfather {
//     public void father() {
//         System.out.println("아빠 역할을 할수 있다");
//     }
// }
//
// class Father extends Grandfather {
//     public void father() {
//         System.out.println("아빠 역할을 할수 있다");
//     }
// }
//
// class Son extends Father {
//     public void father() {
//         System.out.println("자식이 생기면 아빠 역할을 할수 있다");
//     }
// }

// [BadCase]

// class Grandfather {
//     public void father() {
//         System.out.println("아빠 역할을 할수 있다");
//     }
// }
//
// class Father extends Grandfather {
//     public void father() {
//         System.out.println("아빠 역할을 할수 있다");
//     }
// }
//
// class Son extends Father {
//     public void father() {
//         System.out.println("자식이 생기면 아빠 역할을 할수 있다");
//     }
// }
//
// class Daughter extends Father {
//     public void father() {
//         System.out.println("아빠 역할을 할수 없다");
//     }
// }


//        4. ISP - 인터페이스 분리 원칙
//                하나의 일반적인 인터페이스보다 여러 개의 구체적인 인터페이스가 낫다.

// [GoodCase]

// interface 성공하려면 {
//    void study();  // 공부하기
// }
// interface 남자라면 {
//    void enlist(); // 입대하기
// }
// interface 돈벌려면 {
//    void work();   // 일하기
// }
// class Student implements 성공하려면 {
//
//    @Override
//    public void study() {
//        System.out.println("성공하려면 학생은 공부해야함");
//    }
// class Soldier implements 남자라면 {
//
//    @Override
//    public void enlist() {
//        System.out.println("남자라면 입대해야함");
//    }
// }
// class Everyone implements 돈벌려면 {
//    @Override
//    public void work () {
//        System.out.println("돈벌려면 열심히 일해야함");
//    }
// }

// [BadCase]

// interface Man {
//    void study();         // 공부하기
//    void soldierEnlist(); // 군대 입대하기
//    void work();          // 출근하기
// }
//
// class Male  implements Man {
//
//    @Override
//    public void study() {
//        System.out.println("학생 : 공부하기");
//    }
//
//    @Override
//    public void soldierEnlist() {
//        System.out.println("군인 : 입대하기");
//    }
//
//    @Override
//    public void work() {
//        System.out.println("직장인 : 일하기");
//    }
// }


//        5. DIP - 의존관께 역전 원칙
//                구체적인 것이 추상화된 것에 의존해야 한다. 자주 변경되는 구체 클래스에 의존하지마라.
//
// [GoodCase]

// interface 신발 {
//    void 신다();
// }
//
// class 축구화 implements 신발 {
//    @Override
//    public void 신다() {
//        System.out.println("축구화를 신다");
//    }
// }
//
// class 농구화 implements 신발 {
//    @Override
//    public void 신다() {
//        System.out.println("농구화를 신다");
//    }
// }
//
// class 사람 {
//    신발 신발;
//    void set신발(신발 신발) {
//        this.신발 = 신발;
//    }
// }

// [BadCase]

// class 축구화 {
//    축구화 shose = new 축구화 ();
//    public void 축구 () {
//        System.out.println("축구 할때 사용");
//    }
// }
//
// class 사람 extends 축구화{
//    // 사람이 어떤 신발을 신을지 모름,
//    // 축구화에 의존하면 축구화 클래스를 다시 수정해야함.
// }


public class SOLID{
    public static void main(String[] args) {

    }
}
