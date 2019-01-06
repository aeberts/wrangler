(ns wrangler.helpers
  (:require [clojure.string :as str]
            [clojure.test :refer :all]))

(defn normalize-float
  "Convert strings with decimal places to numbers"
  [s]
  (let [v (str/split s #"[,.]")
        [pre post] (split-at (dec (count v)) v)]
    (Double/parseDouble (apply str (concat pre [\.] post)))))

(defn normalize-int
  "Convert strings without decimal places to numbers"
  [s]
  (let [v (str/split s #"[,]")
        [pre post] (split-at (dec (count v)) v)]
    (Double/parseDouble (apply str (concat pre post)))))