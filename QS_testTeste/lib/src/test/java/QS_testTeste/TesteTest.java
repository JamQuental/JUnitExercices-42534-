package QS_testTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteTest {

	private ArrayList<String> testList;
	@BeforeAll
	public static void onceExecutedBeforeAll() {
	System.out.println("@BeforeClass:onceExecutedBeforeAll");
	}
	@BeforeEach
	public void executedBeforeEach() {
	testList = new ArrayList<String>();
	System.out.println("@Before: executedBeforeEach");
	}
	@AfterAll
	public static void onceExecutedAfterAll() {
	System.out.println("@AfterClass: onceExecutedAfterAll");
	}
	@AfterEach
	public void executedAfterEach() {
	testList.clear();
	System.out.println("@After: executedAfterEach");
	}
	@Test
	public void OneItemCollection() {
	testList.add("oneItem");
	assertEquals(1, testList.size());
	System.out.println("@Test: OneItemArrayList");
	}
	@Test
	public void EmptyCollection() {
	assertTrue(testList.isEmpty());
	System.out.println("@Test: EmptyArrayList");
	}
}
