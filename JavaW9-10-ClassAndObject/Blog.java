import java.util.ArrayList;

public class Blog {
    ArrayList<BlogPost> blogPostList = new ArrayList();

    public void add(BlogPost name) {
        blogPostList.add(name);
    }

    public void delete(int index) {
        blogPostList.remove(index);
    }

    public void update(int index, BlogPost name) {
        blogPostList.remove(index);
        blogPostList.add(index, name);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogPostList=" + blogPostList +
                '}';
    }
}
