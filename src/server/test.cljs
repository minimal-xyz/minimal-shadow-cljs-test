
(ns server.test
  (:require [cljs.test :refer-macros [deftest is testing run-tests]]))

(defn is-positive? [x]
  (not (neg? x)))

(deftest test-1
  (testing "1 is positive?" (is (= true (is-positive? 1)))))

(deftest test-0
  (testing "0 is positive?" (is (= false (is-positive? 0)))))

(defn reload! []
  (println "Code updated.")
  (run-tests))

(defn main! []
  (println "App loaded!")
  (run-tests))
