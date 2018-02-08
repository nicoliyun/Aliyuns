import org.junit.Test;

public class Hello {
    public void test_m(int a,int b){
        System.out.print(a/b);

    }

    @Test
    public void test_o() {
        test_m(4,2);
    }

    @Test
    public void test_w() {
        test_m(4,2);
    }
}
