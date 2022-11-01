import com.hemanth.comps.Flipkart;
import com.hemanth.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		// get Target Class Object(Flipkart class obj)  from Factory
		
		Flipkart fpkt = FlipkartFactory.getInstance("BlueDart");
		String resultMessage = fpkt.shopping(new String[] {"Candles", "Cake", "Jeans", "Wine"}, new double[] {540.23, 860.0, 6300.0, 1500.0});
		
		System.out.println(resultMessage);
	}

}
