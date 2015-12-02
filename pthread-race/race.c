#include <assert.h>
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define C(x) assert((x) == 0)

static int counter;

void *increment(void *threadid)
{
	int i, tmp;

	for (i = 0; i < 100000; i++) {
		tmp = counter;
		tmp++;
		counter = tmp;
	}
	return (NULL);
}

int main()
{
	pthread_t tid[2];
	int i;

	for (i = 0; i < 2; i++)
		C(pthread_create(&tid[i], NULL, increment, NULL));
	for (i = 0; i < 2; i++)
		C(pthread_join(tid[i], NULL));
	printf("counter=%d\n", counter);
	return 0;
}
