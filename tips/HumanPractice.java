package java_practice_with.tips;

public class HumanPractice {
    public static void main(String[] args) {

        Human man = new Human();
        man.name = "기슥";
        man.age = 29;
        man.bloodType = "A";

        Human man2 = new Human();

        man.handShake(man2);

        System.out.println(man.toString());
        System.out.println(man2.toString());
    }
    // 자바 객체지향언어 - 서로의 관계로 논리를 전개

    public static class Human {
        
        // 명사 (속성)
        String name;
        private int age;
        String bloodType;
        int handShakeNum = 0;

        // 동사(메서드)
        public void addAge(){
            age++; // age = age + 1
        }

        public void handShake(Human human){
            handShakeNum++;
            human.handShakeNum++;
        }

        public String toString(){
            return "name = " + name + "\nage = " + age + "\nbloodType = " + bloodType + "\nhandShakeNum = " + handShakeNum;
        }
        
    }
}
