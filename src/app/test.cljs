
(ns app.test
  (:require [cljs.test :refer [deftest is testing run-tests]]
            [app.lib :refer [is-positive?]]))

(deftest test-1
  (testing "1 is positive?" (is (= true (is-positive? 1)))))

(deftest test-0
  (testing "0 is positive?" (is (= false (is-positive? 0)))))

(deftest test-failure
  (testing "Failure on purpose..." (is (= true (is-positive? -1000)))))

