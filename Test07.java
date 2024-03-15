class Car {
    String model;
    Car() {
        this.model = "My Car";
    }
    Car(String model) {
        this.model = model;
    }
    void getModel() {
        System.out.println(this.model);
    }
}
class Test07 {
    public static void main(String args[]) {
        Car aCar = new Car("제네시스");
        Car bCar = new Car();
        aCar.getModel();
        bCar.getModel();
    }
}
// 제네시스 
// My Car