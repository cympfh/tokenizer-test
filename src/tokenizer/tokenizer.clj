(ns tokenizer.tokenizer
    (:import [org.atilika.kuromoji Token Tokenizer])
    (:use [incanter core stats charts io])
    (:require [clojure.string :as str])
    )

(def noun? #(= % "名詞"))

(defn get-nouns [sentence]
  (let [^Tokenizer tokenizer (.build (Tokenizer/builder))
        tokens (.tokenize tokenizer sentence)]
    (for [^Token token tokens
          :when (some noun? (str/split (.getPartOfSpeech token) #","))]
      (.getSurfaceForm token))))


