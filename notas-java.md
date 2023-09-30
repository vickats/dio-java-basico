# Linguagem Java

[Fonte](https://glysns.gitbook.io/java-basico/)

## História

Interessada em dispositivos eletrônicos inteligentes, a Sun Microsystems financiou uma pesquisa interna com o codinome Green em 1991. O projeto resultou no desenvolvimento de uma linguagem baseada em C e C++ que seu criador, James Gosling, chamou de Oak (carvalho) em homanagem a uma árvore que dava para a janela do seu escritório na Sun. Descobriu-se mais tarde que já havia uma linagugem de computador chamada Oak. Quando uma equipe da Sun visitou uma cafeteria local, o nome Java (cidade de origem de um tipo de café importado) foi sugerido e pagou.

## Fundamentos Básicos

Hoje pertencente a Oracle, é composta por um conjunto bem definido de funcionalidades (features), é uma linguagem simples e fácil de entender, pois não contém complexidades que existiam em linguagens de programação anteriores. Na verdade, a simplicidade era o objetivo do design dos povos Javasoft, porque ele tem que funcionar em dispositivos eletrônicos onde menos memória/recursos estão disponíveis.

## Orientada a Objetos

Java é uma linguagem de Programação Orientada a Objetos. Isso significc que em Java tudo é escrito em termos **CLASSES** e **OBJETOS**.

Para começar a desenvolver softwares de forma consistente com Java, é necessário compreender pilares da Programação Orientada a Objetos (POO). Eles são:

1. Classe e Objeto
2. Encapsulamento
3. Abstração
4. Herança
5. Polimorfismo

## Plataforma Independente

O objetivo de design do javasoft people é desenvolver uma linguagem que funcione em qualquer plataforma. Uma plataforma é o ambiente de hardware ou software no qual um programa é executado.

Em Java, o código-fonte Java é compilado para bytecode e esse bytecode não está vinculado a nenhuma plataforma (Windows, Linux, app mobile, microondas...).

## Portátil

O conceito WORA (Write Once Run Anywhere) e o recurso independente de plataforma tornam o Java portátil. Agora, usando a linguagem de programação Java, os desenvolvedores podem obter o mesmo resultado em qualquer máquina, escrevendo o código apenas uma vez. A razão por trás disso é JVM e bytecode

## Robusta

A linguagem de programação Java é robusta, o que significa que é capaz de lidar com o encerramento inesperado de um programa.

- Ele usa um gerenciamento de memória forte
- Java fornece coleta de lixo automática
- Há tratamento de exceção e mecanismo de verificação de tipo em Java

## Segura

Problemas como ameaças de vírus, adulteração, espionagem ou representação podem ser tratrados ou minimizados usando Java. E nossa construção de aplicativo usando Java também precisa de algum tipo de segurança. Por isso, a linguagem também fornece recursos de segurança para os programadores. Também existem Recursos de criptografia e decriptografia para proteger seus dados contra espionagem e adulteração na Internet

## Interpretada

Nas linguagens de programação, você aprendeu que eles usam o compilador ou o interpretador, mas a linguagem de programação Java usa os dois. O sprogramas Java são compilados para gerar arquivos de bytecode e a JVM (Java Virtual Machine) interpreta o arquivo de bytecode durante a execução.

## Multi-thread

Thread é um subprocesso leve e independente de um programa em execução (ou seja, processo) que compartilha recursos. Multi-threading é o nomde dado ao processo de vários threads sendo executados simultaneamente.

## Características das versões

| Versão         | Data           | Recurso                                                                                                                                                                                                                                                                                                                                                |
| -------------- | -------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| JDK 1.0        | 23/01/1996     | É a primeira versão sendo hoje usada para compatbilidade de browsers mais antigos (Java Development Kit)                                                                                                                                                                                                                                               |
| JDK 1.1        | 19/02/1997     | Obteve muitas bibliotecas adicionadas das quais se destacaram o Java RMI, JavaBeans, novo modelo de eventos, JDBC driver para cnexão com banco de dados                                                                                                                                                                                                |
| J2SE 1.2       | 08/12/1998     | Obteve um grande aumento das classes na biblioteca Java (API)                                                                                                                                                                                                                                                                                          |
| J2SE 1.3       | 08/05/2000     | Foram incluidas as bibliotecas JNDI, JavaSound entre outros.                                                                                                                                                                                                                                                                                           |
| J2SE 1.4       | 06/02/2002     | Foi criada a palavra reservada "assert", bilbioteca NIO, entre outros                                                                                                                                                                                                                                                                                  |
| **J2SE 5.0**   | **30/09/2004** | **Intordução dos Generics, Enumeração, Autoboxing, for-eac, entre outros**                                                                                                                                                                                                                                                                             |
| JAVA SE 6      | 11/12/2006     | Obteve uma meçhora significativa na performance e na estabilidade tendo o surgmento do JIT                                                                                                                                                                                                                                                             |
| JAVA SE 7      | 28/07/2011     | Obteve alguns aperfeiçoamentos como Suporte ao uso de strings em condições switch, Interferência na criação de objetos com tipos genéricos, Simplificação na inovação de métodos com parâmetros com varargs e tipos genéricos, entre outros.                                                                                                           |
| **JAVA SE 8**  | **18/03/2014** | **Teve várias criações como as expressões Lambdas; foreach, COnsumaer e interfaces no java.util.functions; Default methods; Method references**                                                                                                                                                                                                        |
| JAVA SE 9      | 21/09/2017     | Uma das novidades dessa versão são os factory mnethods para coleções                                                                                                                                                                                                                                                                                   |
| JAVA SE 10     | 20/03/2018     | Dentre as novidades estão a nova API para criação de coleções imutáveis e a nova forma de se declarar variáveis locais                                                                                                                                                                                                                                 |
| JAVA SE 11     | 25/09/2018     | Novidades com métodos para ler e escrever strings em arquivos: readString(), writeString(). Alguns métodos foram adicionados no tocante a manipulação de cordas como o repeat, strip, stripLeading, stripTrailing, lines e isBlank e a utilização de variáveis por inferência                                                                          |
| JAVA SE 12     | 19/03/2019     | Expressão Switch melhorada e método String indent e transform                                                                                                                                                                                                                                                                                          |
| JAVA SE 13     | 17/09/2019     | O Java 13 trouxe dois novos recursos de linguagem, embora no modo de visualização. Usando yield, agora podemos efetivamente retornar valores de uma expressão switch. O segundo recurso de visualização são os blocos de texto para Strings de várias linhas, omo JSON, XML, HTML, etc                                                                 |
| JAVA SE 14     | 17/03/2020     | Dentre os perfeiçoamentos ocorridos nessa versão podemos destacar: Helpful NullPointerException nessa versão o Java 14 nos permite sabermos quem causou e a conseguqência, Records (Preiew) criado pela Oracle para reduzir a verbosidade, Switch Expression tornou a sintaxe do switch mais fácil e simples, deixando o código mais limpo e agradável |
| JAVA SE 15     | 09/2020        | Oferece ao desenvolvedor 14 aprimoramentos/alterações, incluindo um módulo de incubadora. três recursos de visualização, dois recursos obsoletos e duas remoções. Algumas mudanças servem para reduzir o tamanho e o escopo do JDK através da Depreciação, que é uma técnica para transmitir informações sobre o ciclo de vida de uma API              |
| JAVA SE 16     | 03/2021        | Foram acrescentados muitos recursos para melhorar a performance, consumo de memória e uso da linguagem. Alguns dos novos recursos incluem mundaças no ZGC, suporte a versão 14 do C++ para evolução da JDK e JVM, capacidade elástica do metaspace, novas APIs e ferramentas.                                                                          |
| JAVA SE 17 LTS | 09/2021        | Entre os novos recursos estão o suporte a filtros de desserialização específicos do contexto, que é um aprimoramento de segurança e uma visualização de correspondência de padrões para instruções                                                                                                                                                     |

## Escolha a sua IDE

Para aumentar nossa produtividade, nós podemos escolher algumas ferramentas denominadas de IDE - Integrated Development Environment ou Ambiente de Desenvolvimento Integrado. É um software que dispõe de recursos que auxiliam muito nosso desenvolvimento como:

- Aceleração de nossa escrita com **Auto-complete** ou **IntelliSense**
- Formatação de plavras e blocos de códigos
- Análise de erro de sintaxe
- Compilação de programa
- Depuração (acompanhamento) de execução do programa

Cada IDE dispõe de recursos comuns ou plugins específicos para te auxiliar na agilidade de desenvolvimento.

- Visual Studio Code

  Desenvolvido pela MS, é um editor de texto muit simples e interativo que conta com inúmeras extensões, temas variados e integração com tecnologias como NodeJS e Java.

  Comparando-se em performance, o VS Code demosntra um grande desempenho de incialização, codificação e execução dos programas desenvolvidos.

  Hoje mais utilizada por desenvolvedores que já atuam com NodeJS ou plataformas de front-end.

- Apache NetBeans IDE

  Utilizada mais em ambiente acadêmico e com versão de menu e assistentes em português.

- Eclipse

  O Eclipse é uma alternativa muita comum de encontrar ambientes de desenvolvimento, pincipalmente pelo aspecto de uma interface simples, plugins para recusos adicionais, atalhos para operações de menu e de escrita e para quem trabalha com Java Swing você pode adicionar o plugin WindowBuilder que dispõe de uma interface gráfica para criar as telas gerando o código de layout para o desenvolvedor.

  Mais utilizada no ambiente corporativo com interface bem interativa.

- IntelliJ IDE

  É uma plataforma de código aberto para criação de IDEs e ferramentas para desenvolvedores, mas nem todos os recursos estão disponíveis de forma gratuita.

  Mesmo com a proposta de ser inteligente, talvez em primeiro contato, é difícil já desfrutar de todos os recursos, fazendo com que você opte por mudar ou voltar para uma IDE como o Eclipse. Claro que não podemos deixar de destacar que muitas coisas a gente não precisa se preocupar como: Salvar arquivo, encode padrão UTF-8 e sugestões que vão surgindo ao longo da nossa interação com a ferramenta.

  Oferece muito recursos de inteligência para agilidade de nosso desenvolvimento com sugestões de ações bem assertivas.

## First Steps

1. Entender o que são workspaces dentro da configuração da IDE
2. Definir / configurar a JDK na IDE
3. Criar / abrir um projeto Java
4. Criar / importar um projeto Maven

   - Maven é uma ferramenta de automação de compilação utilizada primariamente em projetos Java, mas hoje também é utilizada para construir e gerenciar projetos escritos em C#, Ruby, Scala e outras linguagens

5. Conhecer os principais atalhos

   - Todas as IDEs possuem combinações de comandos que são facilitadores para criação de arquvio, digitação de códigos, localização e execução das classes em nosso programa, além de comandos já pré-definidos de linhas de código (code snippet)

     | Comando                             | Eclipse                    | IntelliJ         |
     | ----------------------------------- | -------------------------- | ---------------- |
     | Cria o método principal main        | main, ctrl + espaço, enter | psvm             |
     | Localiza recurso / arquivo          | ctrl + shift + R           | ctrl + shift + N |
     | Método de impressão no console      | sysout, ctrl + espaço      | sout             |
     | Localizar a utilização de um método | ctrl + shift + G           | alt + F7         |
     | Entrar na implementação do método   | ctrl + click               | ctrl + click     |

6. Code Snippet

   - Em uma tradução livre, seria algo como "retalhos de código", sõa pedaços de código pré-fabricados e para parametrizáveis que podemos inserir em nossa aplicação.

7. Executar / Depurar nosso programa

## Configurando o ambiente

Para começar, é necessário que tenhamos o JDK instalado.

- É extremamente relevante determinar a versão do Java que precisa utilizar diante de alguns requisitos do projeto.

### Instalando o JDK no Windows

- Algumas IDEs como o VS Code já conseguem baixar e instalar o JDK e realizar a configuração de forma fácil

- Busque no Google por _Java JDK xxx (versão desejada)_

- Selecione a opção **.exe** de acordo com o seu SO

## Sintaxe Java

### Anatomia das classes

Feita através de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome de arquivos, classes,a tributos e métodos, sendo comum mesclar expressões do idioma americano com o nosso vocabulário. Uma boa prática é que toda implementação do programa seja escrita na língua inglesa.

Sintaxe de declaração de uma nova classe:

    public class MinhaClass {
      // SEU CÓDIGO AQUI
    }

- QUASE todas as classes iniciarão com `public class`

  Após o nome, definir o corpo { } , onde iremos compor nossas classes com atributos e métodos:

        public class MinhaClass {
          // CORPO DA CLASSE

          public static void main(String [] args){
            // CORPO DO MÉTODO
          }
        }

- Dentro de uma aplicação, recomenda-se que somente uma classe possua o método `main`, responsável por iniciar todo o nosso programa.
- Toda classe executável (que inicializa o programa) precisam ter um método principal => `main`, seguindo um padrão.
- O método `main` recebe seu nome main, sempre terá a visibilidade `public`, será difinido como `static`, não retornará nenhum valor com `void` e receberá um parâmetro do tipo array de caracteres `String[]`.

#### Padrão de nomenclatura

- Arquivo.java: Todo arquivo .java deve começar com letra MAIÚSCULA. Se for composta, a segunda palavra deve também ser maiúscula:

  `Calculadora.java`
  `CalculadoraCientifica.java`

- Nome da classe no arquivo: a clase deve ter o mesmo nome do arquivo.java:

        public class CalculadoraCientifica {}

- Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: `ano` e `anoFabricacao`. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

  Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo, com "final" + todas as letras maiúsculas:

        final String BR = "Brasil"
        final double PI = 3.14
        final int ESTADOS_BRASILEIRO = 27
        final int ANO_2000 = 2000

- Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir algumas regras da linguagem.

  - Deve conter apenas letras, \_ (underline), $ ou os números de 0 a 9;
  - Deve obrigatoriamente se iniciar por uma letra (preferencialmente), \_ ou $, jamais com número;
  - Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
  - Não pode conter espaços;
  - Não podemos usar palavras-chave da linguagem;
  - O nome deve ser único dentro de um escopo.

            // Declação inválida de variáveis

            int numero&um = 1; //Os únicos símbolos permitidos são _ e $
            int 1numero = 1;    //Uma variável não pode começar com númerico
            int numero um = 1; //Não pode ter espaço no nome da variável
            int long = 1; //long faz parte das palavras reservadas da linguagem

            // Declaração válida de variáveis

            int numero$um = 1;
            int numero1 = 1;
            int numeroum = 1;
            int longo = 1;

#### Declarando variáveis e métodos

Declarar uma variável em Java segue sempre a seguinte estrutura:

    Tipo NomeBemDefinido = Atribuição //atribuição opcional em alguns casos

    // Exemplo

    int idade = 23;
    double altura = 1.62;
    Dog spike; // variavel sem atribuição

Declara métodos em Java também segue um padrão:

    TpoRetorno NomeObjetivoNoInfinitivo Parametros(s)

    // Exemplo

    int somar (int numeroUm, int numero2)

    String formatarCep (long cep)

#### Identação

Identar é um termo utilizado para escrever/tabular o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

#### Organizando arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages)/subdiretórios.

      Pacote
        Pacotes de Código-Fonte
          com.pimenta.modelo
            Cliente.java
            Funcionário
          com.pimenta.pacotes
            inicio.java
          com.pimenta.util
            ValidarCPF.java
            ValidarEmail.java
        Bibliotecas

Esse `com.` no nome dos packages refere-se a finalidade do projeto:

- `com.` => comercial
- `org.` => organizacional
- `opensource.` ou `org` => opensource

  Com o uso de pacotes, as nossas classes (.java) passam a possuir duas identificações, o nome simples e nome qualificado:

- **Nome Simples**: Nome do arquivo, exemplo ContaBanco.
- **Nome Qualificado**: Finalidade + Nome do pacote/empresa + nome do arquivo, exemplo: `com.suaempresa.ContaBanco`.

A classe pertencente a um paclage deve implementar esse path dentro do seu arquivo:

    package com.builtech.notifications;

    public class BoletimEstudantil {
        public static void main(String[] args) {

        }
    }

#### Java Beans

Iniciativa conceitual da comunidade para ter uma estrutura de escrita, como expressamos de forma mais clara e universal as classes, atributos, métodos e pacotes.

##### Variáveis

- Uma variável deve ser clara, sem abreviações ou definição sem sentido;
- Uma variável é sempre no singular, **exceto quando se referir a um array ou coleção**.
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

**Não recomendado**:

    double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
    String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
    String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

**Recomendado**:

    double salarioMedio=1500.23;
    String email ="aluno@escola.com";
    String [] emails = {"aluno@escola.com","professor@escola.com"}
    String meuNome = "JOSEPH"

##### Métodos

Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.

Exemplos sugeridos para nomenclatura de métodos:

    somar(int n1, int n2){}

    abrirConexao(){}

    concluirProcessamento() {}

    findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

    calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade

### Tipos e Variáveis

No Java, existem algumas palavras reservadas pata a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types)

