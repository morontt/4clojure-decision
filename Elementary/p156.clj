;; solution to Map Defaults
;; https://4clojure.com/problem/156

(fn [d s]
  (reduce conj `{} (map #(vector % d) s)))
