import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        String expectedResult = "Мяу";
        Cat cat = new Cat(feline);
        String testResult= cat.getSound();
        Assert.assertEquals(expectedResult, testResult);
    }
    @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        List<String> result = cat.getFood();
        Assert.assertTrue(result.isEmpty());
    }
}