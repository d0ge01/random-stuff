#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <math.h>
/* Salvatore Criscione <not.salvatore@logorroici.org>
 * Hamming Coder
 */
#define X           16
#define Y           11
#define R           5
#define CR          16

// Prototipi
void loadinfo(int *cv);
void printm(int **m);
void printi(int *cv);
void checkD(int **v,int *cv);
void checkP(int **v,int *cv);
void printc(int *cv);
void hex1(int *cv);
void color(WORD color);

HANDLE hConsole;
WORD wAttr;
int DEBUG=0;
int
main(void)
{         int i,j;
          int **hamming;
          hamming=(int **)malloc(sizeof(int *)*R);
          for(i=0; i<R; i++)
              hamming[i]=(int *)malloc(sizeof(int)*CR);
          int buff[R][CR] = {   1,1,1,1,1,0,0,0,1,1,1,1,0,0,0,0,
                                1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,0,
                                1,1,0,1,1,0,0,0,1,1,1,0,0,1,0,0,
                                1,1,0,0,1,0,0,0,1,1,1,0,0,0,1,0,
                                0,1,1,1,1,0,0,0,1,1,1,0,0,0,0,1};
          for(i=0;i<R;i++)
              for(j=0;j<CR;j++)
                  hamming[i][j] = buff[i][j];
          
          char continua, scelta;
          int info[X];
          
          do {
              color(FOREGROUND_GREEN);
              printm(hamming);
              printf("\n\n");
              
              loadinfo(info);
              printf("\n");
              
              printm(hamming);
              color(FOREGROUND_BLUE);
              
              printi(info);
              color(FOREGROUND_GREEN);
              
              printf("Use 'p' for pair\nUse 'd' for unpair\nMake Ch: ");
              scelta = getche();
              printf("\n");
              switch(scelta)
              {
                            case 'p':{
                                 checkP(hamming, info);
                                 break;
                            }
                            case 'd':{
                                 checkD(hamming, info);
                                 break;
                            }
                            default:{
                                 printf("Use 'p' or 'd'...\n");
                            }
              }
              printm(hamming);
              color(FOREGROUND_BLUE);
              printc(info);
              color(FOREGROUND_GREEN);
              
              printf("Il valore hex: ");
              hex1(info);
              printf("\n");
              printf("Premi 'c' se vuoi continuare.. ");
              continua = getche();
          }while(continua=='c');    
          return 0;
}

void
printm(int **m)
{
           int i,j;
           for ( j = 0 ; j < R ; j++ )
           {
               for ( i = 0 ; i < CR ; i++ )
               {
                   printf(" %d ",m[j][i]);
               }
               printf("\n");
           }
}

void
loadinfo(int *cv)
{
             int i;
             for ( i = 0; i<Y;i++ )
             {
                 do {
                    printf("Inserire il bit di informazione %d: ",i+1);
                    scanf("%d",&cv[i]);
                    if ( cv[i] > 1 || cv[i] < 0)
                       printf("Non hai inserito un bit valido, Capra.\n");
                 } while(cv[i] > 1 || cv[i] < 0);
             }
}

void
printi(int *cv)
{
           int i;
           for(i=0;i<Y;i++)
               printf(" %d ",cv[i]);
           printf("\n");
}

void
checkP(int **v,int *cv)
{
           int cont=0,i,j;
           for(i=0;i<R;i++)
           {
               for(j=0;j<Y;j++)
                   if(cv[j]==1)
                       if(v[i][j]==1)
                           cont++;
               if(cont%2==0){
                   if(DEBUG)
                       printf("Set cv[%d] to 0,cont=%d\n",Y+i,cont);
                   cv[Y+i] = 0;
               }
               else {
                   if(DEBUG)
                       printf("Set cv[%d] to 1,cont=%d\n",Y+i,cont);
                   cv[Y+i] = 1;
               }
               cont = 0;
           }
}
void
checkD(int **v,int *cv)
{
           int cont=0,i,j;
           for(i=0;i<R;i++)
           {
               for(j=0;j<Y;j++)
                   if(cv[j]==1)
                       if(v[i][j]==1)
                           cont++;
               if(cont%2==0){
                   if(DEBUG)
                       printf("Set cv[%d] to 1,cont=%d\n",Y+i,cont);
                   cv[Y+i] = 1;
               }
               else {
                   if(DEBUG)
                       printf("Set cv[%d] to 0,cont=%d\n",Y+i,cont);
                   cv[Y+i] = 0;
               }
               cont = 0;
           }
}
void
printc(int *cv)
{
           int i;
           for(i=0;i<X;i++)
           {
               if ( i > 10 )
                  color(FOREGROUND_RED);
               printf(" %d ", cv[i]);
           }
           printf("\n");
}
void
hex1(int *cv)
{
         int d,cont,somma,i;
         d = 3;
         cont = 0;
         somma = 0;
         while ( d <= 15 )
         {
               for(cont=0;cont<=3;cont++)
               {
                   i=d-cont;
                   somma = somma+cv[i]*pow(2,cont);
               }
               printf(" %X ", somma);
               somma = 0;
               d = d+4;
         }
}
void
color(WORD color)
{         
          hConsole=GetStdHandle(STD_OUTPUT_HANDLE);
          wAttr=color;
          SetConsoleTextAttribute(hConsole,wAttr);
}
