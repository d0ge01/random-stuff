import re
name = input("Ciao puoi inserire il tuo nome: ")

classe = ""
condizione = 1
alfabeto = ['a', 'b', 'c', 'd', 'e']

while condizione:
	print("Che classe frequenti ? \n a) Prima \n b) Seconda \n c) Terza \n d) Quarta \n e) Quinta\n Scegli: ")
	classe = input()
	condizione = not(re.match( r'[abcde]', classe, re.M|re.I ))

condizione = 1
print("In quale sezione?\nScegli:")

while condizione:
	sezione = input()
	condizione = not(re.match( r'[abcd]', sezione, re.M|re.I ))

print("Quale corso segui?\n a) Sistemi informativi aziendali\n b) Turismo\n c) Operatore socio sanitario")
condizione = 1
while condizione:
	corso = input()
	condizione = not(re.match( r'[abc]', sezione, re.M|re.I ))

classe = alfabeto.index(classe.lower())
corso = corso.lower()

corso = corso.replace('a','Sistemi informativi aziendali')
corso = corso.replace('b','Turismo')
corso = corso.replace('c','Operatore socio sanitario')

print("ciao ", name, " che frequenta la ", classe, " sezione ", sezione, " e vuoi fare ", corso, "\n")

input()