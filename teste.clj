(defn imposto-retido
    [salario]
    (if (<= salario 1000)
        0
        (if (< salario 2000)
            ( * salario 0.1)
            (* salario 0.2))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn imposto-retido
    [salario]
    (let [imposto-primeira-faixa 0
          imposto-segunda-faixa 0.1
          imposto-terceira-faixa 0.2]
        (if (<= salario 1000)
            imposto-primeira-faixa
            (if (< salario 2000)
                (* salario imposto-segunda-faixa)
                (* salario imposto-terceira-faixa)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn imposto-retido
    [salario]
    (let [imposto-primeira-faixa 0
          imposto-segunda-faixa 0.1
          imposto-terceira-faixa 0.2
          salario-base 1000
          salario-topo 2000]
        (if (<= salario salario-base)
            imposto-primeira-faixa
            (if (< salario salario-topo)
                (* salario imposto-segunda-faixa)
                (* salario imposto-terceira-faixa)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn isento-de-imposto?
    [valor]
    (if (<= valor 1000)
        true
        false))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn isento-de-imposto?
    [valor]
    (if (<= valor 1000)
        true))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn isento-de-imposto?
    [valor]
    (if (<= valor 1000))