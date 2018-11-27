(ns project-euler.core)

(defn format-solution
  "Format solution with time taken."
  [n solution]
  (println (format "The solution to probelm %d => %15d" n solution)))
