# Desafio: Abreviando post do blog
>Fonte: https://web.digitalinnovation.one/

Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experiências e aprendizados com seus amigos.

Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.

## Entrada
Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado.

## Saída
Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas em ordem crescente da letra inicial.



|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|abcdef abc abc abc<br>.|a. abc abc abc<br>1<br>a. = abcdef|
                    

---
# Desafio: Conjunto bom ou Ruim 
>Fonte: https://web.digitalinnovation.one/

Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário, é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde. Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

## Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

## Saída
Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima.

|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|3<br>abc<br>dae<br>abcde<br>2<br>abc<br>def<br>0<br>|Conjunto Ruim<br>Conjunto Bom|
 
---
# Desafio: Encontrando a maior substring
>Fonte: https://web.digitalinnovation.one/

Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

## Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

## Saída
O tamanho da maior subsequência comum entre as duas Strings.

|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|abcdef<br>cdofhij<br>TWO<br>FOUR<br>abracadabra<br>open<br>Hey This java is hot<br>Java is a new paradigm<br>|2<br>1<br>0<br>7<br>|

---
# Desafio: Entrevista embaraçosa
>Fonte: https://web.digitalinnovation.one/

A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

## Entrada
Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim de arquivo.

## Saída
Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.

|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|sanduicheiche<br>barrilarril<br>ratoato<br>sol<br>coliseueu<br>queijoijo<br>astroastro<br>a<br>|sanduiche<br>barril<br>rato<br>sol<br>coliseu<br>queijo<br>astro<br>a<br>|

---
# Desafio: Validador de senhas com requisitos
>Fonte: https://web.digitalinnovation.one/

Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.

## Entrada
A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

## Saída
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.


|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|Digital Innovation One<br>AbcdEfgh99<br>DigitalInnovationOne123<br>Digital Innovation One 123<br>Aass9<br>Aassd9<br>|Senha invalida.<br>Senha valida.<br>Senha valida.<br>Senha invalida.<br>Senha invalida.<br>Senha valida.<br>|

# Desafio: Divisores
>Fonte: https://web.digitalinnovation.one/

Pense um número positivo n. Agora me diga um divisor A de n. Agora me dê um outro número B que não seja divisor de n. Agora um múltiplo C. E um não múltiplo D. O número que você pensou é...

Parece um truque de mágica, mas é matemática! Será que, conhecendo os números A, B, C e D, você consegue descobrir qual era o número original n? Note que pode existir mais de uma solução!

Neste problema, dados os valores de A, B, C e D, você deve escrever um programa que determine qual o menor número n que pode ter sido pensado ou concluir que não existe um valor possível.

## Entrada
A entrada consiste de uma única linha que contém quatro números inteiros A, B, C, e D, como descrito acima (1 ≤ A, B, C, D ≤ 109).

## Saída
Seu programa deve produzir uma única linha. Caso exista pelo menos um número n para os quais A, B, C e D façam sentido, a linha deve conter o menor n possível. Caso contrário, a linha deve conter -1.

|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|2 12 8 2|4|
|3 4 60 105|6|
|2 40 90 25|2|

# Desafio: Análise de números
>Fonte: https://web.digitalinnovation.one/

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

## Entrada
Você receberá 5 valores inteiros.

## Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|-5<br>0<br>-3<br>-4<br>12<br>|3 valor(es) par(es)<br>2 valor(es) impar(es)<br>1 valor(es) positivo(s)<br>3 valor(es) negativo(s)|

# Desafio: Contagem repetida de números
>Fonte: https://web.digitalinnovation.one/

Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

## Entrada
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

## Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.

|Exemplo de Entrada|Exemplo de Saída|
| ---------------- | -------------- |
|7<br>8<br>10<br>8<br>260<br>4<br>10<br>10|4 aparece 1 vez(es)<br>8 aparece 2 vez(es)<br>10 aparece 3 vez(es)<br>260 aparece 1 vez(es)|
