class A {
    A() { System.out.printf("%d ", 10); }
}
class B extends A {
    B(int a) { System.out.printf("%d ", a); }
}
class CC extends B {
    CC(int a) {
        super(a/10); // 자식 클래스에서 부모 클래스의 생성자를 호출
        System.out.printf("%d ", a);
    }
}
class Test08 {
    public static void main(String args[]) {
        A b = new CC(1000);
    }
}
