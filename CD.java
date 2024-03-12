// 클래스 상속과 인터페이스 구현
class CD {}
class CS extends CD {} // CS 클래스는 CD 클래스를 확장(상속)함. 즉, CS는 CD의 하위 클래스.
interface I {} // 'I'라는 인터페이스
class CI extends CD implements I {} // CI 클래스는 CD 클래스를 확장하고, I 인터페이스를 구현.

class Example {
    static I i = new CI(); // CI 클래스의 인스턴스가 'I' 인터페이스 참조 변수에 할당. (CI는 I를 구현)
    static CD ca = new CI(); // CI 클래스의 인스턴스가 'CD'의 참조 변수에 할당. (CI는 CD의 하위 클래스) 
    // static CS cs = new CD(); 잘못된 코드. 상속의 '역관계' 'CD'는 'CS'의 슈퍼 클래스
    static CS cs = new CS(); // 올바른 수정 예
    static CD cb = new CS(); // CS 클래스의 인스턴스가 'CD'의 참조 변수에 할당. (CS는 CD의 하위 클래스)
}