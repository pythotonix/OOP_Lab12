package ucu.edu.ua.task2;

public class Main {
    public static void main(String[] args) {
        Group<String> group = new Group<>();

        group.addTask(new Signature<>(System.out::println))
                .addTask(new Signature<>(string -> System.out.println(string.toUpperCase())))
                .addTask(new Signature<>(string ->
                        System.out.println(string.replace("world", "galaxy"))
                ));

        group.apply("Hello, world!");
    }
}
