(ns filter-map-reduce.core)

;; Imagine que tenhaso um vetor de úmeros onde cada número representa o
;; ano que o estudante está.
;; Exemplo: [5 6 6] ; Temos 1 estudante do quinto ano e dois no sexto.

;; DESAIO 1: Crie ua função que recebe este vetor como entrada e retorna a
;; quantidade de estudantes que estão no quinto ano.

;; [5 5 6 7 8 6 5 5 ] -> ... -> 4

(defn quantidade-estudantes-no-quinto-ano
  [estudantes]
  (count(filter #(= 5 %) estudantes)))

(quantidade-estudantes-no-quinto-ano [5 6 7 5])

;; DESAFIO 2: Crie uma função que recebe um vetor de idades e retorna a soma.
;; Ex.: (soma-das-idades [5 10 5]) ; deve retornar 20.

(defn soma-das-idades
  [idades]
  (reduce + idades))

(soma-das-idades [5 10 5])

;; DESAFIO 3: crie uma função que recebe um vetor de nomes e retorne o tamanho médios dos nomes.
;; Ex.: (tamanho-medio-dos-nomes ["Márcio" "João"]) ; deve retornar 5

(defn tamanho-medio-dos-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(tamanho-medio-dos-nomes ["Dakota" "Tonton"])

;; DESAFIO FINAL: Crie uma função que recebe um vetor de nomes e retorne o tamanho médios dos nomes,
;; mas deve-se ignorar nomes com 3 ou menos caracteres.

(defn tamanho-medio-nomes-com-mais-de-tres-caracteres
  [nomes]
  (if (< count nomes 3)
    (/ (reduce + (map count nomes)) (count nomes)))

  (tamanho-medio-dos-nomes ["Dakota" "Tonton" "A"]))













