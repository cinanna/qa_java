import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class doesHaveManeTest {
    private final String sex;
    private final boolean isHasMane;
    Lion lion;

    public doesHaveManeTest(String sex, boolean isHasMane) {
        this.sex = sex;
        this.isHasMane = isHasMane;
    }
    @Parameterized.Parameters
    public static Object[][] getLions() {
        return new Object[][] {
                { "Самка", false},
                { "Самец", true}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        lion = new Lion(sex);
        boolean result = lion.doesHaveMane();
        Assert.assertEquals(isHasMane, result);
    }
}