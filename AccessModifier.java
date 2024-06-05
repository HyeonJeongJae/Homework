package Ex;

// 접근제어자 (Access modifier)
// 접근제어자를 사용해서 변수나 메서드의 사용 권한을 설정할 수 있음
// public > protected > default > private 순으로 많은 접근을 허용함

// [public]
// 변수나, 메서드가 public으로 설정되었다면 어떤 클래스에서도 접근이 가능하다.

// [protected]
// 변수나 메서드가 protected로 설정되었다면 동일 패키지의 클래스 또는
// 해당 클래스를 상속받은 클래스에서만 접근이 가능하다.

// [default]
// 접근제어자를 별도로 지정하지 않는다면 자동으로 default
// 접근제어자가 설정되어 동일한 패키지 안에서만 접근이 가능

// [private]
// 변수나 메서드가 private로 설정되었다면 자기 자신의 클래스에서만 접근이 가능함
// (보통은 변수에 private를 설정 후 public 메서드(getter,setter)를 제공해
// 간접적으로 변수의 값을 다룰 수 있도록 함)

// getter 와 setter 메서드
// getter : 보호된 정보를 읽어오는 메서드
// setter : 보호된 정보를 수정하는 메서드

class 리모콘 {
    public void 전원OFF () {
        System.out.println("전원을 끄다");
    }

    // 다른 패키지에 있다고 가정
    protected void 냉방 () {
        System.out.println("냉방모드로 설정되다");
    }


    private int TvPirce = 50000;

    public void setTvPirce(int applePirce) {
        this.TvPirce = applePirce;
    }
    public int getTvPirce() {
        return TvPirce;
    }
}

class TV {
    public static void main(String[] args) {
        리모콘 TV리모콘 = new 리모콘();
        TV리모콘.전원OFF();
//        리모콘.냉방();
//        다른 패키지에 있고 상속을 받지 않았으므로 접근불가!!!
        에어컨 에어컨리모콘 = new 에어컨();
        에어컨리모콘.냉방();

        System.out.println("-------------------");

        System.out.println(TV리모콘.getTvPirce());

        TV리모콘.setTvPirce(30000);
        System.out.println(TV리모콘.getTvPirce());

    }
}
class 에어컨 extends 리모콘 {
}






public class AccessModifier {
}
