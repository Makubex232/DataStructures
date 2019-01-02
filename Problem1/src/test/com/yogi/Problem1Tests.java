package test.com.yogi;

import com.yogi.Problem1 ;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem1Tests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Problem1 p1 = new Problem1();
//		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

}
