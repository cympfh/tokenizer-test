(ns tokenizer.counter)

(defn word-count
  ":: [word] -> {word Int}"
  [words]
  (reduce (fn [acc w]
            (assoc acc w (inc (get acc w 0))))
         {}
         words))

(defn sort-count [coll]
  (reverse (sort-by second coll)))

