def hanoi(n, a, b, c) # hanoi(N_DISK,NAME_A,NAME_B,NAME_C)
	if n <= 0
		return 0
	end
	hanoi(n-1,a,c,b)
	puts "Move disk from #{a} to #{b}"
	hanoi(n-1,c,b,a)
end

n = 0
while n<=0
	print "Insert n: "
	n = gets.chomp.to_i
end
hanoi(n,'a','b','c')