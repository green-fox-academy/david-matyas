public class PostItTable {
    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("orange","Idea 1","blue");
        PostIt postIt2 = new PostIt("pink","Awesome","black");
        PostIt postIt3 = new PostIt("yellow","Superb","green");
        postIt1.print();
        postIt2.print();
        postIt3.print();
    }
}
