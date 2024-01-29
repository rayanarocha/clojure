(ns tipos.core)

(defn soma
  [x y]
  (+ x y))

(defn imprime-soma
  []
  (println (soma 2 2)))

(type 10)
(type 10.0)
(type "Rayana")
(type true)
(type 'a')
(type [])
(type (/ 10 3))
(type (* 3 (/ 10 3)))
(type 10N)
(type 10M)
(type nil)
(type println)