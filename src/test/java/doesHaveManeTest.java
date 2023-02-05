import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class doesHaveManeTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final String sex;
    private final boolean isHasMane;
    String result = "Используйте допустимые значения пола животного - самец или самка";
    Lion lion;
    @Mock
    Feline feline;

    public doesHaveManeTest(String sex, boolean isHasMane) {
        this.sex = sex;
        this.isHasMane = isHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLions() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
                {"Льенок", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        try {
            lion = new Lion(sex, feline);
            boolean result = lion.doesHaveMane();
            Assert.assertEquals(isHasMane, result);
        } catch (Exception exception) {
            Assert.assertEquals(result, exception.getMessage());
        }
    }
}