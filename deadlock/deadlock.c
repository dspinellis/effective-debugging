#include <assert.h>
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

static pthread_mutex_t m1 = PTHREAD_MUTEX_INITIALIZER;
static pthread_mutex_t m2 = PTHREAD_MUTEX_INITIALIZER;

#define C(x) assert((x) == 0)

void *bob(void *threadid)
{
	C(pthread_mutex_lock(&m1));
	sleep(1);
	C(pthread_mutex_lock(&m2));
	printf("Hi, it's Bob\n");
	C(pthread_mutex_unlock(&m2));
	C(pthread_mutex_unlock(&m1));
	return (NULL);
}

void *alice(void *threadid)
{
	C(pthread_mutex_lock(&m2));
	C(pthread_mutex_lock(&m1));
	printf("Hi, it's Alice\n");
	C(pthread_mutex_unlock(&m1));
	C(pthread_mutex_unlock(&m2));
	return (NULL);
}

int main()
{
	pthread_t t_bob, t_alice;

	C(pthread_create(&t_bob, NULL, bob, NULL));
	C(pthread_create(&t_alice, NULL, alice, NULL));
	pthread_exit(NULL);
	return 0;
}