Os oito tipos primitivos em Java são:

- int
- byte
- shot
- long
- float
- double
- boolean
- char

Esse tipos são considerados objetos, e portanto, representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack).

Tabela de Tipos Primitivos e seus valores:

| Tipo  | Memória | Valor mínimo               | Valor máximo              |
| ----- | ------- | -------------------------- | ------------------------- |
| byte  | 1 byte  | -128                       | 127                       |
| short | 2 bytes | -32.768                    | 32.767                    |
| int   | 4 bytes | -2.147.483.648             | 2.147.483.647             |
| long  | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

Os tipos primitivos, que podem conter partes fracionárias podem ser representados por dois tipos:

| Tipo   | Memória | Mínimo         | Máximo        | Precisão      |
| ------ | ------- | -------------- | ------------- | ------------- |
| float  | 4 bytes | -3,4028E + 38  | 3,4028E + 38  | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos    |

Apesar de o tipo float, ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos short e byte, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria das vezes, utilizaremos o tipo `int` , para representar números inteiros ou `double` para representar números fracionados.

O ponto mais relevante, em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. **Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de um funcionário?**

| Família  | Tipo Primitivo | Wrapper Class | Tamanho     |
| -------- | -------------- | ------------- | ----------- |
| Lógico   | boolean        | Booelan       | 1 bit       |
| Literais | char           | Character     | 1 byte cada |
| -        | -              | String        | 1 byte      |
| Inteiros | byte           | Byte          | 1 byte      |
| -        | short          | Short         | 2 bytes     |
| -        | int            | Integer       | 4 bytes     |
| -        | long           | Long          | 8 bytes     |
| Reais    | float          | Float         | 4 bytes     |
| -        | double         | Double        | 8 bytes     |

