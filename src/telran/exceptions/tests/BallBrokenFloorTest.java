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
		boolean flag=false;
		do  {
			try {
				bbf.checkFloor(index);
				index++;
				flag = true;
			} 
			catch (Exception e){
			    flag=false;
			}
			}
		while (flag && index<=N_FLOORS);
	return index > N_FLOORS ?  - 1: index;
}
}