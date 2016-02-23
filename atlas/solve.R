#!/usr/bin/env Rscript

# Matrix size
n <- 10000

# Create a square matrix of random numbers
m <- replicate(n, rnorm(n))

# Calculate the matrix inverse
r <- solve(m)
