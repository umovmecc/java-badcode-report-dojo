# Bad Code - Relatório

## Primeiro momento
Possuímos uma impressão do relatório de pessoas e alguns ajustes foram detectados
nesse primeiro momento para atender algumas demandas dos nossos cliente. 
Abaixo foram listados o cenários de melhoria da nossa impressão do Relatório de Pessoas.

* Cenário 1: Corrigir erro na impressão do relatório de pessoas. Está aparecendo "ll"<br>
``Dado que seja realizado uma impressão de relatório<br> 
Quando o relatório for impresso<br>
Então não deve aparecer 'll'``<br>

* Cenário 2: Telefone com menos de 10 dígitos
Dado que seja realizado uma impressão de relatório 
 E a pessoa tenha telefone celular 
Quando for imprimir os dados da pessoa 
 E o números de dígitos do telefone é diferente de 10 dígitos
Então deve dar a mensagem "Telefone invalido!"
 E não deve imprimir a pessoa no relatório

* Cenário 3: Telefone com 10 dígitos
Dado que seja realizado uma impressão de relatório 
 E a pessoa tenha telefone celular 
Quando for imprimir os dados da pessoa 
 E o telefone tem 10 dígitos
Então deve ser possível imprimir a pessoa no relatório
 
* Cenário 4: Introduzir validação a CPF invalido
Dado que seja realizado uma impressão de relatório
 E a pessoa tenha um CPF
Quando for imprimir os dados da pessoa 
 E o CPF é invalido
Então deve dar a mensagem "CPF invalido!"
 E não deve imprimir a pessoa no relatório
 
* Cenário 5: Introduzir validação a CPF valido
Dado que seja realizado uma impressão de relatório
 E a pessoa tenha um CPF
Quando for imprimir os dados da pessoa 
 E o CPF é valido
Então deve ser possível imprimir a pessoa no relatório

* Cenário 6: Formato de impressão 
Dado que seja realizado uma impressão de relatório 
 E a pessoa tenha telefone celular valido
 E a pessoa tenha um CPF valido
Quando for imprimir os dados da pessoa 
Então o formado de impressão deve ser:
Nome: Fulano da Silva
Fone: XXXXXXXXX
CPF: XXXXXXXXXXX

## Segundo momento
* Com base nas necessidadee regras de negócio existentes, reeescreva do zero a aplicação
* Cadastrar Pessoas com as seguintes informações (nome, sobrenome, telefone residencial, telefone celular, cpf)
* Validar as seguintes informações(CPF - telefone celular com mínimo de 10 digitos, nome)


