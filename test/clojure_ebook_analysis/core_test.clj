(ns clojure-ebook-analysis.core-test
  (:require [clojure.test :refer :all]
            [clojure-ebook-analysis.core :refer :all]))

(deftest word-frequencies-test
  (testing "A simple sentence"
    (let [input "a simple sentence is simple to read"
          output (word-frequencies input)]
      (is (= output {"a" 1, "sentence" 1, "simple" 2, "is" 1, "to" 1, "read" 1})))))

