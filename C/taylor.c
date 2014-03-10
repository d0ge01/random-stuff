/* Taylor-series 
 * Salvatore Criscione <not.salvatore(AT)logorroici(DOT)org>
 * thanks http://www.ma.utexas.edu/ for documents about this
*/

#include <stdio.h>
#include <stdlib.h>


float taylor(int n,int k, float h,float t,float x);

int
main(void)
{
          // dichiaro le mia bellissime variabili
		  int n;
		  float a = 1.0;
		  float b = 2.0;
		  float x = -4.0;
          
          printf("Inserisci il limitatore: ");
          scanf("%d",&n);
          taylor(n, 0,(b-a)/n,a,x);
}

float
taylor(int n,int k, float h,float t,float x) // <3
{
 
           float fosfo, gay, di, merda;
           if ( k >= n )
              return 0; // end
           fosfo = 1 + x * x + t * t * t;
           gay = 2 * x * fosfo + 3 * t * t;
           di = 2 * x * gay + 2 * fosfo * fosfo + 6 * t;
           merda = 2 * x * di + 6 * fosfo * gay + 6;
           x += h * (fosfo + 0.5 * h * (gay + h/3 * (di + 0.25 * h * merda)));
           
           t = t + k * h;
           printf("k = %d t = %f x = %f\n", k, t, x);
           return taylor(n,k+1,h,t,x);
}
