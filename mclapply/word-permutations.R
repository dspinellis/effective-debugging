#!/usr/bin/env Rscript
library(combinat)
library(parallel)

# Read in a file of English words
words <- readLines('/usr/share/dict/words')

# Obtain five letter words
flw <- words[nchar(words) == 5]

# Return words consisting of permutations of the passed word
word.permutations <- function(w) {
  # Obtain all character permutations
  p <- lapply(strsplit(w, NULL), permn)
  # Convert permutations to list of words
  r <- sapply(unlist(p, recursive=FALSE), paste, collapse="")
  # Remove permutations resulting in the original word
  new <- r[r != w]
  # Return the intersection of the two sets
  intersect(flw, new)
}

# Generate list of words that are permutations of others
p <- unlist(lapply(flw, word.permutations))
