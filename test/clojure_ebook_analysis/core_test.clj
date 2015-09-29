(ns clojure-ebook-analysis.core-test
  (:require [clojure.test :refer :all]
            [clojure-ebook-analysis.core :refer :all]))

(deftest word-frequencies-test
  (testing "A simple sentence"
    (let [input "a simple sentence is simple to read"
          output (word-frequencies input)]
      (is (= output {"a" 1, "sentence" 1, "simple" 2, "is" 1, "to" 1, "read" 1}))))
  (testing "A sentence with capitals"
    (let [input "a simple sentence is Simple to read"
          output (word-frequencies input)]
      (is (= output {"a" 1, "sentence" 1, "simple" 2, "is" 1, "to" 1, "read" 1}))))
  (testing "A sentence with punctuation"
    (let [input "This, which you can tell, is a really long sentence. But this one is shorter!1?"
          output (word-frequencies input)]
      (is (= output 
             {"tell" 1,
             "which" 1,
             "this" 2,
             "long" 1,
             "is" 2,
             "you" 1,
             "shorter" 1,
             "can" 1,
             "a" 1,
             "but" 1,
             "one" 1,
             "really" 1,
             "sentence" 1}
             ))))
  )

