#include <stdio.h>

int
main()
{
	printf("S=%zu I=%zu L=%zu LL=%zu P=%zu\n", sizeof(short),
	    sizeof(int), sizeof(long),
	    sizeof(long long), sizeof(char *));
}
