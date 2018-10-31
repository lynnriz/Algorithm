package leetcode;

public class leetcode5 {
	public String longestPalindrome(String s) {
		int length = s.length();
		if(length == 1) return s;
		int maxLength = 0;
		int start = 0;

		for(int i=0;i<length;++i) {
			for(int j=i;j<length;++j) {
				int loopStart = 0;
				int loopEnd = 0;
				for(loopStart = i,loopEnd = j;loopStart<=loopEnd;loopEnd--,loopStart++) {
					if(s.charAt(loopStart) != s.charAt(loopEnd)) break;
				}
				if(loopStart>=loopEnd &&(j-i>=maxLength)) {
					maxLength = j-i+1;
					start = i;
				}
			}
			
		}
		return s.substring(start, start+maxLength);
		
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123");
		String x = "123";
		System.out.println(x.substring(1,2));
		leetcode5 a = new leetcode5();
		String s = a.longestPalindrome("ac");
		System.out.println(s);

	}

}
