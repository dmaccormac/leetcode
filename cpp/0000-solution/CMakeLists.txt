# Set the minimum version of CMake that can be used
cmake_minimum_required(VERSION 3.5)

# Set the project name
project (app)

# Set C++ standard
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

# Bring the headers into the project
# include_directories(include)

# Add sources using wilcard
file(GLOB SOURCES "src/*.cpp")

# Add an executable
add_executable(${PROJECT_NAME} ${SOURCES})