#### Declaração de Variáveis

Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

    <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

    int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
    int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
    double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:

    public class TipoDados {
      public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo, como string
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo; E o tipo long necessita terminar com 'L'
        float pi = 3.14F; // tipo float necessita terminar com 'F'
        double salario = 1275.33;
      }
    }

Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação. Mas, cuidado!

Java é fortemente "tipado".

    // TiposEVariaveis.java

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = numeroNormal;

Ao atribuir `short numeroCurto2 = numeroNormal;` ele apresentará erro, pois `numeroNormal` foi tipado anteriormente como `int`, que tem a capacidade máxima de caracteres muito maior que `short` e portanto o Java não permitirá a fim de evitar problemas futuramente.

#### Variáveis e Constantes

Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java, utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.

Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.

Por convenção, Constantes são sempre escritas em CAIXA ALTA.

Abaixo, temos um exemplo explicativo sobre uso de variáveis e constantes:

    public class ExemploVariavel {
      public static void main(String[] args) {
        /*
        * esta linha é considerada como declaração de variável iniciamos a existência
        * variavel numero com valor 5 regra: tipo + nome + valor
        */
        int numero = 5;

        /*
        * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
        * não é mais necessário, pois a variável já foi declarada anteriormente
        */
        numero = 10;

        System.out.print(numero);

        /*
        * ao usar a palavra reservada final, você determina que jamais
        * esta variavel poderá obter outro valor;
        * logo a linha 25 vai apresentar um erro de compilação
        * isso é considerado uma CONSTANTE na linguagem Java
        */
        final double VALOR_DE_PI = 3.14;

        VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
      }
    }

### Operadores

Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.

| Operador | Comparação  |
| -------- | ----------- |
| ==       | Igual       |
| !=       | Diferente   |
| <        | Menor       |
| >        | Maior       |
| <=       | Maior Igual |
| >=       | Menor Igual |

