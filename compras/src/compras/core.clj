(ns compras.core)

;; Carrinho de compras
(defn compras
  []
  {:tomate {:quantidade 2 :preco 5}
   :arroz {:quantidade 1 :preco 4}
   :feijao {:quantidade 2 :preco 4}})

(compras)

(get (compras) :tomate)
((compras) :tomate)
(:tomate (compras))

(:preco (:tomate (compras)))

(:batata (compras) {:quantidade 0 :preco 0})

(conj (compras) {:alface {:quantidade 2 :preco 8}})

(assoc (compras) :alface {:quantidade 2 :preco 8})

(dissoc (compras) :tomate :arroz)

(assoc (compras) :tomate {:quantidade 3 :preco 5})

(update {:nome "Rayana" :idade 33} :idade inc)

(update-in (compras) [:tomate :preco] inc)

(update-in (compras) [:tomate :preco] * 2)




















