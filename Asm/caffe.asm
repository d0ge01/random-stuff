;Anno scolastico :  2012-2013
;Classe          :  3B
;Componenti      :  Salvatore Criscione - Mathias Gherardi 
; MACCHINA DEL CAFFEE :Q_____
;:Q______________________________________________

;
;
;                    .,-:;//;:=,
;               . :H@@@MM@M#H/.,+%;,             
;            ,/X+ +M@@M@MM%=,-%HMMM@X/,
;          -+@MM; $M@@MH+-,;XMMMM@MMMM@+-
;         ;@M@@M- XM@X;. -+XXXXXHHH@M@M#@/.
;       ,%MM@@MH ,@%=             .---=-=:=,.
;       =@#@@@MX.,                -%HX$$%%%:;
;      =-./@M@M$                   .;@MMMM@MM:   
;      X@/ -$MM/                    . +MM@@@M$   <Salvatore Criscione :D>
;     ,@M@H: :@:                    . =X#@@@@-
;     ,@@@MMX, .                    /H- ;@M@M=
;     .H@@@@M@+,                    %MM+..%#$.
;      /MMMM@MMH/.                  XM@MH; =;
;       /%+%$XHH@$=              , .H@@@@MX,
;        .=--------.           -%H.,@@@@@MX,
;        .%MM@@@HHHXX$$$%+- .:$MMX =M@@MM%.
;          =XMMM@MM@MM#H;,-+HMM@M+ /MMMX=
;            =%@M@M#@$-.=$@MM@@@M; %M%=
;              ,:+$+-,/H#MMMMMMM@= =,
;                    =++%%%%+/:-. 
.model tiny
	LF equ 0Ah
	CR equ 0Dh
.data
acapooo			DB  CR,LF,'$'
menu1			DB	CR,LF,'+-----------------------------------------+' \
				   ,CR,LF,'|                  MENU                   |' \
				   ,CR,LF,'|  1 - caffe'' (35 centesimi )            |' \
				   ,CR,LF,'|  2 - The''   (20 centesimi )            |' \
				   ,CR,LF,'|  3 - Cioccolata  ( 40 centesimi )       |' \
				   ,CR,LF,'+-----------------------------------------+',CR,LF,'$'
menu2			DB	CR,LF,'+-----------------------------------------+' \
				   ,CR,LF,'|        MENU INSERIMENTO SOLDI           |' \
				   ,CR,LF,'|  1 - 10 cent                            |' \
				   ,CR,LF,'|  2 - 20 cent                            |' \
				   ,CR,LF,'|  3 - 30 cent                            |' \
				   ,CR,LF,'+-----------------------------------------+',CR,LF,'$'
soldi			DB 0
stringaSoldi	DB CR,LF,' soldi attuali: $'
stringaFine		DB CR,LF,' Grazie e arrivederci :3 ',CR,LF,'$'
stringaCaffe	DB CR,LF,' Eccoti il tuo caffe. ',CR,LF,'$'
stringaThe		DB CR,LF,' Eccoti il tuo the. ',CR,LF,'$'
stringaCioccolata	DB CR,LF,' Eccoti il tuo cioccolata. ',CR,LF,'$'

.code
org 100h
prog:
	 mov ah,9
	 mov dx,offset menu1
	 int 21h
	
	 mov ah,01h
	 int 21h
	 mov bl,al
     cmp bl,'1'
	 je prendicaffe
	 cmp bl,'3'
	 je prendithe
	 cmp bl,'3'
	 je prendicioccolata
	
prendicaffe:
	mov ah,9h
    mov dx,offset menu2
	int 21h
	
	mov ah,8h
	int 21h
	
	cmp al,'1'
	je agg10centcaffe
	cmp al,'2'
	je agg20centcaffe
	cmp al,'3'
	je agg30centcaffe
	
	cmp soldi,35
	jb daicaffe1
prendithe:
	mov ah,9h
    mov dx,offset menu2
	int 21h
	
	mov ah,8h
	int 21h
	
	cmp al,'1'
	je agg10centthe
	cmp al,'2'
	je agg20centthe
	cmp al,'3'
	je agg30centthe
	
	cmp soldi,20
	jb daithe
prendicioccolata:
	mov ah,9h
    mov dx,offset menu2
	int 21h
	
	mov ah,8h
	int 21h
	
	cmp al,'1'
	je agg10centcioccolata
	cmp al,'2'
	je agg20centcioccolata
	cmp al,'3'
	je agg30centcioccolata
	
	cmp soldi,40
	jb daicioccolata

agg10centcaffe:
	add soldi,10
	jmp prendicaffe
daicaffe1:
	jmp daicaffe
agg20centcaffe:
	add soldi,20
	jmp prendicaffe
agg30centcaffe:
	add soldi,30
	jmp prendicaffe
agg10centcioccolata:
	add soldi,10
	jmp prendicioccolata
agg20centcioccolata:
	add soldi,20
	jmp prendicioccolata
agg30centcioccolata:
	add soldi,30
	jmp prendicioccolata
agg10centthe:
	add soldi,10
	jmp prendithe
agg20centthe:
	add soldi,20
	jmp prendithe
agg30centthe:
	add soldi,30
	jmp prendithe

daicaffe:
	mov ah,9
	mov dx,offset stringaCaffe
	int 21h
	
	jmp fine
daithe:
	mov ah,9
	mov dx,offset stringaThe
	int 21h
	
	jmp fine
daicioccolata:
	mov ah,9
	mov dx,offset stringaCioccolata
	int 21h
	
	jmp fine

fine:
	 mov ah,9
	 mov dx,offset stringaFine
	 int 21h
	 mov ah,4ch
	 int 21h


 end prog