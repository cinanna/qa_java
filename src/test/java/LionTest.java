import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        int kittens = 1;
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int result = lion.getKittens();
        Assert.assertEquals(kittens, result);
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = lion.getFood();
        Assert.assertEquals(result, food);
    }
}