;; solution to Reverse a Sequence
;; https://4clojure.com/problem/23

(fn [s] (reduce #(cons %2 %1) (empty s) s))
