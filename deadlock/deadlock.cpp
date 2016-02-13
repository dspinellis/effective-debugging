#include <iostream>
#include <mutex>
#include <thread>

using namespace std;

static mutex m1, m2;

void bob()
{
	lock_guard<mutex> g1(m1);
	lock_guard<mutex> g2(m2);
	cout << "Hi, it's Bob" << endl;
}

void alice()
{
	lock_guard<mutex> g1(m2);
	lock_guard<mutex> g2(m1);
	cout << "Hi, it's Alice" << endl;
}

int main()
{
	thread t_bob(bob);
	thread t_alice(alice);

	t_bob.join();
	t_alice.join();
	return 0;
}