#### Classificação dos operadores

- Atribuição

  Representado pelo símbolo de igualdade `"="`.

  O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo:

        //classe Operadores.java

        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M'; // permite apenas 1 caractere
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); // criando novo oobjeto

- Aritméticos

  O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

  Os operadores aritméticos são: `+` (adição), `-` (subtração), `*` (multiplicação) e `/` (divisão).

        //classe Operadores.java

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // resultado em número fracionado => resto
        double resultado = (10 * 7) + (20/4);

  ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

        //classe Operadores.java

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);

- Unários

  Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

  - (+) **Operador unário de valor positivo** – números são positivos sem esse operador explicitamente;
  - (-) **Operador unário de valor negativo** – nega um número ou expressão aritmética;
  - (++) **Operador unário de incremento de valor** – incrementa o valor em 1 unidade;
  - (--) **Operador unário de decremento de valor** – decrementa o valor em 1 unidade;
  - (!) **Operador unário lógico de negação** – nega o valor de uma expressão booleana.

            //classe Operadores.java
            int numero = 5;

            //Imprimindo o numero negativo
            System.out.println(- numero);

            //incrementando numero em mais 1 numero, imprime 6
            numero ++;
            System.out.println(numero);

            //incrementando numero em mais 1 numero, imprime 7
            System.out.println(numero ++);// ops algo de errado não está certo

            System.out.println(numero);// agora sim, numero virou 7

            //ordem de precedencia conta aqui
            System.out.println(++ numero);

            boolean verdadeiro = true;

            System.out.println("Inverteu " + !verdadeiro);

  Muito cuidado com ordem de precedência, dos operadores unários!

- Ternário

  O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

  O operador ternário é representado pelos símbolos `"?"` e `":"`utilizados na seguinte estrutura de sintaxe:

        <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

  Exemplos abaixo:

        // classe Operadores.java

        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
          resultado = "verdadeiro";
        else
          resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(valor);

  O operador ternário é aplicado para qualquer tipo de valor.

- Relacionais

  Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.

  - `==` Quando desejamos verificar se uma variável é IGUAL A outra.
  - `!=` Quando desejamos verificar se uma variável é DIFERENTE da outra.
  - `> `Quando desejamos verificar se uma variável é MAIOR QUE a outra.
  - `>=` Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
  - `< `Quando desejamos verificar se uma variável é MENOR QUE outra.
  - `<=` Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

            //classe Operadores.java
            int numero1 = 1;
            int numero2 = 2;

            if(numero1 > numero2)
              System.out.print("Numero 1 maior que numero 2");

            if(numero1 < numero2)
              System.out.print("Numero 1 menor que numero 2");

            if(numero1 >= numero2)
              System.out.print("Numero 1 maior ou igual que numero 2");

            if(numero1 <= numero2)
              System.out.print("Numero 1 menor ou igual que numero 2");

            if(numero1 != numero2)
              System.out.print("Numero 1 é diferente de numero 2");jav

- Comparações avançadas

  Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo domínio, de como o Java trata o armazenamento destes valores na memória.

  Quando estiver mais familiarizado com a linguagem, recomendamos se aprofundar no conceito de espaço em memória Stack versus Heap.

  Vamos a alguns exemplos para ilustrar:

  **Valor e referência**: Precisamos entender que em Java tudo é objeto, logo, objetos diferentes podem ter as mesmas características, mas lembrando, **são objetos diferentes**.

        // ComparacaoAvancada.java

        public static void main(String[] args) {

            String nome1 = "JAVA";
            String nome2 = "JAVA";

            System.out.println(nome1 == nome2); //true

            String nome3 = new String("JAVA");

            System.out.println(nome1 == nome3); //false

            String nome4 = nome3;

            System.out.println(nome3 == nome4); //true

            //equals na parada
            System.out.println(nome1.equals(nome2)); // true
            System.out.println(nome2.equals(nome3)); // true
            System.out.println(nome3.equals(nome4)); // true

          }

  **== versus equals**: Existe uma relevância forte, em realizar comparações com **==** e **equals** na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem \*\*\*\* , exemplo:

          // ComparacaoAvancada.java

          public static void main(String[] args) {

            int numero1 = 130;
            int numero2 = 130;
            System.out.println(numero1 == numero2); //true

            Integer numero1 = 130;
            Integer numero2 = 130;

            System.out.println(numero1 == numero2); //false

            // A razão pela qual o resultado é false, é devido o Java tratar os valores
            // Como objetos a partir de agora.
            // Qual a solução ?
            // Quando queremos comparar objetos, usamos o método equals

            System.out.println(numero1.equals(numero2));
          }

- Lógicos

  Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

  - `&&` Operador Lógico "E"
  - `||` Operador Lógico "OU"

            // Operadores.java

            boolean condicao1=true;

            boolean condicao2=false;

            /* Aqui estamos utilizando o operador lógico E para fazer a união de duas
            expressões.
            É como se estivesse escrito:
            "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
            */

            if(condicao1 && condicao2)
              System.out.print("Os dois valores precisam ser verdadeiros");;

            //Se condicao1 OU condicao2 for verdadeira, executar código.
            if(condicao1 || condicao2)
              System.out.print("Um dos valores precisa ser verdadeiro");

  - Expressões lógicas avançadas

    Nós acabamos de aprender que existem os operadores lógicos **"&"**(E) e **"||"** (OU), mas por que no exemplo acima, foram ilustradas as condições:

    if (condicao1 **&&** condicao2) e if(condicao1 **||** condicao2) ?

    A duplicidade nos operadores lógicos é um recurso conhecido como **Operador Abreviado**, isso quer dizer que, se a condição1 atender aos critérios, não será necessário validar a condição2.

        // ComparacaoAvancada.java

        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

    O mesmo acontece com o operador `|` e `||` , considerando que operador, agora representa que se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.

