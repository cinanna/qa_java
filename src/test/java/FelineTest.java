import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception{
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        List<String> food = feline.eatMeat();
        Assert.assertEquals(result, food);
    }
    @Test
    public void getFamilyTest() {
        String result = "Кошачьи";
        String family = feline.getFamily();
        Assert.assertEquals(result, family);
    }
    @Test
    public void getKittensTest() {
        int result = 2;
        int kittens = feline.getKittens(2);
        Assert.assertEquals(result, kittens);
    }
    @Test
    public void getKittenTest() {
        int result = 1;
        int kittens = feline.getKittens();
        Assert.assertEquals(result, kittens);
    }
}