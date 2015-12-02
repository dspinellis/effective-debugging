#include <syslog.h>

int
main()
{
    openlog("myapp", 0, LOG_USER);
    syslog(LOG_DEBUG, "Called main() in %s", __FILE__);
    closelog();
}
