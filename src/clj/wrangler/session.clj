(ns wrangler.session
  (:require
    [clojure.data.csv :as csv]
    [clojure.string :as string]
    [clojure.java.io :as io]
    [semantic-csv.core :refer :all]
    ))


(normalize-int "5,000.00")

;; Read csv file
(def data (with-open [in-file (io/reader "resources/CIBCtest.csv")]
            (->>
              (csv/read-csv in-file)
              doall)))


;; Add header row and put into vector
(def data2 (into [["Date" "Description" "Debit" "Credit"]] data))