| Operador      | Tipo                                                                     | Função                                                    | Exemplo                                                                         |
| ------------- | ------------------------------------------------------------------------ | --------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `=`           | Atribuição                                                               | Atribuição                                                | _int num = 1;_                                                                  |
| `+`           | Aritmético                                                               | Adição / Concatenação                                     | _double soma = 10.5 + 15.7;_ <br> _String nomeCompleto = "LINGUAGEM" + "JAVA";_ |
| `-`           | Aritmético                                                               | Subtração                                                 | _int subtração = 113 - 25;_                                                     |
| `*`           | Aritmético                                                               | Multiplicação                                             | _int multiplicacao = 20 \* 7;_                                                  |
| `/`           | Aritmético                                                               | Divisão                                                   | _int divisao = 15 / 3;_                                                         |
| `%`           | Aritmético                                                               | Resto                                                     | _int modulo = 18 % 3;_                                                          |
| `%`           | Aritmético                                                               | Resto                                                     | _int modulo = 18 % 3;_                                                          |
| `(+)`         | Unário                                                                   | Positivar um valor (default)                              | _int num = 5; _                                                                 |
| `(-)`         | Unário                                                                   | Negativar um valor                                        | _int num = -5;_                                                                 |
| `(++)`        | Unário                                                                   | Incrementar um valor                                      | _num++; => int num = num + 1;_                                                  |
| `(--)`        | Unário                                                                   | Decrementar um valor                                      | _num--; => int num = num - 1;_                                                  |
| `(!)`         | Unário                                                                   | Inverte um valor                                          | _boolean true = !false;_                                                        |
| `?` e `:`     | Ternário                                                                 | If/else de linha única                                    | _String resultado = (a==b) ? "verdadeiro" : "falso";_                           |
| `==`          | Relacional                                                               | Verificar se igual a                                      | _if(numero1 == numero2)_                                                        |
| `!=`          | Relacional                                                               | Verificar se diferente de                                 | _if(numero1 != numero2)_                                                        |
| `>`           | Relacional                                                               | Verificar se maior que                                    | _if(numero1 > numero2)_                                                         |
| `>=`          | Relacional                                                               | Verificar se maior ou igual a                             | _if(numero1 >= numero2)_                                                        |
| `<`           | Relacional                                                               | Verificar se menor que                                    | _if(numero1 < numero2)_                                                         |
| `<=`          | Relacional                                                               | Verificar se menor ou igual a                             | _if(numero1 <= numero2)_                                                        |
| `equals(arg)` | Comparação valor e referência <br> \* Não é um operador, e sim um método | Verificar se conteúdo de objetos e textos são iguais <br> | _if(numero1.equals(numero2))_                                                   |
| `&&`          | Lógico                                                                   | Operador "E" - se ambos forem verdadeiros                 | _if(condicao1 && condicao2)_                                                    |
| `OU`          | Lógico                                                                   | Operador "OU" - se um ou outro for verdadeiro             | _if(condicao1 && condicao2)_                                                    |

### Métodos

- Qual a proposta principal do método ?
- Qual o tipo de retorno esperado após executar o método ?
- Quais os parâmetros serão necessários para execução do método ?
- O método possui o risco de apresentar alguma exceção ?
- Qual a visibilidade do método ?

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. O smétodos, são em sua maioria, correspondem a funções e sub-rotinas disponíveis dentro da classe.

Boas práticas:

- Deve ser nomeado como verbo
- Seguir o padrão camelCase

        somar(int n1, int n2){}

        findByid(int id){}

Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

#### Critério de definição de métodos

1. Qual a proposta principal do método ?
2. Qual o tipo de retorno esperado após executar o método ?

Caso ele não retorne nenhum valor, será representado pela palavra-chave `void`

3.  Quais os parâmetros serão necessários para execução do método ?
4.  O método possui o risco de apresentar alguma execeção ?

    Prever e tratar a existência de uma exceção (comportamentos inesperados/erros)

5.  Qual a visibilidade do método ?

    Pode ser necessário que o método seja visível a toda aplicação, somente em mesmo pacote, através de herança ou somente a nível a própria classe.

Abaixo, temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

      public class MyClass {

        public double somar(int num1, int num2){
          //LOGICA - FINALIDADE DO MÉTODO
          return ... ;
        }

        public void imprimir(String texto){
          //LOGICA - FINALIDADE DO MÉTODO
          //AQUI NÃO PRECISA DO RETURN
          //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
        }
        // throws Exception : indica que o método ao ser utilizado
        // poderá gerar uma exceção
        public double dividir(int dividendo, int divisor) throws Exception{}

        // este método não pode ser visto por outras classes no projeto
        private void metodoPrivado(){}

        //alguns equívocos estruturais
        public void validar(){
          //este método deveria retornar algum valor
          //no caso boolean (true ou false)
        }
        public void calcularEnviar(){
          //um método deve representar uma única responsabilidade
        }
        public void gravarCliente(String nome, String cpf, Integer telefone, ....){
          //este método tem a finalidade de gravar
          //informações de um cliente, por que não criar
          //um objeto cliente e passar como parâmetro ?
          //veja abaixo
        }
        public void gravarCliente(Cliente cliente){}
        //ou
        public void gravar(Cliente cliente){}
      }

### Escopo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada.**

A variável é criada no primeiro acesso à ela, se tornando incessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.

Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo desssa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de código, seu projeto tende a conter falahs estruturais e comprometer a proposta principal da aplicação.

      public class Conta{
        // varivel da classe Conta
        double saldo = 10.0;

        public void sacar (Double valor){
          // variavel local de método
          double novoSaldo = saldo - valor;
        }
        public void imprimirSaldo(){

          // disponivel em toda classe
          System.out.println(saldo);

          // somente o método sacar conhece esta variavel
          System.out.println(novoSaldo);
        }
        public double calcularDividaExponencial(){
          //variavel local de método
          double valorParcela = 50.0;
          double valorMontante = 0.0; // começando a variável com valor zero
          for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
            //esta variável será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
          }
          //escopo de fluxo
          //x e valorCalculado nunca estarão disponíveis fora do for

          return valorMontante;
        }

        }

### Palavras reservadas

A linguagem Java possui 52 palavras reservadas, classificadas em grupos e escritas com letra minúscula.

- Controle de pacotes

  `import`: importa pacotes ou classes para dentro do código

  `package`: especifica a que pacote, todas as classes de um arquivo pertencem

- Modificadores de acesso

  `public`: acesso de qualquer classe

  `private`: acesso apenas dentro da classe

  `protected`: acesso por classes no mesmo pacote e subclasses

- Primitivos

  `boolean`: um valor indicando verdadeiro ou falso

  `byte`: um inteiro de 8 bits (signed)

  `char`: um character unicode (16-bit unsigned)

  `double`: um número de ponto flutuante de 64 bits (signed)

  `float`: um número de ponto flutuante de 32 bits (signed)

  `int`: um inteiro de 32 bits (signed)

  `long`: um inteiro de 64 bits (signed)

  `short`: um inteiro de 32 bits (signed)

  `void`: indica que o método não tem retorno de valor

- Modificadores de classes, variáveis ou métodos

  `abstract`: classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata

  `class`: especifica uma classe

  `extends`: indica a superclasse que a subclasse está estendendo

  `final`: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada

  `implements`: indica as interfaces que uma classe irá implementar

  `interface`: especifica uma interface

  `native`: indica que um método está escrito em uma linguagem dependente de plataforma, como o C

  `new`: instancia um novo objeto, chamando seu construtor

  `static`: faz um método ou variável pertencer à classe ao invés de às instâncias

  `strictfp`: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões

  `synchronized`: indica que um método só pode ser acessado por uma thread de cada vez

  `transient`: impede a serialização de campos

  `volatile`: indica que uma variável pode ser alterada durante o uso de threads.

