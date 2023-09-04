# Desafios DIO
## Repositório para compartilhar os desafios de código do Bootcamp: Desenvolvimento Java com Cloud AWS, da plataforma Digital Innovation One.

### Lista dos desafios realizados:

## 1.Validando a Força de Senha no IAM
Desafio
Você está trabalhando para uma empresa que utiliza extensivamente os serviços da AWS, e após algumas análises a equipe de segurança identificou que algumas senhas dos usuários no IAM são fracas e podem representar um risco à segurança dos dados da empresa. 
Para resolver esse problema, foi solicitado que você desenvolva um programa capaz de analisar as senhas dos usuários e fornecer uma validação de força com base em critérios predefinidos.

Requisitos de segurança para a senha:
A senha deve ter no mínimo 8 caracteres.
A senha deve conter pelo menos uma letra maiúscula (A-Z).
A senha deve conter pelo menos uma letra minúscula (a-z).
A senha deve conter pelo menos um número (0-9).
A senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.
Saiba mais sobre o Regex em: Java Regular Expressions

Entrada:
A entrada será uma única string representando a senha que precisa ser validada.

Saída:
Seu programa deve retornar uma mensagem indicando se a senha fornecida pelo usuário atende aos requisitos de segurança ou não, juntamente com um feedback explicativo sobre os critérios considerados.

## 2.Velocidade de Download na AWS
Desafio
Você foi contratado como desenvolvedor pela "DIOCloudTech Solutions", que é especializada em serviços em nuvem baseados na AWS. E sua tarefa será criar uma calculadora de velocidade de download que leve em consideração a localização geográfica do servidor de origem e do dispositivo do usuário. 
Quanto mais próximo o servidor, menor será a latência e, portanto, a velocidade de download será melhor. Isso permitirá que os usuários estimem a velocidade de download para diferentes locais e servidores AWS em todo o mundo.

Fórmula para Cálculo da Velocidade de Download (em Mbps): A velocidade de download estimada (VD) será dada pela fórmula:
VD = VelocidadePlano / (1 + (DistanciaServidores / 100))

Observação:
A velocidade de download estimada não pode exceder a velocidade do plano de internet contratado.

Entrada
O programa deve ser capaz de receber dois valores:
Distância física entre o servidor de origem e o dispositivo do usuário (em quilômetros).
Velocidade do plano de internet contratado pelo usuário (em Mbps).

Saída
A calculadora deve fornecer a estimativa da velocidade de download (em Mbps) com base na fórmula de cálculo que considera a distância física e a velocidade do plano de internet. 

## 3.Calculando Seus Custos na AWS
Descrição
você é um jovem engenheiro de software recém-contratado pela empresa "TechCloud". Sua equipe é responsável por desenvolver aplicativos e serviços que serão implantados na Amazon Web Services (AWS), a principal plataforma de computação em nuvem do mercado.
Sua primeira tarefa é desenvolver um programa simples em Java que auxilie os desenvolvedores a calcular os custos de execução de seus aplicativos na AWS. Para isso, você precisa coletar algumas informações e aplicar uma fórmula para determinar o custo total.

Aqui está como você pode realizar essa missão:

1. Defina as taxas:
O custo por hora de um servidor é de R$ 0,15.
O custo por hora de um banco de dados é de R$ 0,05

2. Coletando informações:
O programa deve solicitar ao usuário a quantidade de servidores e a quantidade de bancos de dados que o aplicativo necessita para funcionar corretamente.

3. Calcule os custos:
Multiplique a quantidade de servidores pelo custo por hora de um servidor e a quantidade de bancos de dados pelo custo por hora de um banco de dados. Some esses valores para obter o custo total.

4. Exiba o resultado:
Mostre ao usuário o custo total do uso da AWS para executar o aplicativo durante uma hora.

Entrada
O programa deverá receber duas entradas, a primeira será referente a quantidade de servidores necessários. A segunda entrada será referente a quantidade de banco de dados necessários.

Obs: Utilize a função Scanner para capturar as entradas do usuário.

Saída
A saída deverá retornar um texto informando o custo total de uso da AWS por hora. Veja exemplos abaixo.

## 4.Regras Para Dimensionamento de Infraestrutura com EKS
Descrição
Você é um engenheiro responsável por ajudar as equipes de desenvolvimento a calcular o número mínimo de nodes e servidores necessários para suportar seus aplicativos no cluster do EKS..

Regras Básicas:
Cada node pode suportar até 10 pods.
Cada servidor (EC2) pode suportar até 4 pods.
Seu objetivo é desenvolver um programa em Java que permita ao usuário fazer uma consulta de dimensionamento. O programa deve receber o número total de pods do aplicativo e calcular o número mínimo de nodes e servidores necessários com base nas regras de dimensionamento.

Aqui estão as etapas que você deve seguir:

1. Inicialização:
Defina as regras básicas de dimensionamento, ou seja, a capacidade de pods por node e pods por servidor.

2. Recebendo as informações:
Solicite ao usuário que digite o número total de pods do aplicativo (utilize a função Scanner).

3. Cálculo:
Calcule o número mínimo de nodes necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por node.
Calcule o número mínimo de servidores necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por servidor.

4. Recomendações:
Se o número mínimo de nodes for menor ou igual a 1, exiba a recomendação de usar um único node.
Se o número mínimo de servidores for menor ou igual a 1, exiba a recomendação de usar um único servidor.
 
Entrada
O programa solicitará ao usuário que digite o número total de pods do aplicativo que deseja implantar no cluster do EKS.
O usuário deverá inserir um número inteiro que represente o total de pods do aplicativo.

Saída
Para cada consulta de dimensionamento, o programa exibirá as seguintes informações:
O número mínimo de nodes necessário para suportar o número total de pods do aplicativo.
O número mínimo de servidores necessário para suportar o número total de pods do aplicativo.
Se o número mínimo de nodes for menor ou igual a 1, o programa exibirá a recomendação de usar um único node.
Se o número mínimo de servidores for menor ou igual a 1, o programa exibirá a recomendação de usar um único servidor.

## 5.Monitoramento e Análise de Logs AWS
Descrição
Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.

Entrada
Linha 1: A quantidade de logs a serem analisados;
Linhas Seguintes: Cada linha terá as informações de log de um determinado serviço AWS, no seguinte:
yyyy-MM-dd HH:mm:ss,{Nome do Serviço AWS},{Log do Evento Registrado Neste Serviço AWS}

Saída
O programa exibirá os resultados da análise, apresentando:

A quantidade de eventos específicos para cada log de serviço AWS lido na Entrada (em ordem de leitura):
Eventos por servico:
{Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}
{Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}
{Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}
O serviço AWS que teve a maior* quantidade de eventos registrados:
Maior:{Nome do Serviço AWS}
O serviço AWS que teve a menor* quantidade de eventos registrados:
Menor:{Nome do Serviço AWS}
* Tenha como verdade que sempre teremos um serviço com maior incidência e outro com menor, ou seja, nunca teríamos um empate. Veja exemplos abaixo.
