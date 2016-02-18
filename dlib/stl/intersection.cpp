#include <vector>
#include <algorithm>
#include <iterator>

int
main()
{
    std::vector<int> s1 = {5, 3, 2};
    std::vector<int> s2 = {1, 3, 2};
    std::vector<int> result;

    std::set_intersection(s1.begin(), s1.end(),
                          s2.begin(), s2.end(),
                          std::back_inserter(result));
}