- Controle de fluxo dentro de um bloco de código

  `break`: sai do bloco de código em que ele está

  `case`: executa um bloco de código dependendo do teste do switch

  `continue`: pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop

  `default`: executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro

  `do`: executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente

  `else`: executa um bloco de código alternativo caso o teste "if" seja falso

  `for`: usado para realizar um loop condicional de um bloco de código

  `if`: usado para realizar um teste lógico de verdadeiro ou falso

  `instanceof`: determina se um objeto é uma instância de determinada classe, superclasse ou interface

  `return`: retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável)

  `switch`: indica a variável a ser comparada nas expressões case

  `while`: executa um bloco de código repetidamente enquanto a condição for verdadeira

- Tratamento de erros

  `assert`: testa uma expressão condicional, para verificar uma suposição do programador

  `catch`: declara o bloco de código usado para tratar uma exceção;

  `finally`: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção

  `throw`: usado para passar uma exceção para o método que o chamou

  `throws`: indica que um método pode passar uma exceção para o método que o chamou

  `try`: bloco de código que tentará ser executado, mas que pode causar uma exceção

- Variáveis de referência

  `super`: refere-se a superclasse imediata

  `this`: refere-se a instância atual do objeto

- Palavras reservadas não utilizadas

  `const`: Não utilize para declarar constantes; use public static final

  `goto`: não implementada na linguagem Java, por ser considerada prejudicial

- Literais reservados

  De acordo com a Java Language Specification, **null**, **true** e **false** são tecnicamente chamados de valores literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.

**Escopo de uso**

| Uso      | Palavras                                                                      | Observação                                                         |
| -------- | ----------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| Arquivo  | package, import, static                                                       |                                                                    |
| Classe   | public ou protected ou private + final ou abstract + extends ou implements.   | **private** (em caso de classe interna), **final** ou **abstract** |
| Método   | public ou protected ou private + static ou final ou abstract + void e return. | **void** em caso de não ter retorno ou **return** se houver        |
| Atributo | public ou protected ou private + static ou final + tipo primitivo             | \*\*\*\*                                                           |

**Palavras "opostas"**

Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente opostas (antônimas) na linguagem Java conforme tabela abaixo:

| Palavra   | Palavra      | Explicação                                                                                                                                                                                                                                                                 |
| --------- | ------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `package` | `impor`t     | Enquanto package determina o diretório real da classe, o import informa de onde será importada a classe. Isso porque, podemos ter classes de mesmo nome.                                                                                                                   |
| `extends` | `implements` | enquanto **extends** determina que uma classe estende outra classe, **implements** determina que uma classe implementa uma interface, porém nunca o contrário.                                                                                                             |
| `final`   | `abstract`   | enquanto **final** determina fim de alteração de valor ou lógica comportamental, **abstrac**t em métodos, exige que sub-classes precisarão definir comportamento e um método abstrato. NOTA: Se uma classe contém um único método abstrato, toda classe precisa ser.       |
| `throws`  | `throw`      | Esta é uma das situações mais complicadas, de compreensão destas duas palavras. Enquanto a **throws** determina que um método pode lançar uma exceção, **throw** é a implementação que dispara a exceção**. Vamos conhecer mais sobre este conceito no assunto Exceções.** |

### Documentação

Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.
Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.

Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

Aqui, temos o link da documentação de uma das principais classes da linguagem Java:

[Exemplo de documentação da classe String na versão 7 da linguagem](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

#### Tags

Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| Tag      | Descrição                                              |
| -------- | ------------------------------------------------------ |
| @autor   | Autor/Criador                                          |
| @version | Versão do recurso disponibilizado                      |
| @since   | Versão / Data de ínicio da disponibilização do recurso |
| @param   | Descrição dos parâmetros dos métodos criados           |
| @return  | Definição do tipo de retorno de um método              |
| @throws  | Se o método lança alguma exceção                       |

Abaixo, iremos ilustrar a classe Calculadora com um exemplo de documentação, destacando as tags mais utilizadas:

    /**
    * <h1>Calculadora</h1>
    * A Calculadora realiza operações matemáticas entre números inteiros
    * <p>
    * <b>Note:</b> Leia atentamente a documentação desta classes
    * para desfrutar dos recursos oferecidos pelo autor
    *
    * @author  Gleyson Sampaio
    * @version 1.0
    * @since   01/01/2022
    */
    public class Calculadora {
        /**
      * Este método é utilizado para somar dois números inteiros
      * @param numeroUm este é o primeiro parâmetro do método
      * @param numeroDois este é o segundo parâmetro do método
      * @return int o resultado deste método é a soma dos dois números.
      */
        public int somar(int numeroUm, int numeroDois) {
            return  numeroUm + numeroDois;
        }
    }

#### Tipos de comentários

    // Olá, eu sou um comentário em uma única linha

    /* Olá,
    * Eu sou um comentario
    * que posso ser mais detalhadod
    * quando necessário
    */

    /**
    * Estas duas estrelinhas acima
    * é para identificar que você
    * pretende elaborar um comentário
    * a nível de documentação.
    * Que incrível !!!
    */

Um comentário, não possui a finalidade de amenizar um algoritmo não estruturado, conforme as convenções da linguagem:

    /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    * /
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x
        }
        return r;
    }

#### Javadoc

