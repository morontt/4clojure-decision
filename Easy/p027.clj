;; solution to Palindrome Detector
;; https://4clojure.com/problem/27

(fn polynd? [s]
  (if (empty? s)
    true
    (if (= (first s) (last s))
      (polynd? (rest (reverse (rest s))))
      false)))
