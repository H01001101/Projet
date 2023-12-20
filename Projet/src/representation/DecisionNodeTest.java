package representation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Cette classe est la classe test de la classe DecisionNode
 */

public class DecisionNodeTest {
	
	@Test
	public void test2chooseNext() {
		DecisionNode decision = Main.ville2_1;
		Node resultat = decision.chooseNext();
		assertEquals(Main.choixplanque2_1,resultat);
	}

}
