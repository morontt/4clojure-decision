;; solution to Count a Sequence
;; https://4clojure.com/problem/22

(fn c-count
  ([s]
   (c-count (rest s) 1))
  ([s i]
   (if (empty? s)
     i
     (c-count (rest s) (+ 1 i)))))
