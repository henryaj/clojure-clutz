(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divisible-by-three? [number] 
  (zero? (mod number 3)))

(defn divisible-by-five? [number]
  (zero? (mod number 5)))

(defn divisible-by-number? [number, divisor]
  (zero? (mod number divisor)))

; (defn fizzbuzz [number]
;   (if (divisible-by-three? number) "Fizz" (
;     if (divisible-by-five? number) "Buzz"
;     number)))

(defn fizzbuzz [number]
  (cond
    (and (divisible-by-three? number)
         (divisible-by-five? number)) "FizzBuzz"
    (divisible-by-three? number) "Fizz"
    (divisible-by-five? number) "Buzz"
    :else number))