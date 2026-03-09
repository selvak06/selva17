public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "11/25/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("StartingIndex = "+ startingIndex);
        System.out.println("Birth Year = "+ birthDate.substring(startingIndex));
        System.out.println("Month = "+ birthDate.substring(3,5));
        String newDate= String.join("/", "11", "25", "1982");
        System.out.println("new Date = "+ newDate);

        newDate ="11";
        newDate = newDate.concat("/");
        newDate = newDate.concat("25");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("new Date = "+ newDate);

        newDate = "11" + "/" + "25" + "/" + "1982";
        System.out.println("new Date = "+ newDate);

        newDate = "11" .concat("/").concat("25").concat("/").concat("1982");
        System.out.println("new Date = "+ newDate);

        System.out.println(newDate.replace('/' , '-'));
        System.out.println(newDate.replace("2" , "00"));

        System.out.println(newDate.replaceFirst("/", "_"));
        System.out.println(newDate.replaceAll("/" , "___"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));


    }
}
