public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void print() {
        System.out.println("○ \"" + title + "\" titled by  " + authorName + "posted at \"" + publicationDate + "\"");
        System.out.println("  • " + text);
        System.out.println();
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}

