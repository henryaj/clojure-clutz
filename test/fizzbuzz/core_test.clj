(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-3-divisible-by-three
  (testing "3 is divisible by 3"
    (is (divisible-by-three? 3))))

(deftest is-5-divisible-by-three
  (testing "5 is not divisible by 3"
    (is (= false (divisible-by-three? 5)))))

(deftest is-5-divisible-by-five
  (testing "5 is divisible by 5"
    (is (divisible-by-five? 5))))

(deftest is-1-divisible-by-five
  (testing "1 is not divisible by 5"
    (is (= false (divisible-by-five? 1)))))

(deftest is-15-divisible-by-fifteen
  (testing "15 is divisible by 15"
    (is (= (divisible-by-five? 15) (divisible-by-three? 15)) )))

(deftest is-1-divisible-by-fifteen
  (testing "1 is divisible by 15"
    (is (= false (divisible-by-five? 1) (divisible-by-three? 1)) )))

(deftest is-x-divisible-by-y
  (testing "3 is divisible by 3"
    (is (divisible-by-number? 3 3))))

(deftest prints-fizz-when-divisible-by-3
  (testing "3 prints out Fizz"
    (is (= "Fizz" (fizzbuzz 3)))))

(deftest prints-buzz-when-divisible-by-5
  (testing "5 prints out Buzz"
    (is (= "Buzz" (fizzbuzz 5)))))

(deftest prints-fizzbuzz-when-divisible-by-15
  (testing "15 prints out FizzBuzz"
    (is (= "FizzBuzz" (fizzbuzz 15)))))

(deftest prints-number-otherwise
  (testing "7 prints out 7"
    (is (= 7 (fizzbuzz 7)))))

