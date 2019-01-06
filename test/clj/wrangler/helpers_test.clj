(ns wrangler.helpers-test
  (:require [clojure.test :refer [deftest is]]
            [wrangler.helpers :as h]))

(deftest normalize-int-test
  (is (= 5000.0 (h/normalize-int "5000")))
  (is (= 5000.0 (h/normalize-int "5000.00")))
  (is (= 5000.0 (h/normalize-int "5,000")))
  (is (= 5000.0 (h/normalize-int "5,000.00")))
  )