package Ex;

// static
// 클래스 레벨의 변수나 메소드, 블록을 정의할 떄 사용
// 인스턴스 생성 없이도 접근 가능, 모든 인스턴스에 공유됨


// static 변수 : 클래스 레벨에서 선언되며, 모든 인스턴스가 공유
//               프로그램 시작 시 메모리에 할당되고 프로그램 종료시 해제됨
//               인스턴스화 없이 클래스 이름으로 접근 가능

// static 메서드 : 클래스 레벨에서 선언되며, 인스턴스 변수나 인스턴스 메서드에 접근할 수 없음
//                 인스턴스화 없이 클래스 이름으로 호출 가능
//                 주로 유틸리티 함수나 인스턴스와 관련 없는 작업에 사용됨

// static 블록 : 클래스가 메모리에 로드될 때 한번 실행됨
//               클래스 초기화에 사용되며, 주로 static 변수의 초기화 작업에 사용됨
//               클래스 로더에 의해 클래스가 처음 로드될 때 실행되므로, 인스턴스화와
//                관계없이 실행됨



public class Static {
    // static 변수
    static int age = 33;

    // static 메서드
    public static void study() {
        System.out.println("static 공부");
        }

    // static 블록 (클래스 로더에 의해 클래스가 처음 로드될 때 실행)
    static {
        age = 23;
        System.out.println(age + "살에 시작했으면 난 지금 무얼 하고있을까?");
    }

    public static void main(String[] args) {
        // static 메서드 호출 (인스턴스화 없이 호출가능)
        Static.study();

        // static 변수 접근 (인스턴스화 없이 접근가능)
        System.out.println(age);

    }
}


