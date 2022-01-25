public class MainClass {
    public static void main(String[] args) {
//        // PostIt------------------------------------
//
//        PostIt postIt1 = new PostIt("orange","Idea 1","blue");
//        PostIt postIt2 = new PostIt("pink","Awesome","black");
//        PostIt postIt3 = new PostIt("yellow","Superb","green");
//        postIt1.print();
//        postIt2.print();
//        postIt3.print();
//
//        // Blog post------------------------------------
//        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");
//        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10");
//        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel " +
//                "Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to " +
//                "take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the " +
//                "whole organizer profile thing.", "2017.03.28");
//        post1.print();
//        post2.print();
//        post3.print();
//
//        // Animal------------------------------------
//        Animal zebra = new Animal();
//        Animal elephant = new Animal();
//        zebra.eat();
//        zebra.play();
//        elephant.eat();
//        for (int i = 0; i < 20; i++) {
//            elephant.play();
//        }
//        elephant.drink();
//        elephant.drink();
//        System.out.println("Elephant´s hunry level is " + elephant.hunger + ", thirsty level is " + elephant.thirst +
//                ".");
//        System.out.println("Zebra´s hunry level is " + zebra.hunger + ", thirsty level is " + zebra.thirst + ".");
//
//        // Sharpie------------------------------------
//        Sharpie orange = new Sharpie("orange", 1 );
//        orange.use(orange.color,orange.width);
//        orange.use(orange.color,orange.width);
//        for (int i = 0; i < 8; i++) {
//            orange.use(orange.color,orange.width);
//        }
//        // Counter------------------------------------
//        Counter counter1 = new Counter();
//        Counter counter2 = new Counter(20);
//        counter1.add();
//        counter2.add(10);
//        counter1.get();
//        counter1.reset();
//        counter1.get();
//        counter1.add();
//        counter1.get();
//
//        // Students and Teachers------------------------------------
//
//        Student student1 = new Student();
//        Teacher teacher1 = new Teacher();
//        student1.learn();
//        student1.question(teacher1);
//        teacher1.teach(student1);
//        teacher1.giveAnswer();
//
//         // Station and Cars------------------------------------
//        Station station1 = new Station();
//        Car car1 = new Car();
//        System.out.println("Car gasAmount: " + car1.gasAmount);
//        System.out.println("In station gas: " + station1.gasAmount);
//        station1.refill(car1);
//        System.out.println("Car gasAmount:" + car1.gasAmount);
//        System.out.println("In station gas: " + station1.gasAmount);
//        car1.carMove(500);
//        System.out.println("Car gasAmount:" + car1.gasAmount);
//        System.out.println("In station gas: " + station1.gasAmount);
//        station1.refill(car1);
//        System.out.println("Car gasAmount:" + car1.gasAmount);
//        System.out.println("In station gas: " + station1.gasAmount);

//        // SharpieSet------------------------------------
//        Sharpie orange = new Sharpie("orange", 1);
//        Sharpie blue = new Sharpie("blue", 1);
//        Sharpie black = new Sharpie("black", 5);
//        Sharpie green = new Sharpie("green", 10);
//        SharpieSet basicSet = new SharpieSet();
//        basicSet.add(orange);
//        basicSet.add(blue);
//        basicSet.add(black);
//        basicSet.add(green);
//        basicSet.countUsable();
//        for (int i = 0; i < 10; i++) {
//            orange.use(orange.color, orange.width);
//        }
//        basicSet.countUsable();
//        basicSet.removeTrash();

//        //Farm------------------------------------

//        Animal zebra = new Animal();
//        Animal duck = new Animal();
//        Animal cow = new Animal();
//        Animal sheep = new Animal();
//
//        Farm farmDonald = new Farm(3);
//
//        for (int i = 0; i < farmDonald.limit + 1; i++) { // Test for add more animals then limit
//            farmDonald.breed();
//        }
//        farmDonald.animalList.get(1).play();
//        farmDonald.animalList.get(1).play();
//        farmDonald.animalList.get(2).play();
//        System.out.println(farmDonald);
//        farmDonald.sell();
//        System.out.println(farmDonald);
        //Blog ------------------------------------
        Blog myFirstBlog = new Blog();

        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10");
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel " +
                "Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to " +
                "take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the " +
                "whole organizer profile thing.", "2017.03.28");
        myFirstBlog.add(post1);
        myFirstBlog.add(post2);
        myFirstBlog.add(post3);
        System.out.println(myFirstBlog);
        myFirstBlog.update(1, post1);
        System.out.println(myFirstBlog);
        myFirstBlog.delete(1);
        System.out.println(myFirstBlog);


    }
}
