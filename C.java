class C {
    private int a; /* private 접근 지정자 사용 => 외부에서 접근x */ 
    public void set(int a) {this.a=a;}
    public void add(int d) {a+=d;}
    public void print() {System.out.println(a);}
    public static void main(String args[]) {
        C p = new C(); // 'C' 클래스 객체 'p' 생성
        C q; // 'C' 클래스의 참조 변수 'q' 선언
        p.set(10); // 'p'의 a값 설정 
        q=p; // 'q'가 'p'가 참조하는 객체를 가리킴. (이제 'p'와 'q'는 같은 객체를 참조)
        p.add(10);
        q.set(30);
        p.print();
    }
}
// 30 

/*
    ※ static 변수 (클래스 변수)
    : static 변수는 클래스의 모든 인스턴스에 공통된 값을 가지는 변수.
    : 한 인스턴스에서 static 변수의 값을 변경하면, 그 클래스의 모든 다른 인스턴스에서도 변경된 값이 보이게 됨.
 
*/

