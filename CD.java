class CD {}
class CS extends CD {}
interface I {}
class CI extends CD implements I {}

class Example {
    static I i = new CI();
    static CD ca = new CI();
    // static CS cs = new CD(); 잘못된 코드 
    static CS cs = new CS(); // 올바른 수정 예
    static CD cb = new CS();
}