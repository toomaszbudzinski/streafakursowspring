package pl.strefakursow.kursspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.strefakursow.kursspring.domain.Castle;
import pl.strefakursow.kursspring.domain.Jedi;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KursspringApplicationTests {

	@Autowired
	Jedi jedi;

	@Autowired
	Castle castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCastle() {
		String expect = "CastleToString: Znajduje się tu zamek o nazwie \"NewCastle United F.C.\" rycerz: Jedi{name='Yoda', age=100, quest=Order 66}";
		//Castle castle = new Castle(jedi);
		assertEquals(expect,castle.toString());

	}
}
