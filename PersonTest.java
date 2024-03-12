class Person { 
    private String name; 
    public int age; 
    public void setAge(int age) { 
        this.age = age;
    }
    public void setName(String name) { // name 값을 설정하기 위한 메소드 추가
        this.name = name;
    } 
    public String toString() { 
    return("name: " + this.name + ", age : " + this.age);
    }
}
class PersonTest {
    public static void main(String[] args) { 
        Person a = new Person(); // ㉠
        a.setAge(27); // ㉡
        // a.name = "Gildong";  ㉢ 참조하는 클래스의 name 필드가 없어서 오류
        a.setName("Gildong"); // ㉢ 수정
        System.out.println(a); // ㉣
    }
}
