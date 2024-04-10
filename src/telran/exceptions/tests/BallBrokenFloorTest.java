package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.BallBrokenFloor;

class BallBrokenFloorTest {

	private static final int N_FLOORS = 100;

	@Test 
	void test() {
		BallBrokenFloor bbf = new BallBrokenFloor(N_FLOORS);
		assertEquals(bbf.getBrokenFloor(), getMinBrokenFloor(bbf));
	  
	}

	private int getMinBrokenFloor(BallBrokenFloor bbf) {
		int index=1;
		int left= 0;
		int right= N_FLOORS;
		int middle= (left+right)/2;
		 while (left<=right) {
			
			try {
				bbf.checkFloor(middle);
				left=middle+1;
			} 
			catch (Exception e){
				right=middle-1;
			}
			middle= (left+right)/2;
			}
		
	return left;
}
}