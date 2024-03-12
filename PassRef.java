class Ref {
    int a;
    Ref(int x) {
        a = x;
    }
    int sum(Ref obj) {
        int k; 
        k = obj.a - a; 
        a = 10; obj.a = 20;
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