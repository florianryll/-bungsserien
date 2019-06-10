import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RingTest {
	

	@Test
	public void testNextCurrent() {
		Ring<Element> myRing = null;
		try {
			myRing = new Ring<Element>(3);
		} catch (maxSizeSmallerThenOneExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e1) {
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
		Ring<Element> myRing = null;
		try {
			myRing = new Ring<Element>(5);
		} catch (maxSizeSmallerThenOneExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myRing.add();
		} catch (elementEQNullExeption | maxSizeIsReachedExeption e) {
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
