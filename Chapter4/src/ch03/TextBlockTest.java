package ch03;

public class TextBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String textBlocks = """  
				Hello,
				hi,
				how r u""";
				// 따옴표 3개 넣음
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
		
	
		
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					</body>
				</html>	
				""";
	}


}
