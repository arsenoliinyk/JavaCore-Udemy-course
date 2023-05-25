package com.udemy.course;


public class App {
    public static void main(String[] args) /*throws FileNotFoundException*/     {
//        System.out.println("Hello World!");
//
//        int[] values;
//        values = new int[3];
//
//        values[0]= 10;
//        values[1]= 20;
//        values[2]= 30;
//
//        for (int j : values) {
//            System.out.println(j);
//        }
//
//        String[] fruits = {"kiwi", "banana", "apple"};
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        String[][] words = new String[2][];
//        words[0] = new String[3];
//        words[0][1] = "hello";
//        System.out.println(words[0][1]);

        ////////////////////////////////////////

/*        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Jane";
        person2.age = 21;
        person2.speak();

        int years = person2.calculateAgeToRetirement();

        System.out.println("Years till retirements " + years);

        //access data from getters
        int age = person2.getAge();
        String name = person2.getName();
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

*/
////////////////////////////////////////////////////
/*
        Robot robot1 = new Robot();
        robot1.age = 100;
        int ageRobot = robot1.getAge();

        robot1.speak("Sam");

        robot1.sayAge(ageRobot);
*/
////////////////////////////////////////////////////
/*
        Frog frog1 = new Frog();

//        frog1.name = "Bertie";
//        frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println(frog1.getName());
*/
////////////////////////////////////////////
/*
        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Chalky", 65);
*/
/////////////////////////////////////////////////
/*
        System.out.println("Counter before creating objects: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.description = "Static description";
        //System.out.println(Thing.description);
        Thing.showInfo();

        thing1.name="Sarah";
        thing2.name="Sarah";

        System.out.println("Counter after creating objects: " + Thing.count);

        thing1.showName();
        thing2.showName();
        //System.out.println(thing1.name);
        //System.out.println(thing2.name);
*/
/////////////////////////////////////////////////////////////////
/*
        StringBuilder sb = new StringBuilder();

        sb.append("My name Arsen.");
        sb.append(" ");
        sb.append("I am student.");

        System.out.println(sb.toString());
////Formatting///
        System.out.print("Some text.\tIt was tab.\nIt was new line.");
        System.out.println("More text");
        //integers,strings
        System.out.printf("Total cost %-10d; quantity %d. %s\n", 5, 120, "And there some text");
        ///float point value
        System.out.printf("Total value %.2f", 5.6974);
*/
/////////////////////////////////////////////
/*
        Cat cat1 = new Cat(7, "Bob");
        Cat cat2 = new Cat(5, "Lizz");

        System.out.println(cat1);
        System.out.println(cat2);
*/
////////////////////////////////////////
/*
        Machine1 mach1 = new Machine1();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();

        car1.start();
        car1.wipeWindShield();
        car1.stop();
*/
////////////////////////////////////////////////
/*
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Darvin");
        person1.greet();

        Info info1 = new Machine();
        info1.showInfo();

        //((Info) person1).showInfo();
        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(mach1);
        outputInfo(person1);
*/
////////////////////////////
/*
/////public --- from anywhere
/////private --- only within same class
/////protected --- same class, subclass, and same package
/////no modifier --- same package only

        Plant plant1 = new Plant();
        System.out.println(plant1.name);
        System.out.println(plant1.ID);
        //will be error because variable type is private variable in Plant class//
        //System.out.println(plant1.type);
*/
///////////////////POLYMORPHISM
/*
        Plant1 plant1 = new Plant1();

        Tree1 tree = new Tree1();

        Plant1 plant2 = tree;

        plant2.grow();
        tree.grow();

        tree.shedLeaves();
        plant2.shedLeaves();
*/
///////////////////Upcasting and Downcasting
/*
        Machine2 machine = new Machine2();
        Camera camera = new Camera();

        machine.start();
        camera.start();
        camera.snap();

        //Upcasting
        Machine2 machine2 = camera;
        machine2.start();
        //error, because variable type machine doesn't have snap method: machine2.snap();

        //Downcating
        Machine2 machine3 = new Camera();
        Camera camera2 = (Camera)machine3;

        camera2.start();
        camera2.snap();

        //Doesnt work, because u cant change the Machine obj
        //Machine2 machine4 = new Machine2();
        //Camera camera3 = (Camera)machine4;

        //camera3.start();
        //camera3.snap();

*/
///////////////////Generics using
/*
        ////Before java 5/// old method////
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruits = (String) list.get(1);

        System.out.println(fruits);

        //////
        //////After java 5/// new method////

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("mouse");

        String animals = strings.get(1);

        System.out.println(animals);

        /////////////////////
        ////More than one type argument////
        HashMap<Integer, String> map = new HashMap<Integer, String>();
*/
///////////////////Generics and wildcards
/*

        ArrayList<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");

        showList(list);


        ArrayList<Machine3> list1 = new ArrayList<Machine3>();


        list1.add(new Machine3());
        list1.add(new Machine3());

        showList(list1);


        ArrayList<Camera1> list2 = new ArrayList<Camera1>();

        list2.add(new Camera1());
        list2.add(new Camera1());

        showList(list2);

        showList2(list1);

 */
///////////////////Anonymous classes
/*
    Machine4 machine1 = new Machine4(){
        @Override
        public void start(){
            System.out.println("Camera is snapping...");
        }
    };

    machine1.start();

    Plant3 plant1 = new Plant3() {
        @Override
        public void grow() {
            System.out.println("Plant is growing..");
        }
    };

    plant1.grow();
*/
////////////////////////Reading file using scanner
/*

        //String filename = "D:\\Arsen\\Java\\Udemy course\\example.txt";
        String filename = "example.txt";

        File textFile = new File(filename);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();

        int count = 2;

        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }


/* ///reading lines from example.txt file
        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
*//*

        in.close();
*/
////////////////////////



//////////////////
        System.out.println("nextTutorial");
    }

//////practising different ways of using interfaces
/*
    private static void outputInfo(Info info){
        info.showInfo();
    }
*/

//////////practising generics and wildcards
/*
    public static void showList(ArrayList<String> list){
        for (String value : list){
            System.out.println(value);

            int index = list.indexOf(value);
            System.out.println(index);

        }
    }
    public static void showList(ArrayList<? extends Machine3> list) {
        for (Machine3 value : list) {
            System.out.println(value);
            value.start();
        }
    }

    public static void showList2(ArrayList<? super Camera1> list) {
        for (Object value : list) {
            Machine3 machine3 = (Machine3)value;
            machine3.start();
            System.out.println(value);
        }
    }
*/
//////////////////////

}




