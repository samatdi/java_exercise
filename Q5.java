// 다음 프로그램의 A3 클래스에서 사용할 수 있는 객체 변수들로 옳은 것만을 모두 쓰시오.
class A1 {
    public int x;
    private int y;
    protected int z;
    …    }
class A2 extends A1 {
    protected int a;
    private int b;
    …    }
class A3 extends A2 {
    private int q;   
    …    }
    
// x,z,a,q 

/* 
    ※ 접근제어자
    1. public: 어디서든 접근 가능
    2. private: 같은 클래스 내부에서만 접근 가능
    3. protected: 같은 패키지 내부, 또는 서브 클래스에서 접근 가능
    4. 없음 (default): 같은 패키지 내부에서만 접근 가능
*/