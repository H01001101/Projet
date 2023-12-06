package representation;

public class TerminalNode extends Node {
		
		public TerminalNode() {
			super();
		}
		
		public TerminalNode(String description) {
			super(description);
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
		
		@Override
		public boolean equals(Object o) {
			return super.equals(o);
		}
		
		public Node chooseNext() {
			return this;
		}
}
