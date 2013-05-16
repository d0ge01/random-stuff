#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int genRandomChar(int r);

int
main(void)
{
          int l = 1;
          char scelta;
          do {
             printf("\nInsert Password length: ");
             scanf("%d",&l);
          
             srand((unsigned int) time(0) + getpid());
             printf("\n");
             for (;l>0;l--)
             {
               putchar(getRandomChar(rand()));
               srand(rand());
             }
          
             printf("\n");
             printf("Premi c per generarne un altra...");
             scelta = getche();
             } while(scelta=='c');
}

int
getRandomChar(int r)
{
          return r % 94 + 33;
}
