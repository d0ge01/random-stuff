if ARGV.size < 3
	puts "Usage: ruby random.rb N_MIN N_MAX TIMES"
	exit
end

n_min = ARGV.shift.to_i
n_max = ARGV.shift.to_i
n_n = ARGV.shift.to_i

if n_min > n_max
	buff = n_min
	n_min= n_max
	n_max= n_min
end

diff = n_max - n_min # max: 20 min: 5
if diff == 0
	diff = 1
end

n_n.times do
	print ' ',rand(diff)+n_min,' '
end
puts ""