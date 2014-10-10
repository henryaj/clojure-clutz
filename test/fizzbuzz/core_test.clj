(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
  (testing "3 is divisible by 3"
    (is (divisible-by-three? 3))))

(deftest is-divisible-by-three
  (testing "5 is not divisible by 3"
    (is (= false (divisible-by-three? 5)))))

(deftest is-divisible-by-five
  (testing "5 is divisible by 5"
    (is (divisible-by-five? 5))))

(deftest is-divisible-by-five
  (testing "1 is not divisible by 5"
    (is (= false (divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
  (testing "15 is divisible by 15"
    (is (= (divisible-by-five? 15) (divisible-by-three? 15)) )))

(deftest is-divisible-by-fifteen
  (testing "1 is divisible by 15"
    (is (= false (divisible-by-five? 1) (divisible-by-three? 1)) )))