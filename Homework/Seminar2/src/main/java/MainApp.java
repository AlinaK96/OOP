public class MainApp {
    public static void main(String[] args) {
        Course[] courses = new Course[] {
                new Track(100),
                new Track(200),
                new Wall(80),
                new Track(300),
                new Wall(120)
        };

        Movable[] competitors = new Movable[] {
                new Man("Petr", 200, 100),
                new Man("Vlad", 250, 120),
                new Cat("Murzik", 400, 150),
                new Robot("Bender", 600),
                new Cat("Boris", 500, 140)
        };

        for (Movable comp : competitors) {
            boolean finish = true;
            for (Course c : courses) {
                finish = c.start(comp);
                if (finish == false)
                    break;
            }
            if (finish)
                System.out.println(comp + " успешно прошел все препятствия");
            else
                System.out.println(comp + " сошел с дистанции");
        }
    }
}
