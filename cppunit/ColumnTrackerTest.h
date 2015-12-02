#include <cppunit/extensions/HelperMacros.h>
#include "ColumnTracker.h"

class ColumnTrackerTest : public CppUnit::TestFixture  {
    CPPUNIT_TEST_SUITE(ColumnTrackerTest);
    CPPUNIT_TEST(testCtor);
    CPPUNIT_TEST(testTab);
    CPPUNIT_TEST(testAfterNewline);
    CPPUNIT_TEST_SUITE_END();
public:
    void testCtor() {
        ColumnTracker ct;
        CPPUNIT_ASSERT(ct.position() == 0);
    }

    void testTab() {
        ColumnTracker ct;
        // Test plain characters
        ct.process('x');
        CPPUNIT_ASSERT(ct.position() == 1);
        ct.process('x');
        CPPUNIT_ASSERT(ct.position() == 2);
        // Test tab
        ct.process('\t');
        CPPUNIT_ASSERT(ct.position() == 8);
        // Test character after tab
        ct.process('x');
        CPPUNIT_ASSERT(ct.position() == 9);
        // Edge case
        while (ct.position() != 15)
            ct.process('x');
        ct.process('\t');
        CPPUNIT_ASSERT(ct.position() == 16);
        // Edge case
        ct.process('\t');
        CPPUNIT_ASSERT(ct.position() == 24);
    }

    void testAfterNewline() {
        ColumnTracker ct;
        ct.process('x');
        ct.process('\n');
        CPPUNIT_ASSERT(ct.position() == 0);
    }
};
