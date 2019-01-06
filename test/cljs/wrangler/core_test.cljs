(ns wrangler.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [wrangler.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))