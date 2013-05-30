#include <stdio.h>
#include <stdlib.h>
#include <dos.h>
#include <conio.h>

int menu();
void drawG(int *v);


int
main(void)
{
      while(menu())
                   ;
}

void drawG(int *v)
{
      clrscr();
      gotoxy(10,10);
      printf("culo");
}

int
menu()
{
      int sc;
      printf("1. Bubble Sort\n");
      printf("2. Spaghetti Sort\n");
      printf("0. Esci\nScegli:");
      
      scanf("%d",&sc);
      return sc;
}
