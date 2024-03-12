// 참조에 의한 호출(call by reference)과 기본 데이터 타입의 값 변경
class Ref {
    int a;
    Ref(int x) {
        a = x;
    }
    int sum(Ref obj) {
        int k; 
        k = obj.a - a; // 여기서 obj는 obj1을 참조하고, this는 obj2를 참조함.(3-4)
        a = 10; // obj2의 a를 10으로 변경 
        obj.a = 20; // obj1의 a를 20으로 변경
        return k;
    }
}
class PassRef {
    public static void main(String[] args) { 
        Ref obj1 = new Ref(3); 
        Ref obj2 = new Ref(4); 
        int k1 = obj2.sum(obj1); 
        System.out.print(" k1= "+k1); 
        System.out.print(" obj1.a= "+obj1.a); 
        System.out.print(" obj2.a= "+obj2.a);
    }
}
//  k1= -1 obj1.a= 20 obj2.a= 10