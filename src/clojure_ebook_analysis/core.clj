(ns clojure-ebook-analysis.core
    (:require [clojure.string :refer (lower-case)]))

(defn word-frequencies
  [words]
  (->> (re-seq #"[A-Za-z]+" words)
      (map lower-case)
      frequencies))
