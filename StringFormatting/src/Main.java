public class Main {
    public static void main(String[] args){
        String bulletIt = "Print a bulleted List\n" +
                "\t\u2022 First Point \n " +
                "\t\t\u2022 Second Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted List :
                    \u2022First Point
                        \u2022 Second Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d" ,age, yearOfBirth);
    }
}
