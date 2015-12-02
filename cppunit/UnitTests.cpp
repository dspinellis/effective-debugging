#include <cppunit/ui/text/TestRunner.h>
#include "ColumnTrackerTest.h"

int
main(int argc, char *argv[])
{
	CppUnit::TextUi::TestRunner runner;

	runner.addTest(ColumnTrackerTest::suite());
	runner.run();
	return 0;
}
