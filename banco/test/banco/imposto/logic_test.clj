(ns banco.imposto.logic-test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :refer [imposto-retido-fonte]]))


;; Solicitação da cliente:
;; Valores abaixo de mil reais não têm imposto retido na fonte.
;; Acima disso, pagsm 10% de imposto.


(deftest imposto-retido-fonte-test
  (testing "Dado um valor abaixo de 1000 reais, então não deve ter imposto retido"
    (is (= 0 (imposto-retido-fonte 1)))
    (is (= 0 (imposto-retido-fonte 999.999))))
  (testing "Dado um valor igual ao superio a 1000 reais, então deve ter imposto retido de 10%"
    (is (= 100.00 (imposto-retido-fonte 1000)))))