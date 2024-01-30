# Repositório de estudo sobre a linguagem Clojure com ênfase em Paradigma Funcional

<img align="center" alt="Rayo-Clojure" height="100" width="150" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/clojure/clojure-original.svg"/>

## Sobre Clojure

Clojure é um `dialeto` da linguagem de programação Lisp, multiparadigma, porém com ênfase no paradigma funcional. Mas então o que seria `dialeto de uma linguagem de programação`?

Primeiro temos que entender a diferença entre `Dialeto` e `Implementação`.

### Dialeto

Como Lisp não é um "produto" como Python, Java, C#, por exemplo. Lisp não é uma “linguagem pronta” única, controlada e distribuída de forma centralizada por uma empresa, pessoa, associação ou organização.

Cada dialeto é definido apenas por seu padrão, um documento escrito com a especificação detalhada do dialeto:

- Common Lisp Standard: o padrão oficial é vendido no site do ANSI, apenas em formato PDF (com formatação não tão agradável de leitura). Como a versão oficial em PDF não é distribuída gratuita e livremente, existe uma versão HTML que é considerado “o” padrão atual (principalmente por ser online): o Common Lisp HyperSpec.
- Scheme Standard: o padrão oficial é vendido no site do IEEE, também em formato PDF, mas existem diversas atualizações e novos padrões disponíveis na internet.

Não existe um “dono” ou um “produto” Lisp… o que existem são dialetos definidos por seus padrões e, assim, qualquer pessoa, instituição ou empresa pode ler os padrões e implementar a sua própria versão da linguagem (o dialeto). 

Ou seja, podemos entender que os `dialetos` são famílias de padrões da linguagem Lisp. Sendo assim, Clojure é um dialeto da linguagem Lisp

### Implementação

A `implementação` seria um tipo de contrato que define o padrão em que a pessoa que está implementando vai seguir.

Por exemplo, se você escrever um programa que utiliza apenas as características definidas no padrão, seu programa funcionará da mesma maneira em qualquer implementação que seja conforme ao padrão.

As implementações da Common Lisp e da Scheme geralmente implementam tudo o que está definido em seus respectivos padrões e, além disso, acrescentam várias outras funcionalidades. Você pode então decidir usar somente as características padronizadas do dialeto, para maximizar a portabilidade entre diferentes implementações, ou decidir por utilizar funcionalidades específicas de uma determinada implementação (facilitando o desenvolvimento ao custo de uma menor portabilidade).

Na imagem a seguir, podemos ver a linha do tempo da evolução dos `dialetos` e `implementações` da linguagem Lisp.

<img align="center" alt="timeline" height="800" width="850" src="https://github.com/rayanarocha/clojure/blob/main/EuLisp.png"/>

### Referências
- https://www.abrantes.pro.br/2021/03/17/o-que-e-lisp-dialetos-e-implementacoes/
- https://imasters.com.br/desenvolvimento/historia-lisp-abra-os-olhos-para-programacao-funcional
