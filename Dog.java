public class Dog {
    private String name; // 필드: Dog 객체의 이름을 저장.

    public Dog(String name) { // 생성자: Dog 객체를 생성할 때 이름을 초기화.
        this.name = name; // this 참조 변수는 인스턴스가 바로 자기 자신을 참조하는 데 사용하는 변수
    }

    public void eat(String food) { // 메소드: Dog 객체가 호출될 때마다 특정한 작업('is eating')을 수행.
        System.out.println(name + " is eating " + food + ".");
    } // 자바에서는 모든 것이 객체로 표현, 입출력을 담당하는 수단 또한 모두 객체.
      // printin()은 줄바꿈. print()는 줄바꿈 안함. 

    public static void main(String[] args) { // main 메소드: 프로그램의 시작점
        Dog myDog = new Dog("Buddy"); // myDog는 Dog 타입의 객체를 참조할 변수
                                           // new는 객체를 생성할 때마다 사용
        myDog.eat("chicken"); // 'myDog'가 'chicken' 음식을 먹음. 'eat' 메소드를 호출
    }
}

/*  
    ※ 필드(Field)와 메소드(Method)  
    : 필드는 클래스에 속한 변수를 의미하고, 
      메소드는 클래스에 속한 함수를 의미. 
*/

/*  
    ※ 'void'
    : 메소드가 아무런 값을 반환하지 않을 때 사용.
    : 어떤 메소드가 특정 작업을 수행하기는 하지만 호출자에게 값을 돌려줄 필요가 없을 때, 
      그 메소드의 반환 타입으로 void를 사용.
*/

/* 
    ※ 접근제어자
    1. public: 어디서든 접근 가능
    2. private: 같은 클래스 내부에서만 접근 가능
    3. protected: 같은 패키지 내부, 또는 서브 클래스에서 접근 가능
    4. 없음 (default): 같은 패키지 내부에서만 접근 가능
*/