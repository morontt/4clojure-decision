;; solution to A nil key
;; https://4clojure.com/problem/134

(fn [k m]
  (if (contains? m k)
    (nil? (k m))
    false))
