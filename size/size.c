#include <stdio.h>

int
main()
{
	printf("S=%d I=%d L=%d LL=%d P=%d\n", sizeof(short),
	    sizeof(int), sizeof(long),
	    sizeof(long long), sizeof(char *));
}
