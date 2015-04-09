;; solution to Nth Element
;; https://4clojure.com/problem/21

(fn [x i]
  (if (= i 0)
    (first x)
    (recur (rest x) (- i 1))))
