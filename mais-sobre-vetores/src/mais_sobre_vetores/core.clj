(ns mais-sobre-vetores.core)

(conj ["Batata" "Arroz" "Feijão"] "Banana")

(pop ["Batata" "Arroz" "Feijão"])

(defn desistir-ultima-compra
  [compras]
  (pop compras))

(desistir-ultima-compra ["Arroz" "Feijão" "Banana"])

(conj [] "Banana")

(conj nil "Banana")

(conj () "Banana")

(conj (conj nil "Banana") "Arroz")

(conj [1 2 3] nil)

(pop ["Banana"])

(pop nil)

(defn imprime-primeiro-nome
  [nomes]
  (println (get nomes 0)))

(imprime-primeiro-nome ["Dakota" "Piatã"])

(defn obtem-terceiro-nome
  [nomes]
  (println (get nomes 2 "Desconhecida")))

(obtem-terceiro-nome ["Dakota" "Piatã" "Mel"])

(obtem-terceiro-nome nil)

(obtem-terceiro-nome ["Dakota" "Piatã"])

(defn substituir-primeiro-nome
  [nomes novo-primeiro-nome]
  (assoc nomes 0 novo-primeiro-nome))

(substituir-primeiro-nome ["Dakota" "Piatã" "Mel"] "Peppinha")