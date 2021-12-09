import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
public class testSelectionSort {
	@Test
	public void test() {
			testPositive();
			testNegative();
			testMixed();
			testDuplicates();
	}

  public testSelectionSort() {
  }

  public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = -4;
        arr[3] = 8;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -4;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 1;
        Sortedarr[4] = 8;

        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);

        int index;
        for (index = 0; index < arr.length; ++index) {
        	assertEquals("wrong answer", arr[index], Sortedarr[index]);
        }
    }

    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 7;
        arr[2] = 7;
        arr[3] = -1;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 7;

        SelectionSort temp = new SelectionSort();
        arr = temp.basicSelectionSort(arr);

        int index;
        for (index = 0; index < arr.length; ++index) {
        	assertEquals("wrong answer", arr[index], Sortedarr[index]);
        }
    }
}