Javadoc é um gerador de documentação criado pela [Sun Microsystems](https://pt.wikipedia.org/wiki/Sun_Microsystems) , para documentar a [API](https://pt.wikipedia.org/wiki/API) dos programas em [Java](https://pt.wikipedia.org/wiki/Linguagem_de_programa%C3%A7%C3%A3o_Java), a partir do [código-fonte](https://pt.wikipedia.org/wiki/C%C3%B3digo-fonte). O resultado é expresso em [HTML](https://pt.wikipedia.org/wiki/HTML). É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.
Este sistema, é o padrão de documentação de classes em Java, onde muitas das [IDEs](https://pt.wikipedia.org/wiki/Ambiente_de_desenvolvimento_integrado) desta linguagem irão automaticamente gerar um Javadoc em [HTML](https://pt.wikipedia.org/wiki/HTML).

[Javadoc - Wikipedia](https://pt.wikipedia.org/wiki/Javadoc)

Criando nossa documentação no formato html, para disponibilizar via web.

    // No terminal execute o comando abaixo

    javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

### Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE, já pensou, nossos clientes tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa ?

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso, iremos aprender como executar um programa Java via terminal, como MS - DOS, gitbash ou terminal do VsCode.

Vamos criar uma classe chamada `MinhaClasse.java `com o código abaixo:

    public class MinhaClasse {
        public static void main(String[] args) {
            System.out.println("Oi, fui executado pelo Terminal");
        }
    }

Observe que nosso projeto Java criado por uma IDE, terá uma pasta chamada **bin**. É nesta pasta que ficarão os arquivos **.class**, o nosso `bytecode`.

Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontram as classes do nosso projeto, no meu caso está em: **C:\estudos\dio-trilha-java-basico\java-terminal**.

## Controles de Fluxo

É a habilidade de ajustar a maneira como um programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas condicionalmente, repetidamente ou excepcionalmente.

### Estruturas condicionais: if-else, switch-case

A estrutura condicional possibilita a escolha de um grupo de ações e comportamentos a serem executados quando determinadas condições são satisfeitas ou não. A estrutura condicional pode ser **Simples** ou **Composta**.

#### Condicionais Simples

É quando ocorre uma validação de execução de fluxo somente quando a condição for positiva.

![Condicional Simples](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-e843dc080767f890ab51c27fb7d39c39f76355a3%2Fimage%20(6)%20(1)%20(1)%20(1).png?alt=media>)

    // CaixaEletronico.java

    public class CaixaEletronico {
      public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
          saldo = saldo - valorSolicitado;

          System.out.println(saldo);

      }
    }

#### Condicionais Composta

Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução, condionado a uma regra de negócio, este cenário é denominado **Estrutura Condicional Composta**

![Condicional Composta](https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-78673a798e8cfeb3846f2a644476eea6445d3792%2Fif-else.png?alt=media)

    // ResultadoEscolar.java

    public class ResultadoEscolar {
      public static void main(String[] args) {

        int nota = 6;

        if(nota >= 7)
          System.out.println("Aprovado");

        else
          System.out.println("Reprovado");
      }
    }

Vale ressaltar aqui, que no Java, em uma condição**if/else** às vezes necessitamos adicionar um bloco de { },se a lógica conter mais de uma linha.

#### Condicionais Encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.

![Condicional encadeada](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-be0ccceecead9c90abe541aa7ebb5e1ba781033a%2Fimage%20(11)%20(1)%20(1)%20(1)%20(1)%20(1).png?alt=media>)

    // ResultadoEscolar.java

    public class ResultadoEscolar {
      public static void main(String[] args) {
          int nota = 6;

          if (nota >= 7)
            System.out.println("Aprovado");
          else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
          else
            System.out.println("Reprovado");
      }
    }

#### Condição Ternária

Como vimos em operadores, podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima, para ilustrar o poder deste recurso:

    // Cenário 1

    public class ResultadoEscolar {
      public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
      }
    }


    // Cenário 2

    public class ResultadoEscolar {
      public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
      }
    }

#### Switch Case

A estrutura **switch**, compara o valor de cada caso, com o da variável sequencialmente e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas, após um caso correspondente ter sido encontrado, acrescentamos o comando **break** no final de cada bloco de códigos. O comando **break**, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida, com base em mapa de valores, exemplo:

| Sigla | Tamanho |
| ----- | ------- |
| P     | PEQUENO |
| M     | MÉDIO   |
| G     | GRANDE  |

    // SistemaMedida.java

      // Modo condicional if/else

      public class SistemaMedida {
        public static void main(String[] args) {
          String sigla = "M";

          if(sigla == "P")
            System.out.println("PEQUENO");
          else if(sigla == "M")
            System.out.println("MÉDIO");
          else if(sigla == "G")
            System.out.println("GRANDE");
          else
            System.out.println("INDEFINIDO");

        }
      }

      // Modo condicional switch / case

      public class SistemaMedida {
        public static void main(String[] args) {
          String sigla = "M";

          switch (sigla) {
          case "P":{
            System.out.println("PEQUENO");
            break;
          }
          case "M":{
            System.out.println("MÉDIO");
            break;
          }
          case "G":{
            System.out.println("GRANDE");
            break;
          }
          default:
            System.out.println("INDEFINIDO");
          }


        }
      }

Observe que a nível de sintaxe, não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação: informar a palavra break em cada alternativa.

Porém, um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algoritmo seria conforme ilustração abaixo:
Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

- O sistema terá 03 planos: BASIC, MIDIA , TURBO;
- BASIC: 100 minutos de ligação;
- MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
- TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.

        // Modo condicional convencional

        public class PlanoOperadora {
          public static void main(String[] args) {
            String plano = "M"; //M / T

            if(plano == "B") {
              System.out.println("100 minutos de ligação");
            }else if(plano == "M") {
              System.out.println("100 minutos de ligação");
              System.out.println("WhatsApp e Instagram grátis");
            }else if(plano == "T") {
              System.out.println("100 minutos de ligação");
              System.out.println("WhatsApp e Instagram grátis");
              System.out.println("5Gb Youtube");
            }


          }
        }

        // Modo condicional switch/case

        public class PlanoOperadora {
          public static void main(String[] args) {
            String plano = "M"; // M / T

            switch (plano) {
              case "T": {
                System.out.println("5Gb Youtube");
              }
              case "M": {
                System.out.println("WhatsApp e Instagram grátis");
              }
              case "B": {
                System.out.println("100 minutos de ligação");
              }
            }
          }
        }

### Estruturas de repetição: for, while, do-while

> Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.
>
> https://diegomariano.com/lacos-de-repeticao-2

Laços ou repetições são representados pelas seguintes estruturas:

- **For** (para)
- **While** (enquanto)
- **Do While** (faça enquanto)

<hr>

#### For

O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.

A estrutura de sintaxe do controle de repetição `for` é exibida abaixo:

    //estrutura do controle de fluxo for

    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
    }

Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:

    // ExemploFor.java

    public class ExemploFor {
      public static void main(String[] args) {
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
          System.out.println(carneirinhos + " - Carneirinho(s)");
        }
      }
    }

Vamos explicar a estrutura do código acima:

##### For position

1.  int carneirinhos `= 1;` ⇨ O programa entende que a variável carneirinhos, começa com o valor igual a 1 e isso acontece somente uma vez;
2.  carneirinhos `< = 20;` ⇨ O programa verifica se a variável carneirinhos, ainda é menor que 20;
3.  O programa começa a executar o algoritmo, no nosso caso, imprimir a quantidade de carneirinhos em contagem;
4.  carneirinhos `++` ⇨ O programa aumenta em mais 1, o valor da variável carneirinhos;
5.  O fluxo é finalizado, quando a variável carneirinhos for igual a 20.

        // Outras estruturas

        //estrutura 1

        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        //estrutura 2
        //o que importa é somente o bloco condicional

        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }

Também usamos o controle de fluxo `for` , para interagir sobre arrays e coleções:

    // ExemploFor.java

    public class ExemploFor {
      public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
          System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

      }
    }

> Observe que, como os arrays começam com índice igual a 0 (zero), iniciamos a nossa variável x também com valor zero e validamos a quantidade de repetições, a partir da quantidade de elementos do array.

#### For Each

O uso do `for / each` está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim , a interação é baseada nos elementos da coleção.

    // ExemploFor.java

    public class ExemploFor {
      public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma abreviada
        for(String aluno : alunos) {
          System.out.println(alunos);
        }

      }
    }

1. `String aluno : alunos` ⇨ De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
2. A impressão de cada aluno é realizada.

#### Break e Continue

