public class Main {
    public static void main(String[] args) {
        Thing rawMouse = new Thing("鼠头","不能吃的");
        Thing rawDuck = new Thing("鸭脖","不能吃的");
        System.out.println("煮熟前：");
        rawMouse.print();
        rawDuck.print();
        Thing cookedMouse = (Thing) rawMouse.cook();
        Thing cookedDuck = (Thing) rawMouse.cook();
        cookedDuck.setName("鸭脖");
        cookedDuck.getType().setName("能吃的");
        System.out.println("煮熟后：");
        cookedMouse.print();
        cookedDuck.print();
    }
}
//1.cookDuck也复制的是rawMouse，因为采用的是浅复制，引用类型字段共享，所以熟鼠也能吃
