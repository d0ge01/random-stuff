#include <stdio.h>
#include <stdlib.h>

#define DIM 6

int ricercaSeq(int *v,int x,int dim);
int ricercaBin(int *v, int n, int dim);
void bSort(int *v,int dim);
void scambia(int *a,int *b);
void stampaV(int *v,int dim);

main()
{
      int v1[DIM] = {1,4,2,6,9,5};
      printf("Ricerca Sequenziale\n%d\nPrima:",ricercaSeq(v1,4,DIM));
      stampaV(v1,DIM);
      printf("\nDopo: ");
      bSort(v1,DIM);
      stampaV(v1,DIM);
      printf("\nRicerca Binaria    \n%d\n",ricercaBin(v1,4,DIM));
      system("PAUSE");
      return 0;
}

int
ricercaSeq(int *v,int x,int dim)
{
     /*
     // Alternative, use this for readably purpose.
     int i,trovato = 0;
     for ( i = 0; i < dim && !trovato; i++ )
           if ( v[dim] == x )
                trovato := !trovato;
     return trovato;
     */            
     
     while(--dim)
          if(v[dim] == x)
               break;
     dim = ( v[0] == x && dim == 0 ) ? !dim : dim;
     return dim;
}  

int
ricercaBin(int *v, int n, int dim)
{
     int inizio = 0,fine = n - 1,p;
     if ( dim < 0 )
        return -1;
     while ( inizio <= fine )
     {
           p = (inizio+fine)/2;
           if ( v[p] == n )
                return p+1; // WARRRRRRRNINGGGGGG GTFO, This return position + 1 for 0 states.
           if ( v[p] < n )
              inizio = p + 1;
           else
              fine = p - 1;
    }
    return -1;
}
                		
void
bSort(int *v, int dim){
    int i;
    int ordinato = 0;
    while (dim>1 && !ordinato) {
        ordinato = 1;

        for (i=0; i&lt;dim-1; i++)
            if (v[i]>v[i+1]) {
               scambia(&v[i],&v[i+1]);
               ordinato = 0;
            }
        dim--;
    }
}
void
scambia(int *a,int *b)
{
    int *tmp;
    tmp=*a;
    *a=*b;
    *b=tmp;
}

void
stampaV(int *v,int dim)
{
    int i;
    for ( i = 0 ; i < dim ; i++ )
        printf(" %d ",v[i]);
}
