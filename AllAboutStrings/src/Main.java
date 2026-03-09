public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n" , helloworld.indexOf('r'));
        System.out.printf("index of world = %d %n" , helloworld.indexOf("World"));

        System.out.printf("index of l = %d %n" , helloworld.indexOf('l'));
        System.out.printf("index of l = %d %n" , helloworld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n" , helloworld.indexOf('l', 3));
        System.out.printf("index of l = %d %n" , helloworld.lastIndexOf('l', 8));

        String helloWorldLower = helloworld.toLowerCase();
        if (helloWorldLower.equals(helloWorldLower)) {
            System.out.println("Values Matched");
        }
        if (helloWorldLower.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values Matched IgnoreCase");
        }
        if (helloworld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloworld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloworld.contentEquals("Hello World")) {
            System.out.println("Values Matched");
        }
    }

    public static void printInformation (String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is Blank");
        }
        System.out.printf("First Char = %c %n", string.charAt(0));
        System.out.printf("Last Char = %c %n", string.charAt(length - 1));
    }
}
