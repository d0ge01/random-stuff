#
# Author : Salvatore Criscione <d0ge01>
# Mail   : not.d0ge@anche.no
# Date   : 11/14/2013
#

if ARGV.size < 1
	puts "Usage " + $0 + " <boundary>"
	exit
else
	puts "PASSCODE: "
	for line in ARGV
		x = line.split('.').first.to_i
		y = line.split('.').last.to_i
		print ( x % y ).chr
	end
	puts ""
	puts "By Salvatore Criscione <d0ge01> <not.d0ge@anche.no>"
end
