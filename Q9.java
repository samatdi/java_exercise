class A{
    int a;
    A(int a){
        this.a = a;
    }
    void display(){
        System.out.println("a="+a);
    }
}
class B extends A{
    B(int a){
        super(a);
        super.display();
    }
}
class Main{
    public static void main(String[] args){
        B objQ9 = new B(10);
    }
}