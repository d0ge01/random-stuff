#!/usr/bin/python

import math, random

def eratostene ( limit ):
    primi = [ True ] * limit
    q = 2
    rad = int(limit**2) + 1
    while q <= rad:
        for i in range(q+q, limit, q):
            primi[i] = False
        q += 1
    return ( pos for pos, val in enumerate(primi[2:], start=2) if val)

def mcd( a, b ):
    while b:
        a, b = b , a % b
    return a

def coprimo( fn ):
    valid = [ False ] * fn
    for i in range(1, fn):
        if mcd(i, fn) == 1:
            valid[i] = True
    return list( pos for pos, val in enumerate(valid[2:], start=2) if val)

def intero ( n ):
    if ( n - math.trunc(n) ) == 0:
        return True
    else:
        return False


print("**************************************")
print("* RSA Implementation by Salvatore C. *")
print("**************************************")

n = eval(input('Inserisci il numero di cifre dei numeri: '))

n1= 10 ** n
print('[*] Calcolo numeri primi inferiori a ', n1)

print('[*] Applico il Crivello di Eratostene')
s = list(eratostene(n1))

print('[*] Scelgo i due migliori numeri primi')
p = s[-1]
q = s[-2]
print('[*] Q = ', q,'   P = ', p)

n = p * q
z = ( p - 1 ) * ( q - 1 )

valid = coprimo( z)
print('[*] Scelgo un e ')

e = valid[random.randint(0,len(valid) -1)]

print('[*] Calcolo Chiave privata...')

d = 0
k = 1
avanti = True
while avanti:
    d = ( k * z + 1 ) / e
    if intero(d):
        avanti = False
    k += 1
d = math.trunc(d)
print('Chiavi : (',e,',',n,') e (',d,',',n,')')
