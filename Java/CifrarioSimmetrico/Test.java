class Test {
	public static void main(String[] args) {
		Encoder ec1 = new Encoder();
		String str1 = "";
		for ( int i = 0 ; i < args.length;i++)
			str1+= i == args.length-1 ? args[i] : args[i] + " ";
		System.out.println(ec1.encode(str1));
	}
}
		
