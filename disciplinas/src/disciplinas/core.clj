(ns disciplinas.core
  (:require [clojure.string :refer [upper-case join]]))

;; DESAFIO: precisamos criar uma função que, dado um conjunto (vetor)
;; de disciplinas e o semestre da discente deve:
;; - filtrar a lista para exibir disciplinas restantes (que sejam do semestre atual ou superior)
;; - transformar o nome da disciplina para maiúscula e descartar demais informações
;; - criar uma string concatenando o nome de todas as disciplinas filtradas
;; Exemplo de entrada.:
;; [{:nome "Estrutura de dados" : semestre 2}
;;  {:nome Algoritmos :semestre 1}
;;  {:nome "Inteligência artificial" : semestre 3}] 2
;; Saída esperada: "ESTRUTURA DE DADOS" "INTELIGÊNCIA ARTIFICIAL"

(defn disciplinas
  []
  [{:nome "Estrutura de dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligência artificial" :semestre 3}])

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (join ", " (map upper-case (map :nome (filter #(>= (:semestre %) semestre-atual) disciplinas)))))

(nomes-disciplinas-restantes (disciplinas) 2)

;; (map :nome [{:nome "Estrutura de dados" :semestre 2} {:nome "Inteligência artificial" :semestre 3}])













