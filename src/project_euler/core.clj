(ns project-euler.core)

(defn format-solution
  "Format solution with time taken."
  [n solution]
  (println (format "The solution to problem %d => %15d" n solution)))

; problem 69 helpers
(defn gcd [a b] (if (zero? (* a b)) (+ a b) (gcd b (mod a b))))
(defn relatively-prime? [a b] (= 1 (gcd a b)))
(defn phi [a] (count (filter (partial relatively-prime? a) (range a))))

; problem 42 helpers
(defn triangle-number [n] (* (/ n 2) (+ n 1)))
(def triangle-numbers (set (map triangle-number (range 1 30))))
(defn letter-index[l] (- (int l) 96))
(defn score [word] (reduce #(+ %1 (letter-index %2)) 0 word))
(defn triangle-word? [word] (contains? triangle-numbers (score word)))

; problem 4 helpers
(defn palindrome? [num] (= (reverse (str num)) (reverse (reverse (str num)))))

; problem 72 helpers
(defn reduced-proper-fraction? [n d] (and (< n d) (= 1 (gcd n d))))
