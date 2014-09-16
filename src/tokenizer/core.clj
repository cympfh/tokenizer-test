(ns tokenizer.core (:gen-class))

(require '[tokenizer.counter :as counter])
(require '[tokenizer.text :as text])
(require '[tokenizer.tokenizer :as tokenizer])

(defn -main [& args]
  (let [list (counter/sort-count (counter/word-count (tokenizer/get-nouns (text/sample))))]
    (print list)))
