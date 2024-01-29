(ns funcoes-primeira-ordem.core)

(defn imposto-retido
  "Se salario abaixo de 1000 reais, não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
  [salario]
  (let [imposto-padrao 0.2]
    (if (< salario 1000)
      0
      (* salario imposto-padrao))))

(imposto-retido 1000)

(defn consulta-taxa-padrao-por-http
  "Imagine que este código faz requisisção http para obter o taxa padrão."
  []
  0.30)

(defn consulta-taxa-padrao-fixa
  []
  0.10)

(defn imposto-retido
  "Se salario abaixo de 1000 reais, não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
  [taxa-padrao salario]
  (if (< salario 1000)
     0
     (* salario taxa-padrao)))

(imposto-retido (consulta-taxa-padrao-por-http) 1000)

(defn imposto-retido
  "Se salario abaixo de 1000 reais, não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
  [consulta-taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario (consulta-taxa-padrao))))

(imposto-retido consulta-taxa-padrao-por-http 1)


(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao-fixa
    consulta-taxa-padrao-por-http))

(imposto-retido (escolhe-consulta-taxa-padrao :producao) 1000)

((fn [x] (* 2 x)) 2)

(#(* 2 %) 5)

(#(+ % %) 2 )

(#(+ %1 %2) 8 9)

((constantly 0.2) 1)

(imposto-retido (fn [] 0.7) 3000)






















































