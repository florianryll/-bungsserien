import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RingTest {
	

	@Test
	public void testNextCurrent() {
		Ring<Integer> myRing = null;
		try {
			myRing = new Ring<Integer>(3);
		} catch (maxSizeSmallerThenOneExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRing.add(2);
			myRing.add(5);
			myRing.add(7);
		} catch (maxSizeIsReachedExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			assertTrue(myRing.next() == myRing.current());
		} catch (noElementInRingExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@Test
	public void testNextCurrent2() {
		Ring<Integer> myRing = null;
		try {
			myRing = new Ring<Integer>(5);
		} catch (maxSizeSmallerThenOneExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRing.add(12);
			myRing.add(45);
			myRing.add(2);
			myRing.add(4);
			myRing.add(5);
		} catch (maxSizeIsReachedExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			assertTrue(myRing.current() == myRing.next().next().next().next().next());
		} catch (noElementInRingExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
