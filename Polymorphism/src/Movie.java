public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType + " film");
    }
    public static Movie getMovie(String type, String title) {
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s %n".repeat(3),
                "Movie 1",
                "Movie 2",
                "Movie 3");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s %n".repeat(3),
                "Comedy Movie 1",
                "Comedy Movie 2",
                "Comedy Movie 3");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s %n".repeat(3),
                "ScienceFiction Movie 1",
                "ScienceFiction Movie 2",
                "ScienceFiction Movie 3");
    }
}

