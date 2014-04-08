class Test {
	public static void main(String[] args) {
		Encoder ec1 = new Encoder();
		Decoder dc1 = new Decoder();
		
		String str1 = "";
		for ( int i = 0 ; i < args.length;i++)
			str1+= i == args.length-1 ? args[i] : args[i] + " ";
		String enc = ec1.encode(str1);

		System.out.println(enc);
		
		System.out.println(dc1.decode(enc));
	}
}
		
