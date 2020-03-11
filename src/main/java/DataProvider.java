import java.util.concurrent.ThreadLocalRandom;

final public class DataProvider {
	
	public static int[] randomNonnegativeInts(final int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; ++i) {
			array[i] = ThreadLocalRandom.current().nextInt(0, 20);
		}
		return array;
	}
	
}
