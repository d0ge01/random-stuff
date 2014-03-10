program prova;
uses crt;
(* Salvatore Criscione :D *)
var lasta,lastb:real;
    c,gradi:integer;
    r:boolean;
function checkPitagora(sinx,cosx:real):boolean;
var c:boolean;
begin
     c := ((sinx*sinx)+(cosx*cosx)) = 1;
     checkPitagora := c;
end;

function duplicazione(alpha:real):real;
var o:real;
begin
     o := 2 * sin(alpha) * cos(alpha);
     duplicazione := o;
end;
function tangente(alpha:real):real;
var o:real;
begin
     o := sin(alpha) /  cos(alpha);
     tangente := o;
end;

function sotCos(alpha,beta:real):real;
var o:real;
begin
     o := cos(alpha)*cos(beta) + sin(alpha) * sin(beta);
     sotCos := o;
end;
function addCos(alpha,beta:real):real;
var o:real;
begin
    o := cos(alpha)*cos(beta) - sin(alpha)*sin(beta);
    addCos:= o;
end;

function sotSin(a,b:real):real;
var o:real;
begin
     o := sin(a)*cos(b)-sin(b)*cos(a);
     sotSin := o;
end;
function addSin(a,b:real):real;
var o:real;
begin
     o := sin(a)*cos(b)+sin(b)*cos(a);
     addSin := o;
end;
begin
    c := -1;
    lasta := 0;
    lastb := 0;
    r := FALSE;
    repeat
          clrscr;
          writeln('last:');
          writeln('Return: ',r);
          r := FALSE;
          writeln('alpha : ',lasta,'   Beta: ',lastb);
          writeln('1. controlla pitagora sui ultimi 2.');
          writeln('2. esegui duplicazione di un angolo');
          writeln('3. aggiorna last');
          writeln('4. tangente dei 2 angoli.');
          writeln('5. Somma a,b cos');
          writeln('6. Sottrai a,b cos');
          writeln('7. Somma a,b sin');
          writeln('8. Sottrai a,b sin');
          writeln('0. esci.');
          write('scegli: ');
          readln(c);
          if c = 1 then
             r := checkPitagora(cos(lasta),sin(lasta));
          if c = 2 then
          begin
             write('inserisci un angolo in gradi: ');
             readln(gradi);
             lasta := duplicazione( Gradi * PI / 180 );
             lastb := lasta;
          end;
          if c = 3 then
          begin
             write('inserisci angolo a in gradi: ');
             readln(gradi);
             lasta := gradi * PI / 180;
             write('inserisci angolo b in gradi: ');
             readln(gradi);
             lastb := gradi * PI / 180;
          end;
          if c = 4 then
          begin
             lasta := tangente(lasta);
             lastb := tangente(lastb);
          end;
          if c = 5 then
          begin
             lasta := addCos(lasta,lastb);
             lastb := 0;
          end;
          if c = 6 then
          begin
             lasta := sotCos(lasta,lastb);
             lastb := 0;
          end;
          if c = 7 then
          begin
             lasta := addSin(lasta,lastb);
             lastb := 0;
          end;
          if c = 8 then
          begin
             lasta := sotSin(lasta,lastb);
             lastb := 0;
          end;

    until c = 0;
end.
