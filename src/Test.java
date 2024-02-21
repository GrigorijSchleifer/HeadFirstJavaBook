public class Test {

    void post_pre() {
        int num = 1;
        int post_increment = num++;
        int pre_increment = ++num;

        System.out.println(post_increment);
        System.out.println(pre_increment);
    }
}
