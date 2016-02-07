# GCC options
CXXFLAGS=-g -D_GLIBCXX_DEBUG -std=c++11

# Microsoft Visual Studio C options
ifdef MSVC
CXXFLAGS=/EHsc /MDd
CXX=cl
endif

ifdef CLANG
CXX=clang++
CXXFLAGS=-g -D_GLIBCXX_DEBUG -std=c++11 -stdlib=libstdc++
endif

demo: access intersection
	-./access
	-./intersection

access: access.cpp

intersection: intersection.cpp

clean:
	rm -f access intersection