**Break** significa quebrar, parar, frear, interromper. E é isso que se faz, quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando `break` interrompe o laço, já o `continue` interrompe somente a iteração atual.

    // class ExemploBreakContinue.java

    public class ExemploBreakContinue {
      public static void main(String[] args) {

      for(int numero = 1; numero <=5; numero ++){
        if(numero==3)
          break;

        System.out.println(numero); // 1 2

      }

        }
    }

    // class ExemploBreakContinue.java
    public class ExemploBreakContinue {
      public static void main(String[] args) {

      for(int numero = 1; numero <=5; numero ++){
        if(numero==3)
          continue;

        System.out.println(numero); // 1 2 4 5

      }

        }
    }

> Observem que sempre o `break` e `continue`, está condicionado a um critério de negócio.

#### While

O laço **while** (na tradução literal para a língua portuguesa “enquanto”) determina que, enquanto uma condição for válida, o bloco de código será executado. O laço **while**, testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe, do controle de repetição **while** é exibida abaixo:

    //estrutura do controle de fluxo while

    while (expressão booleana de validação)
    {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
    }

Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.

    // ExemploWhile.java

    import java.util.concurrent.ThreadLocalRandom;
    public class ExemploWhile {
    public static void main(String[] args) {
      double mesada = 50.0;
            while(mesada>0) {
                Double valorDoce = valorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");

            /*
            * Não se preocupe quanto a formatação de valores
            * Iremos explorar os recursos de formatação em breve !!
            */
      }
      private static double valorAleatorio() {
      return ThreadLocalRandom.current().nextDouble(2, 8);
      }
    }

#### Do While

O laço **do / while** (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que, enquanto uma determinada condição for válida, o bloco de código será executado. Entretanto, **do / while** testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição **do / while** é exibida abaixo:

    //estrutura do controle de fluxo do while

    do
    {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
    }
    while (expressão booleana de validação);

Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos:

    // ExemploDoWhile.java

    import java.util.Random;
    public class ExemploDoWhile {
      public static void main(String[] args) {
        public static void main(String[] args) {
          System.out.println("Discando...");

          do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

          }while(tocando());

          System.out.println("Alô !!!");
        }
        private static boolean tocando() {
          boolean atendeu = new Random().nextInt(3)==1;
          System.out.println("Atendeu? " + atendeu);
          //negando o ato de continuar tocando
          return ! atendeu;
        }
      }
    }

### Estruturas de exceções: try-catch-finally, throw

Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma **exceção** (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drásticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco, com usuário ou senha inválida. Todos estes cenários e os demais, não são erros mas sim fluxos, não previstos pela aplicação.

É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de **Tratamento de Exceções**.

    import java.util.Locale;
    import java.util.Scanner;

    public class AboutMe {
      public static void main(String[] args) {
          //criando o objeto scanner
          Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

          System.out.println("Digite seu nome");
          String nome = scanner.next();

          System.out.println("Digite seu sobrenome");
          String sobrenome = scanner.next();

          System.out.println("Digite sua idade");
          int idade = scanner.nextInt();

          System.out.println("Digite sua altura");
          double altura = scanner.nextDouble();


          //imprimindo os dados obtidos pelo usuario
          System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
          System.out.println("Tenho " + idade + " anos ");
          System.out.println("Minha altura é " + altura + "cm ");
          scanner.close();
      }
    }

Aparentemente é um programa simples, mas vamos listar algumas possíveis exceções, que podem acontecer.

- Não informar o nome e sobrenome;
- O valor da idade ter um caractere NÃO numérico;
- O valor da altura ter uma vírgula ao invés de ser um ponto **(conforme padrão americano)**;

Executando o nosso programa com os valores abaixo, vamos entender qual exceção acontecerá:

| Entrada               | Valor           | Exceção                          | Causa                                                                                        |
| --------------------- | --------------- | -------------------------------- | -------------------------------------------------------------------------------------------- |
| Digite seu nome:      | **Marcelo**     |                                  |                                                                                              |
| Digite seu sobrenome: | **Azevedo**     |                                  |                                                                                              |
| Digite sua idade:     | **quinze (15)** | java.util.InputMismatchException | O programa esperava o valor do tipo numérico inteiro.                                        |
| Digite sua altura:    | **1,65**        | java.util.InputMismatchException | O programa esperava o valor do tipo numérico decimal no formato americano, exemplo: **1.65** |

> A melhor forma de prever, que pode ocorrer uma exceção, é pensar que ela pode ocorrer.
> **Lei de Murphy**

#### Conhecendo algumas exceções já mapeadas

A linguagem Java, dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as mais comuns:

| Nome                           | Causa                                                                 |
| ------------------------------ | --------------------------------------------------------------------- |
| java.lang.NullPointerException | Quando tentamos obter alguma informação de uma variável nula.         |
| java.lang.ArithmeticException  | Quando tentamos dividir um valor por zero.                            |
| java.sql.SQLException          | Quando existe algum erro, relacionado a interação com banco de dados. |
| java.io.FileNotFoundException  | Quando tentamos ler ou escrever, em um arquivo que não existe.        |

#### Tratamento de exceções

E quando inevitavelmente, ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução `try`, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.

A instrução `catch`, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução `finally`, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vem em pares:

Estrutura de um bloco com try e catch:

    try {
      //  bloco de código conforme esperado
    }
    catch(Exception e) {// precisamos saber qual exceção
      // bloco de código que captura as exceções que podem acontecer
      // em caso de um fluxo não previsto
    }

> O bloco try / catch pode conter um conjunto de catchs, correspondentes a cada exceção prevista em uma funcionalidade do programa.

#### Hierarquia das exceções

A linguagem Java, dispõe de uma variedade de classes, que representam exceções e estas classes, são organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou _Exceções Checadas e Não Checadas_.

![Estruturas de exceção](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-0a7f6b0fbaca3818648bfc77b4ec18d7a2675236%2Fimage%20(6)%20(1).png?alt=media>)

> O que determina uma exceção ser classificada como checada ou não checada ?
> É o risco dela ser disparada, logo, você precisa tratá-la, exemplo:

Vamos imaginar que precisamos realizar de duas maneiras, a conversão de uma String para um número, porém o texto contém Alfanuméricos.

    public class ExemploExcecao {
      public static void main(String[] args) {
          Number valor = Double.valueOf("a1.75");

          valor = NumberFormat.getInstance().parse("a1.75");

          System.out.println(valor);

      }
    }

> As linhas 3 e 5, apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar uma exceção checada, logo, nós programadores que iremos usar este método, teremos que tratá-la explicitamente com **try \ catch**.

#### Exceções customizadas

Nós podemos criar nossas próprias exceções, baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

-Imagina que como regra de negócio, para formatar um cep, necessita sempre de ter 8 dígitos, caso contrário, lançará uma exceção que denominamos de **CepInvalidoException**.

- Primeiro criamos nossa exceção:

        public class CepInvalidoException extends Exception {}

- Em seguida, criamos nosso método de formatação de cep:

        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();

              //simulando um cep formatado
              return "23.765-064";
        }
