(ns clojure-ebook-analysis.core)

(defn word-frequencies
  [words]
  (-> (.split words " ")
      frequencies))
