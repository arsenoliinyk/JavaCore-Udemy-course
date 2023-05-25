package com.udemy.course.lambdaExpressions;
/*
interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        e.execute();
    }
}

//() -> System.out.println("This code is passed in a lambda expression.")


/*
() -> {
            System.out.println("This code is passed in a lambda expression.");
            System.out.println("Hello!");
        }
*//*


public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello!");
            }
        });

        System.out.println("===================");

        runner.run(() -> {
            System.out.println("This code is passed in a lambda expression.");
        });

    }

}
*/


/*
interface Executable {
    int execute();
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute();
        System.out.println("Value is: " + value);
    }
}
*//*
() -> System.out.println("This code is passed in a lambda expression.")
*/
/*
() -> {
            System.out.println("This code is passed in a lambda expression.");
            System.out.println("Hello!");
       }
*/
/*


*//*
runner.run(()-> 8);
*//*


public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello!");
                return 8;
            }
        });

        System.out.println("===================");

        runner.run(() -> 8);

    }

}
*/


/*
interface Executable {
    int execute(int a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(12);
        System.out.println("Value is: " + value);
    }
}

//() -> System.out.println("This code is passed in a lambda expression.")

*/
/*
() -> {
            System.out.println("This code is passed in a lambda expression.");
            System.out.println("Hello!");
        }
*//*


*/
/*
runner.run(()-> 8);
*//*


*/
/*
runner.run((int a) -> {return 8 + a;});
*//*


public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int a) {
                System.out.println("Hello!");
                return 8 + a;
            }
        });

        System.out.println("===================");

        runner.run((int a) -> {return 8 + a;});

    }

}
*/


/*
interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(12, 13);
        System.out.println("Value is: " + value);
    }

    */
/*
    public void run(StringExecutable e) {
        System.out.println("Executing code block ...");
        int value = e.execute("Hello");
        System.out.println("Value is: " + value);
    }
     *//*

}

//() -> System.out.println("This code is passed in a lambda expression.")

*/
/*
() -> {
            System.out.println("This code is passed in a lambda expression.");
            System.out.println("Hello!");
        }
*//*


*/
/*
runner.run(()-> 8);
*//*


*/
/*
runner.run((int a) -> {return 8 + a;});
*//*


*/
/*
a -> {
        return 8 + a;
        }
*//*


public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello!");
                return 8 + a + b;
            }
        });

        System.out.println("===================");

        runner.run( (a,b) -> {
            return 8 + a +b;
        });

    }

}*/


interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(12, 13);
        System.out.println("Value is: " + value);
    }

    /*
    public void run(StringExecutable e) {
        System.out.println("Executing code block ...");
        int value = e.execute("Hello");
        System.out.println("Value is: " + value);
    }
     */
}

//() -> System.out.println("This code is passed in a lambda expression.")

/*
() -> {
            System.out.println("This code is passed in a lambda expression.");
            System.out.println("Hello!");
        }
*/

/*
runner.run(()-> 8);
*/

/*
runner.run((int a) -> {return 8 + a;});
*/

/*
a -> {
        return 8 + a;
        }
*/

public class App {

    public static void main(String[] args) {

        int c = 100;

        //Must'n do this: c = 8

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello!");
                // Can do this in methods of anonymous class: int d = 8;
                return 8 + a + b + c;
            }
        });

        System.out.println("===================");

        runner.run( (a,b) -> {
            // Can't do this, no new scope. int d = 8;
            return 8 + a + b + c;
        });

        Executable ex = (a, b) -> {
            System.out.println("Hello!");
            // Can do this in methods of anonymous class: int d = 8;
            return 8 + a + b + c;
        };

        runner.run(ex);

        Object codeblock = (Executable)(a, b) -> {
            System.out.println("Hello!");
            // Can do this in methods of anonymous class: int d = 8;
            return 8 + a + b + c;
        };

        runner.run((Executable)codeblock);

    }

}