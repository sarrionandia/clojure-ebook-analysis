(ns clojure-ebook-analysis.core
    (:require [clojure.string :refer (lower-case)]))

(defn word-frequencies
  [words]
  (->> (re-seq #"[A-Za-z]+" words)
      (map lower-case)
      frequencies))

(defn to-ratios
  [[x & xs]]
  (concat [1] (map #(/ % x) xs)))

(defn zipfify
  [freqs]
  (->> (vals freqs)
       sort
       reverse
       to-ratios))

