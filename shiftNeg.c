#include <stdio.h>
#include <stdlib.h>
/* Salvatore Criscione <not.salvatore@logorroici.org>
 * Togliere i negativi shiftando verso sinistra gli altri.
 * Esercizio per scuola...
 * Quindi si usa integer che vale 1 vero, e 0 false
*/

#define NELEMENTI  5

void leggiVett(int *v);
void shiftDelete(int *v,int pos1);
void checkMerda(int *v);
void stampa(int *v);

int
main()
{
      int *v1 = NULL;
      v1 = malloc(sizeof(int)*NELEMENTI)
      leggiVett(v1);
      printf("Prima: ");
      stampa(v1);
      checkMerda(v1);
      printf("Dopo : ");
      stampa(v1);
      sleep(5000); // mette in pausa per 5 secondi cosi leggete scemi.
	  free(v1);
      return 0;
}

void
leggiVett(int *v)
{
      int i;
      for ( i = 0; i < NELEMENTI ; i++ )
      {
            printf("Inserisci l'elemento %d: ",i);
            scanf("%d",&v[i]);
      }
}


void
stampa(int *v)
{
      int i;
      for ( i = 0; i < NELEMENTI ; i++ )
      {
          printf(" %d ",v[i]);
      }
      printf("\n");
}

void
shiftDelete(int *v,int pos1)
{
      pos1 = pos1 + 1;
      int i;
      for ( i = pos1 ; i < NELEMENTI ; i++ )
            v[pos1-1] = v[pos1];
      v[pos1] = 0;
}
void
checkMerda(int *v)
{
      int i,j;
      for ( i = 0; i < NELEMENTI;i++)
            if ( v[i] <= 0 )
                  for ( j = i;j < NELEMENTI;j++)
                        shiftDelete(v,j);
}