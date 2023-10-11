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

## Controle de Fluxo

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

## Programação Orientada a Objeto

### Conceito de POO

Você já ouviu falar a expressão, linguagem de baixo e de alto nível?

À medida que a tecnologia vem evoluindo, as linguagens de programação também, e é esta transição natural, que determina, quando estamos nos referindo a linguagem de baixo e alto nível.

**Baixo nível**: São linguagens que estão mais próximas, da interpretação da máquina, diante do algoritmo desenvolvido. Exemplo: **Linguagem Assembly e C**.

**Alto nível**: São linguagens que disponibilizam, uma proposta de sintaxe (forma de escrever processos para serem executados pelo computador) mais próxima de interpretação humana. Exemplo: **Java, JavaScript, Python e C++**

Exemplo de um simples Hello World em **Assembly** versus **Python**:

**Assembly**:

    section	.text

      global _start

    _start:

      mov	edx, len

      mov	ecx, msg

      mov	ebx, 1

      mov	eax, 4

      int	0x80

      mov	eax, 1

      int	0x80

    section	.data

    msg	db	'Hello, world!',0xa

    len	equ	$ - msg

**Python**:

    print('Hello, world!')

#### Programação Estruturada

**A programação estruturada** é um [paradigma de programação](https://stringfixer.com/pt/Programming_paradigm), que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um [programa de computador](https://stringfixer.com/pt/Computer_program), fazendo uso extensivo, das construções de fluxo de controle estruturado de seleção ( [if / then / else](<https://stringfixer.com/pt/Conditional_(computer_programming)>) ) e repetição (while e [for](https://stringfixer.com/pt/For_loop) ), [estruturas de bloco](<https://stringfixer.com/pt/Block_(programming)>) e [sub-rotinas](https://stringfixer.com/pt/Subroutines) .

O que devemos ter em mente, é que na programação estruturada, implementamos algoritmos com estruturas sequenciais denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo local ou global em uma aplicação.

#### Programação Orientada a Objetos

POO é um [paradigma de programação](https://pt.wikipedia.org/wiki/Paradigma_de_programa%C3%A7%C3%A3o), baseado no conceito de "[objetos](<https://pt.wikipedia.org/wiki/Objeto_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)>)", que podem conter [dados](https://pt.wikipedia.org/wiki/Dados) na forma de [campos](<https://pt.wikipedia.org/wiki/Campo_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)>), também conhecidos como atributos, e códigos, na forma de [procedimentos](https://pt.wikipedia.org/wiki/Procedimento), também conhecidos como [métodos](<https://pt.wikipedia.org/wiki/M%C3%A9todo_(programa%C3%A7%C3%A3o)>).

O que precisamos entender, é que cada vez mais as linguagens se adequam ao cenário real, proporcionando assim, que o programador desenvolva algoritmos mais próximo de fluxos comportamentais, logo, tudo ao nosso redor é representado como Objeto.

> Enquanto a programação estruturada é voltada a procedimentos e funções, definidas pelo usuário, a programação orientada a objetos é voltada a conceitos, como o de classes e objetos.

### Classes

Toda a estrutura de código, na linguagem Java é distribuído em arquivos, com extensão **.java** denominados de **classe**.

As classes existentes em nosso projeto, serão composta por:

**Identificador, Características e Comportamentos**

- **Classe** (_class_): A estrutura e/ou representação que direciona a criação dos objetos de mesmo tipo.
- **Identificador** (identity): Propósito existencial aos objetos que serão criados.
- **Características** (_states_): Também conhecido como **atributos** ou **propriedades**, é toda informação que representa o estado do objeto.
- **Comportamentos** (behavior): Também conhecido como **ações** ou **métodos**, é toda parte comportamental que um objeto dispõe.
- **Instanciar** (new): É o ato de criar um objeto a partir de estrutura, definida em uma classe.

![Ilustração de uma classe Estudante e 03 Objetos criados](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-0c95c1d29336e1a2c8924f914cbab3dd38077990%2Fimage%20(9)%20(1)%20(1)%20(1).png?alt=media>)

Para ilustrar as etapas de desenvolvimento, orientada a objetos em Java, iremos reproduzir a imagem acima em forma de código, para explicar que primeiro criamos a estrutura correspondente, para assim podermos criá-los com as características e a possibilidade de realização de ações (comportamentos), como se fosse no "mundo real".

    // Criando a classe Student
    // Com todas as características e compartamentos aplicados

    public class Student {
      String name;
      int age;
      Color color;
      Sex sex;

      void eating(Lunch lunch){
        //NOSSO CÓDIGO AQUI
      }
      void drinking(Juice juice){
        //NOSSO CÓDIGO AQUI
      }
      void running(){
        //NOSSO CÓDIGO AQUI
      }
    }

    // Criando objetos a partir da classe Student

    public class School {
      public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.name= "John";
        student1.age= 12;
        student1.color= Color.FAIR;
        student1.sex= Sex.MALE;

        Student student2 = new Student();
        student2.name= "Sophia";
        student2.age= 10;
        student2.color= Color.FAIR;
        student2.sex= Sex.FEMALE;

        Student student3 = new Student();
        student3.name= "Lily";
        student3.age= 11;
        student3.color= Color.DARK;
        student3.sex= Sex.FEMALE;
      }
    }

> No exemplo acima, **NÃO** estruturamos a classe Student,com o padrão Java Beans **getters** e **setters**.

Seguindo algumas convenções, as nossas classes são classificadas como:

- **Classe de modelo (model)**: classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.
- **Classe de serviço (service)**: classes que contém regras de negócio e validação de nosso sistema.
- **Classe de repositório (repository)**: classes que contém uma integração com banco de dados.
  **Classe de controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação externa, à nossa aplicação, como http web ou webservices.
  **Classe utilitária (util)**: classe que contém recursos comuns, à toda nossa aplicação.

![Modelo aplicado em grande parte dos projetos atuais](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%2Fimage%20(7)%20(1)%20(1).png?alt=media>)

### Pacotes

A linguagem Java, é composta por milhares de classes, com as finalidades de por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão com banco de dados, entre outras. Imagina todas estas classes, existindo em um único nível de documentos? E as classes desenvolvidas por nós, meros desenvolvedores, de aplicações de vários os gêneros? Imagina como ficaria este diretório hein!?

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-7e3cc96b40c9628e0ca010fa03a3b1c0f84d47cf%2Fimage%20(9)%20(1)%20(1).png?alt=media>)

Para prevenir este acontecimento, a linguagem dispõe de um recurso, que organiza as classes padrões criadas por nós, que conhecemos como pacote (package). Os pacotes são subdiretórios, a partir da pasta src do nosso projeto, onde estão localizadas, as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizadas no mercado.

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-85650fe21efc214012ba8e0ef7d5374464f2fe59%2Fimage%20(18)%20(1).png?alt=media>)

#### Nomenclatura

Vamos imaginar, que sua empresa se chama _Power Soft_ e ela está desenvolvendo software comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

- **Comercial** : com.powersoft;
- **Governamental** : gov.powersoft;
- **Código aberto**: org.powersoft.

Bem, acima já podemos perceber que existe uma definição, para o uso do nome dos pacotes, porém, podemos organizar ainda mais um pouco as nossas classes, mediante a proposta de sua existência:

- **model** : Classes que representam a camada e modelo da aplicação : Cliente, Pedido, NotaFiscal, Usuario;
- **repository**: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;
- **service**: Classes que contém regras de negócio do sistema : ClienteService possui o método validar o CPF, do cliente cadastrado;
- **controller**: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicação, para outras aplicações via padrão HTTP;
- **view**: Classes que possuem alguma interação, com a interface gráfica acessada pelo usuário;
- **util**: Pacote que contém, classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.

#### Identificação

Uma das características de uma classe é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome qualificado (**endereçamento do pacote + nome**), exemplo: Considere a classe `Usuario`, que está endereçada no pacote `com.controle.acesso.model`, o nome qualificado desta classe é com.`controle.acesso.model.Usuario`.

#### Package versus Import

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém, uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:

    package

    import ...
    import ...

    public class MinhaClasse {
    }

#### Por que é tão importante compreender de pacotes?

A linguagem Java, é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.

É nesta hora, que nós desenvolvedores precisamos detectar, qual classe iremos importar em nosso projeto.

Um exemplo clássico é, a existência das classes `java.sql.Date` e `java.util.Date` da própria linguagem, recomendo você leitor, pesquisar sobre a diferença das duas classes.

### Visibilidade dos recursos

#### Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem nehuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes. Iremos ilustrar do mais visível, ao mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos, através do contexto em uma lanchonete, que vende lanche natural e suco.

##### Modificador public

Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.

![](https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-11e169f025fbf09ce369a6166a354d12c7a2f794%2Flanchonete_1.png?alt=media)

##### Modificador public

**Cozinheiro**

    package lanchonete;

    public class Cozinheiro {
      //pode ser default
      public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
      }
      //pode ser default
      public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
      }
      //pode ser default
      public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
      }
      public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
      }
      public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
      }
      public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
      }
      public void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
      }
      public void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
      }
      public void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
      }
      public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
      }
      public void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
      }
      public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
      }
      public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
      }
      public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
      }
    }

**Almoxarife**

    package lanchonete;

    public class Almoxarife {
      public void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
      }
      public void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
      }
      public void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        //...?
      }
      public void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
      }
    }

**Atendente**

    package lanchonete;

    public class Atendente {
      public void servindoMesa() {
        //...?
        System.out.println("SERVINDO A MESA");
      }
      public void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
      }
      public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
      }
      public void trocarGas() {
        System.out.println("ATENDENTE TROCANDO O GÁS");
      }
      public void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
      }
    }

**Cliente**

    package lanchonete;

    public class Cliente {
      public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
      }
      public void fazerPedido() {
        System.out.println("FAZENDO O PEDIDO");
      }
      public void pagarConta() {
        System.out.println("PAGANDO A CONTA");
      }
      public void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
      }
      public void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
      }
    }

**Estabelecimento**

    package lanchonete;

    public class Estabelecimento {
      public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
        //ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, qua tal ser privada ?
        cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gás acabou ?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);

      }
    }

##### Modificador default

O modificador `default`, está fortemente associado a organização das classes por pacotes, algumas implementações, não precisam estar disponíveis por todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.

Dentro do pacote `lanchonete`, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

- **lanchonete.atendimento.cozinha**: Pacote que contém classes, da parte da cozinha da lanchonete e atendimentos.
- **lanchonete.area.cliente**: Pacote que contém classes, relacionadas ao espaço do cliente.

![](https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-1fdf089ebb01ef7239344fbeae3dbf9ca71c1db0%2Fpacotes.png?alt=media)

Para definir um método visível a nível de pacote, basta NÃO declarar nenhum modificador, exemplo:

    // Cozinheiro.java

    //público
    public void lavarIngredientes() {
      System.out.println("LAVANDO INGREDIENTES");
    }

    //nível de pacote
    //sem nenhuma palavra reservada de acesso
    void lavarIngredientes() {
      System.out.println("LAVANDO INGREDIENTES");
    }

##### Modificador private

Depois de reestruturar nosso estabelecimento (projeto), onde temos as divisões (pacotes), espaço do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

Conhecemos as ações disponíveis nas classes `Cozinheiro, Almoxarife, Atendente e Cliente`, mesmo com a organização da visibilidade por pacote, será que realmente estas classes precisam ser tão explícitas?

- Será que o `Cozinheiro` precisa saber que\como o `Almoxarife` controla as entradas e saídas ?
- Que o `Cliente` precisa saber como o `Atendente` recebe o pedido, para servir sua mesa ?
- Que o `Atendente` precisa saber que antes de pagar, o `Cliente` consulta o saldo no App ?

Diante destes questionamentos, é que nossas classes precisam continuar mantendo suas ações (métodos), mas nem todas precisam ser vistas por ninguém.

### Getters e Setters

Seguindo a convenção Java Beans:

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos, de instâncias de classes.

O método **Getter**, retorna o valor do atributo especificado.

O método **Setter**, define outro novo valor para o atributo especificado.

Vemos o código abaixo, da criação de um objeto Aluno com nome e idade:

    // arquivo Aluno.java
    public class Aluno {
      String nome;
      int idade;
    }

    // arquivo Escola.java
    public class Escola {
      public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.nome="Felipe";
        felipe.idade = 8;

        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos
      }
    }

Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:

- Os atributos precisam ter o modificador de acesso private. Ex.: _private_ String nome;
- Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos **get**X e **set**X, Ex.: getNome() e setNome(String novoNome);
- O método **get**, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, Ex.: _public String getNome() {}_;
- O método **set**, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. Ex.: _public void setNome(String newNome)_;

        //arquivo Aluno.java
        public class Aluno {
          private String nome;
          private int idade;

          public String getNome() {
            return nome;
          }
          public void setNome(String newNome) {
            nome = newNome;
          }
          public int getIdade() {
            return idade;
          }
          public void setIdade(int newIdade) {
            this.idade = newIdade;
          }
        }

        //arquivo Escola.java
        public class Escola {
          public static void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.setNome("Felipe");
            felipe.setIdade(8);

            System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
          }
        }

> A proposta do código acima é a mesma que o código anterior, a diferença é que adotamos a convenção Java Beans, para definir e obter as características dos nossos objetos.

Uso do _this_ no método _set_.

É muito comum vermos nossos métodos de definição ter a seguinte sintaxe:

    //arquivo Aluno.java
    private String nome;

    public void setNome(String nome) {
      this.nome = nome;
    }

> Observe que a descrição do nosso atributo nome é igual a descrição do parâmetro, logo, utilizamos mais uma palavra reservada this,para distinguir um do outro. Para mais detalhes veja [Palavras Reservadas](https://github.com/digytal-code/digytal-space-content/blob/main/programacao-orientada-a-objetos/broken-reference/README.md).

### Construtores

Sabemos que, para criar um objeto na linguagem Java, utilizamos a seguinte estrutura de código:

    Classe novoObjeto = new Classe();

Desta forma, será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas vezes, já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto, defina algumas propriedades essenciais. Abaixo, iremos ilustrar uma classe Pessoa, onde a mesma terá os atributos: Nome, CPF e Endereço.

    public class Pessoa {
      private String nome;
      private String cpf;
      private String endereco;

      public String getNome() {
        return nome;
      }
      public String getCpf() {
        return cpf;
      }
      public String getEndereco() {
        return endereco;
      }
      public void setEndereco(String endereco) {
        this.endereco = endereco;
      }
      //...
      //setters de nome e cpf ?
    }

Criaremos uma Pessoa, mas como não temos o setter para nome e cpf, este objeto não tem como receber estes valores:

    public class SistemaCadastro {
      public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa();

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos ?

        //imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
      }
    }

Entrando em cena o construtor, para criar nossos objetos, já com valores requeridos na momento da criação\instanciação (_new_):

    public class Pessoa {
      private String nome;
      private String cpf;
      private String endereco;

      // método construtor
      // o nome deverá ser igual ao nome da classe
      public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
      }

      //...
      //getters
      //setters
    }

Alterando o nosso sistema, para agora criar o objeto com informações já requeridas, conforme definição da ordem dos parâmetros do construtor:

    public class SistemaCadastro {
      public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");

        //continua ...

      }
    }

### Enums

Enum, é um tipo especial de classe, onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum, quando o nosso modelo de negócio contém objetos de mesmo contexto, que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.

**Exemplos:**

**Grau de Escolaridade:** Analfabeto, Fundamental, Médio, Superior;

**Estado Civil:** Solteiro, Casado, Divorciado, Viúvo;

**Estados Brasileiros:** São Paulo, Rio de Janeiro, Piauí, Maranhão.

> Não confunda uma lista de constantes com enum.

Enquanto que uma constante é uma variável de tipo com valor imutável, enum é um conjunto de objetos já pre-definidos na aplicação.

Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum, para disponibilizar os quatro estados brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega o nome do de cada estado e já retorna para todo maiúsculo.

    // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
    public enum EstadoBrasileiro {
      SAO_PAULO ("SP","São Paulo"),
      RIO_JANEIRO ("RJ", "Rio de Janeiro"),
      PIAUI ("PI", "Piauí"),
      MARANHAO ("MA","Maranhão") ;

      private String nome;
      private String sigla;

      private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
      }
      public String getSigla() {
        return sigla;
      }
      public String getNome() {
        return nome;
      }
      public String getNomeMaiusculo() {
        return nome.toUpperCase();
      }

    }

#### Boas práticas para criar objetos Enum

- As opções (objetos), devem ser descritos em caixa alta separados por underline (\_), ex.: OPCAO_UM, OPCAO_DOIS;
- Após as opções, deve-se encerrar com ponto e vírgula ";" ;
- Um enum é como uma classe, logo, poderá ter atributos e métodos tranquilamente;
- Os valores dos atributos, devem já ser definidos após cada opção, dentro de parênteses como se fosse um _new_;
- O construtor deve ser privado;
- Não é comum um enum possuir o recurso _setter_(alteração de propriedade), somente os métodos _getters_ correspondentes.

Agora **NÃO** precisaremos, criar objetos que representam cada estado, toda vez que precisarmos destas informações, basta usar o **enum** acima e escolher a opção (objeto), já pré-definido em qualquer parte do nosso sistema.

    // qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
    public class SistemaIbge {
      public static void main(String[] args) {
        //imprimindo os estados existentes no enum
        for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
          System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
        }

        //selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;

        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
      }
    }

### UML

Linguagem de Modelagem Unificada ou UML, é uma notação, que possibilita a representação gráfica do projeto
![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-5eb6e70c393e53ddafe8c4bb38fb8360daa53aab%2Fimage%20(17)%20(1).png?alt=media>)

Na UML, temos três conceitos necessários para compreendermos inicialmente:

**Diagramas, elementos e relacionamentos.**

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-7df9488f40343c429c8714631d9dbc19668f4043%2Fimage%20(7)%20(1)%20(2).png?alt=media>)

As notações UML, são distribuídas em duas categorias de diagramas, a estrutural e comportamental conforme listagem abaixo:

#### Diagramas estruturais

- **Diagrama de classe**: O Diagrama de Classes é utilizado para fazer a representação de, estruturas de classes de negócio, interfaces e outros componentes do sistema. Por esta característica, este diagrama é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.

- **Diagrama de objetos**: Este diagrama, representa os objetos existentes em um determinado instante ou fato na aplicação. Assim, conseguimos ter uma perspectiva do estado de nossos objetos, mediante a interação dos usuários no sistema.

> Existem outras categorias de diagramas estruturais e comportamentais, porém iremos focar nos citados acima.

#### Diagrama de classe

O diagrama de classes, ilustra **graficamente ** como classes serão estruturadas e interligadas entre si, diante da proposta do nosso software.

Em diagrama, a estrutura das classes é constituída por:

**Identificação**: Nome e/ou finalidade da classe;

**Atributos**: Propriedades e/ou características;

**Operações**: Ações e/ou métodos.

#### Relacionamentos

Em um diagrama, as classes podem existir de forma independente, mas obviamente haverá, em alguma etapa da aplicação a necessidade de algumas se relacionarem, o que devemos compreender é, o nível de dependência entre elas:

##### Associação

Uma associação, define um relacionamento entre duas classes, permitindo que, um objeto tenha acesso a estrutura de um outro objeto.

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-5681df722d3bbe15cca7d948c3ec9f0842e5a2a6%2Fimage%20(7)%20(1).png?alt=media>)

- **Agregação**: Em uma agregação, a classe principal contém uma relação com outra classe, mas ela pode existir, sem a classe agregadora. Imagina um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam uma profissão:

![Candidato é classe principal e a Profissão, agregação.](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-f87b64ba00e44eac19debada84b5ef08c56b7e7e%2Fimage%20(10)%20(1).png?alt=media>)

- **Composição**: A composição já caracteriza uma dependência existencial, entre a classe principal e a classe associada. Imaginamos que uma admissão só poderá existir, contendo suas informações básicas e a composição do candidato selecionado.

![Admissão é a classe principal e Candidato compõe a Admissão, logo este SURGIRA uma composição entre Admissão e Colaborador - ver DDD](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-f249b98688e95959b0c0b3e616654a6ce7d02105%2Fimage%20(1)%20(1).png?alt=media>)

##### Multiplicidade

Nem sempre o relacionamento entre as classes, será de **um para um**, em um determinado cenário poderá exigir multiplicidades específicas, conforme opções abaixo:

- 1. -> Representa uma associação, **contendo um elemento**;
- \*. -> Representa uma associação, **contendo uma lista de elementos**;
- 0..1 -> Representa uma associação, **contendo zero ou um elemento**;
- 0..\* -> Representa uma associação, **contendo zero ou uma lista de elementos**;
- 1..\* -> Representa uma associação, **contendo um ou uma lista de elementos**.

##### Visibilidade

Os atributos e métodos de uma classe, podem receber níveis de visibilidade, e na UML existem símbolos que representam cada um deles.

- (+) Visibilidade pública;
- (#) Visibilidade protegida (muito associada com herança);
- (-) Visibilidade privada.

##### Representação

![Ilustração utilizando a ferramenta Astah Community.](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b38fcec2347903449b3e5c98b2986f6f3cb96f4f%2Fimage%20(6).png?alt=media>)

##### Que tal praticar ?

![lustração utilizando a ferramenta Astah Community.](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b38fcec2347903449b3e5c98b2986f6f3cb96f4f%2Fimage%20(6).png?alt=media>)

#### Ferramentas

Existem inúmeras ferramentas de diagramação, tanto online, como pagas e gratuitas.
![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-002403fbd6300dcfc3804ab04160d2e8f8d1cbec%2Fimage%20(17).png?alt=media>)

### Pilares do POO

**Programação orientada a objetos** (**POO**, ou **OOP** segundo as suas siglas em inglês), é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos e códigos, na forma de procedimentos, também conhecidos como métodos.

Como se trata de, um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária, Aluno, Veículo, Transferência etc.

A programação orientada a objetos, é bem requisitada no contexto das aplicações mais atuais no mercado, devido a possibilidade de reutilização de código e a capacidade de representação do sistema, ser muito mais próximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como **Os quatro pilares da orientação a objetos**:

- **Encapsulamento**: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos, com finalidades específicas que complementam uma ação em nossa aplicação.
  Exemplo: Ligar um veículo, exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, dar a partida e a “magia” acontece.
- **Herança**: Características e comportamentos comuns, podem ser elevados e compartilhados através de uma hierarquia de objetos.
  Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar e frear. Logo, para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe **Veículo** para que seja herdada por **Carro** e **Motocicleta**.
- **Abstração**: É a indisponibilidade, para determinar a lógica de um ou vários comportamentos, em um objeto.
  Exemplo: **Veículo\*\*** \*\* determina duas ações como acelerar e frear, logo, estes comportamentos deverão ser abstratos, pois existem mais de uma maneira de se realizar a mesma operação. ver Polimorfismo.
- **Polimorfismo**: São as inúmeras maneiras de se realizar uma mesma ação.
  Exemplo: Veículo determina duas ações como acelerar e frear, primeiramente, precisamos identificar se estaremos nos referindo a **Carro\*\*** ** ou **Motocicleta\*\*, para determinar a lógica de aceleração e frenagem dos respectivos veículos.

##### Em prática

Para ilustrar a proposta dos Princípios de POO, no nosso cotidiano, vamos simular algumas funcionalidades dos aplicativos de mensagens instantâneas pela internet.

**MSN Messenger** foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O serviço nasceu a 22 de julho de 1999, anunciando-se como um serviço que, permitia falar com uma pessoa através de conversas instantâneas pela internet. Ao longo dos anos, surgiram novos serviços de mensagens pela internet, como **Facebook Messenger** e o **VKontakte Telegram**.

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-508b916c86e4fe676b8a4dafcb843e8bb0db44f8%2Fimage%20(8)%20(1)%20(1).png?alt=media>)

Vamos descrever em UML e depois em código, algumas das principais funcionalidades de qualquer serviço de comunicação instantânea pela internet, inicialmente pelo MSN Messenger e depois inserindo os demais, considerando os princípios de POO.

**UML**
![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-32e4d75933544ea1ebd7027be1038c7891b95e36%2Fimage%20(14).png?alt=media>)

Pontos de atenção:

- Todos os métodos da classe são **public** (tudo realmente precisa estar visível ?);
- Só existe uma única forma de se comunicar via internet (como ter novas formas de se comunicar mantendo a proposta central ?).

        public class MSNMessenger {
          public void enviarMensagem() {
            System.out.println("Enviando mensagem");
          }
          public void receberMensagem() {
            System.out.println("Recebendo mensagem");
          }
          public void validarConectadoInternet() {
            System.out.println("Validando se está conectado a internet");
          }
          public void salvarHistoricoMensagem() {
            System.out.println("Salvando o histórico da mensagem");
          }
        }

#### Encapsulamento

Nem tudo precisa ser estar disponível para todos!

Já imaginou, você instalar o MSN Messenger e ao querer enviar uma mensagem, fosse solicitado a você, verificar se o computador está conectado a internet e depois, pedir para você salvar a mensagem no histórico? ou, se ao tentar enviar um SMS pelo celular, primeiro você precisasse consultar manualmente o seu saldo ?

Acredito que não seria uma experiência tão agradável de ser executada, recorrentemente, por nós usuários.

Mesmo ainda sendo necessária algumas etapas, nos processos citados, não é um requisito uma visibilidade pública, isso quer dizer, além da própria classe que possui a responsabilidade de uma determinada ação.

Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas privadas (private). E é ai que se caracteriza a necessidade do pilar de Encapsulamento. O que esconder ?

Vejamos a refatoração abaixo, da nossa classe MSN Messenger:

**UML**
![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-bf51fc5a4c202546ec3574493a5dcda45abb744f%2Fimage%20(8)%20(1).png?alt=media>)

**Antes**

    /*
    * Simulação do uso da classe MSNMessenger
    */
    public class ComputadorPedrinho {
      public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
      }
    }

**MSNMessenger.java**

    public class MSNMessenger {
      public void enviarMensagem() {
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem");

        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();


      }
      public void receberMensagem() {
        System.out.println("Recebendo mensagem");
      }

      //métodos privadas, visíveis somente na classe
      private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
      }
      private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
      }
    }

**Depois**

    /*
    * Simulação do uso da classe MSNMessenger
    */
    public class ComputadorPedrinho {
      public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();
      }
    }

#### Herança

Nem tudo se copia, às vezes se herda.

Já imaginou, você ter sido classificado para a vaga de emprego de seus sonhos e como desafio, seria justamente você criar um diagrama de classes e em seguida os respectivos arquivos .java, que apresentasse os fundamentos de POO, com base no contexto de vários aplicativos de mensagens instantâneas? Sorte sua que você está nos acompanhando, em nossa jornada! 😜

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-8e93d7ce458fcb5049f945ad6fdfb049e4abb52d%2Fimage%20(8)%20(2).png?alt=media>)

> Com base na nossa classe MsnMessenger, você já poderia dar os primeiros passos para se dar bem no processo seletivo, simplemente, copiar e colar a estrutura, para as novas classes FacebookMessenger, Telegram e BINGO 😁😁😁!!!

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b73f132940fddf924da1ae4e74f0fc40071dbfb8%2Fimage%20(19).png?alt=media>)

Agora é escrever o código das classes acima e esperar pela contratação !!!

> Lamentamos dizer, mas esta não seria a melhor alternativa para a proposta citada acima.

Além de uma compreensão do desafio, é necessário que, tenhamos domínio dos pilares de POO e aplicá-los em situações iguais a esta.

**NOTE**: Todas as três classes, possuem a mesma estrutura comportamental e diante deste contexto, se encaixa perfeitamente o segundo pilar da POO, a Herança.

![Representação UML do sistema de mensagens insntantâneas](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-fd6c7fe52a162033db9766e99c07ec7735df2ebe%2Fimage%20(11)%20(1)%20(1)%20(1).png?alt=media>)

**SevicoPai**

    //a classe MSNMessenger é ou representa
    public class ServicoMensagemInstantanea {
      public void enviarMensagem() {
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
      }
      public void receberMensagem() {
        System.out.println("Recebendo mensagem");
      }

      //métodos privadas, visíveis somente na classe
      private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
      }
      private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
      }
    }

**MSN**

    public class MSNMessenger extends ServicoMensagemInstantanea{

    }

**Facebook**

    public class FacebookMessenger extends ServicoMensagemInstantanea {

    }

**Telegram**

    public class Telegram extends ServicoMensagemInstantanea {

    }

**ComputadorPedrinho**

    public class ComputadorPedrinho {
      public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

      }
    }

Podemos avaliar a importância de compreender os pilares de POO, para ter uma melhor implementação, reaproveitamento e reutilização de código, em qualquer contexto das nossas aplicações, mas não para por ai.

> Será que todos os sistemas de mensagens, realizam as suas operações de uma mesma maneira? e agora ? este é um trabalho para os pilares Abstração e Polimorfismo.

#### Abstração

Para você ser, é preciso você fazer.

Sabemos que qualquer sistema de mensagens instantâneas realiza as mesmas operações de Enviar e Receber Mensagem, dentre outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

Mas será que as ações realizadas, contém o mesmo comportamento ? Acreditamos que não.

> Já imaginou a Microsoft falar para o Facebook: "Ei, toma meu código do MSN!".

O que vale destacar para compreender, é que todo e qualquer sistema de mensagem precisa sim, no mínimo Enviar e Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado.

Observem a nova estruturação dos códigos abaixo, com base na implementação apresentada no pilar Herança.

**ServicoPai**

    public abstract class ServicoMensagemInstantanea {
      public abstract void enviarMensagem();
      public abstract void receberMensagem();
    }

**MSN**

    public class MSNMessenger extends ServicoMensagemInstantanea{
      public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN Messenger");
      }
      public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
      }
    }

**Facebook**

    public class FacebookMessenger extends ServicoMensagemInstantanea {
      public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
      }
      public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
      }
    }

**Telegram**

    public class Telegram extends ServicoMensagemInstantanea {
      public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
      }
      public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
      }
    }

> Em Java, o conceito de abstração é representado pela palavra reservada **abstract**e métodos que NÃO possuem corpo na classe abstrata (pai).
> É muito difícil falar de abstraçãoe NÃO mencionar polimorfismo.

#### Polimorfismo

Um mesmo comportamento, de várias maneiras.

Podemos observar no contexto de **Abstração e Herança**, que conseguimos criar uma singularidade estrutural de nossos elementos. Isso quer dizer que, qualquer classe que deseja representar um serviço de mensagens, basta estender a classe **ServicoMensagemInstantanea** e implementar, os respectivos métodos abstratos. O que vale reforçar aqui é, cada classe terá a mesma ação, executando procedimentos de maneira especializada.

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-346b134698ce593ffb76f72333bc79bfa04e6199%2Fimage%20(9).png?alt=media>)

Este é o resultado do que denominamos como, Polimorfismo. Veja o exemplo abaixo:

    public class ComputadorPedrinho {
      public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */
        String appEscolhido="???";

        if(appEscolhido.equals("msn"))
          smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
          smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
          smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
      }
    }

> Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas, determinem ações uniformes, para que cada classe filha concreta, implemente os comportamentos de forma específica.

##### Modificador protected

Vamos para uma retrospectiva, quanto ao requisito do nosso sistema de mensagens instantâneas, desde a etapa de encapsulamento.
O nosso requisito, solicita que além de Enviar e Receber Mensagens, precisamos validar se o aplicativo está conectado a internet (_validarConectadoInternet_) e salvar o histórico de cada mensagem (_salvarHistoricoMensagem_).
Sabemos que cada aplicativo, costuma salvar as mensagens em seus respectivos servidores cloud, mas e quanto validar se está conectado a internet? Não poderia ser um mecanismo comum a todos ? Logo, qualquer classe filha, de **ServicoMensagemInstantanea** poderia desfrutar através de herança, esta funcionalidade.

> Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificador **private**somente a classe conhece a implementação, quanto que o modificador **public**todos passarão a conhecer. Mas gostaríamos que, somente as classes filhas soubessem. Bem, é ai que entra o modificador protected.

    public abstract class ServicoMensagemInstantanea {

      public abstract void enviarMensagem();
      public abstract void receberMensagem();

      //mais um método que todos os filhos deverão implementar
      public abstract void salvarHistoricoMensagem();

      //somente os filhos conhecem este método
      protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
      }
    }

### Interface

> Antes de tudo, NÃO estamos nos referindo a interface gráfica. Tudo bem? 😁😉

Como vimos anteriormente, **Herança** é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida, na linguagem Java, é que a mesma não permite o que conhecemos como **Herança Múltipla**.

A medida que vão surgindo novas necessidades, novos equipamentos (objetos), que nascem para atender as expectativas de oferecer ferramentas com finalidades bem específicas, como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

Observem que não há uma especificação de marca, modelo e ou capacidades de execução das classes citadas acima, isto é o que consideramos o nível mais abstrato da orientação a objetos, que denominamos como **interfaces**.

Ilustração de interfaces dos equipamentos citados acima:
![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-c934a98203783dfa28d98f4f3003056d5721fab6%2Fimage%20(11)%20(1)%20(1).png?alt=media>)

> Então, o que você está dizendo é que interfaces, é o mesmo que classes? Um molde para representação dos objetos reais ?

Este é um dos maiores questionamentos dos desenvolvedores, no que se refere a modelo de classes da aplicação.
Como citado acima, Java não permite herança múltipla, logo, vamos imaginar que, recebemos o desafio de projetar uma nova classe, para criar objetos que representam as três características citadas acima e que iremos denominar de **EquipamentoMultifunional**.

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-fc3c1c4ec6d603682b686a470565e0c6f3798972%2Fimage%20(11)%20(1).png?alt=media>)

Para uma melhor compreensão, vamos analisar os diagramas de classes abaixo, comparando o conceito de herança entre, classes e interfaces.

**Cenário 1**

![Exemplo de aplicação de Herança entre classes](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-71934593133ff20a66e3fa0e3723c93b5d3bd8b7%2Fimage%20(3)%20(2).png?alt=media>)

![Ilustração do uso de interfaces para aplicar Herança Múltipla](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-0175ff3d712a283ce6c6b317fc09046a94e1836b%2Fimage%20(20).png?alt=media>)

Antes de iniciarmos a representação via código, devemos compreender que, assim como em classes e métodos abstratos, quando herdamos de uma interface, precisamos implementar todos os seus métodos, pois os mesmos são implicitamente _public abstract_.

E para encerrar, uma das mais importantes ilustrações, quanto ao uso de interfaces para, desenvolvimento de componentes revolucionários, é apresentado em 2007 por nada mais nada menos que Steve Jobs ao lançar o primeiro **iPhone** da história.

![](<https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-8389eb9fec103802db8d0911de82447c0ba5dbdd%2Fimage%20(11).png?alt=media>)

> Um único equipamento, que pode ser considerado tanto como um: **Reprodutor Musical, Aparelho Telefônico e Navegador na Internet**.

### Conhecendo Collections Java

[Fonte](https://github.com/cami-la/collections-java-api-2023)

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade, estes
  elementos precisam ser Objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo
  especifico.
- O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a
  coleção independente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa), a partir dessas
  interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

![Hierarchy of Collection Framework in Java [Hierarchy of Collection Framework in Java](https://data-flair.training/blogs/collection-framework-in-java/)](https://raw.githubusercontent.com/cami-la/collections-java-api-2023/master/assets/image/collection-framework.png)

- Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.
- Embora a interface Map não ser filha direta da interface Collection ela também é considerada uma coleção devido a sua função.

![Method Sumary Collection Interface [Method Sumary Collection Interface](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html)](https://raw.githubusercontent.com/cami-la/collections-java-api-2023/master/assets/image/collection-framework-methods.png)

#### Entendendo o Generics Type

- Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
- A classe Box a seguir será modificada para demonstrar o conceito:

      public class Box {
      private Object object;

          public void set(Object object) { this.object = object; }
          public Object get() { return object; }
      }

- O símbolo _<>_ é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
- Para atualizar a classe `Box` para usar main.java.generics, você cria uma declaração de tipo genérico alterando o código `public class Box` para `public class Box<T>`.
- Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe:

      /**
      Versão genérica da classe Box.
      @param <T> o tipo do valor sendo armazenado
      */
      public class Box<T> {
      // T representa "Type" (tipo)
      private T t;

          public void set(T t) { this.t = t; }
          public T get() { return t; }
      }

Como você pode ver, todas as ocorrências de Object são substituídas por T.

Uma variável de tipo pode ser qualquer tipo não primitivo que você especificar: qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo outra variável de tipo.

Essa mesma técnica pode ser aplicada para criar interfaces genérica.

Os nomes de parâmetros de tipo mais comumente usados são:

- E - Elemento (usado extensivamente pelo Java Collections Framework)
- K - Chave
- N - Número
- T - Tipo
- V - Valor
- S, U, V, etc. - 2º, 3º, 4º tipos

#### Vantagens simples de usar main.java.generics nas interfaces Collection em Java:

1. Segurança do tipo de dados: O uso de main.java.generics garante que apenas objetos de um tipo específico possam ser adicionados à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados corretos.
2. Código mais legível: Ao usar main.java.generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.
3. Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a identificar erros de tipo antes mesmo de executar o programa.
4. Reutilização de código: Com main.java.generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.
5. Melhor desempenho: O uso de main.java.generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize o código com base no tipo especificado.

#### Comparable X Comparator

**Comparable**

- `Comparable` fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
- `Comparable` afeta a classe original, ou seja, a classe atual é modificada.
- `Comparable` fornece o método `compareTo()` para ordenar elementos.
- `Comparable` está presente no pacote `java.lang`.
- Podemos ordenar os elementos da lista do tipo `Comparable` usando o método `Collections.sort(List)`.

**Comparator**

- O `Comparator` fornece o método `compare()` para ordenar elementos.
- O `Comparator` fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome, preço, etc.
- O `Comparator` não afeta a classe original, ou seja, a classe atual não é modificada.
- Um `Comparator` está presente no pacote `java.util`.
- Podemos ordenar os elementos da lista do tipo `Comparator` usando o método `Collections.sort(List, Comparator)`.

**Collections**

- A classe `Collections` é uma classe utilitária do Java para operações comuns em coleções.
- Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.
  - O método `sort()` é usado para ordenar uma lista em ordem ascendente.
- O método `sort()` em conjunto com `Collections.reverseOrder()` permite ordenar em ordem descendente.

      package main.java.main.java.comparableXcomparator;

      import java.util.Comparator;

      // Uma classe 'Livro' que implementa Comparable
      class Livro implements Comparable<Livro> {
      private String titulo;
      private String autor;
      private int ano;

          // Construtor
          public Livro(String ti, String au, int an) {
              this.titulo = ti;
              this.autor = au;
              this.ano = an;
          }

          // Usado para ordenar livros por ano
          public int compareTo(Livro l) {
              return titulo.compareTo(l.titulo);
          }

          // Métodos getters para acessar os dados privados
          public String getTitulo() {
              return titulo;
          }

          public String getAutor() {
              return autor;
          }

          public int getAno() {
              return ano;
          }
      }

      // Classe para comparar Livro por autor
      class CompararAutor implements Comparator<Livro> {
        @Override
        public int compare(Livro l1, Livro l2) {
          return l1.getAutor().compareTo(l2.getAutor());
        }
      }

      // Classe para comparar Livro por ano
      class CompararAno implements Comparator<Livro> {
        @Override
        public int compare(Livro l1, Livro l2) {
          if (l1.getAno() < l2.getAno())
          return -1;
          if (l1.getAno() > l2.getAno())
          return 1;
          else
          return 0;
        }
      }

      class CompararAnoAutorTitulo implements Comparator<Livro> {
        @Override
        public int compare(Livro l1, Livro l2) {
          int ano = Integer.compare(l1.getAno(), l2.getAno());
          if (ano != 0)
          return ano;
          int autor = l1.getAutor().compareTo(l2.getAutor());
          if (autor != 0)
          return autor;
          return l1.getTitulo().compareTo(l2.getTitulo());
        }
      }

#### LIST interface

![](https://raw.githubusercontent.com/cami-la/collections-java-api-2023/master/assets/image/main.java.list-interface-hierarchy.png)

- A interface `List` é uma coleção ordenada que permite a inclusão de elementos duplicados.
- É um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são `ArrayList` e `LinkedList`.
- A `List` se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.
- A interface `List` fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistas usando índices.
- A classe `Collections` fornece algoritmos úteis para manipulação de `List`, como ordenação (sort), embaralhamento (shuffle), reversão (reverse) e busca binária (binarySearch).

> ArrayList: O ArrayList é uma implementação da interface List que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do ArrayList é o acesso rápido aos elementos por meio de índices, o que permite recuperar um elemento específico de forma eficiente. No entanto, adicionar ou remover elementos no meio da lista pode ser mais lento, pois requer a realocação de elementos.

> LinkedList: O LinkedList é uma implementação da interface List que armazena os elementos em uma lista duplamente vinculada. Cada elemento contém referências para o elemento anterior e próximo na lista. A principal vantagem do LinkedList é a eficiência na adição ou remoção de elementos no início ou no final da lista, pois não é necessário realocar elementos. No entanto, o acesso aos elementos por meio de índices é mais lento, pois requer percorrer a lista até o elemento desejado.

> Vector: O Vector é uma implementação antiga da interface List que é semelhante ao ArrayList, mas é sincronizada, ou seja, é thread-safe. Isso significa que várias threads podem manipular um objeto Vector ao mesmo tempo sem causar problemas de concorrência. No entanto, essa sincronização adiciona uma sobrecarga de desempenho, tornando o Vector menos eficiente do que o ArrayList em cenários em que a concorrência não é um problema. Por esse motivo, o uso do Vector é menos comum em aplicações modernas

### Fixando os Conhecimentos

Exercícios:

1. Operações Básicas com List
2. Pesquisa em List
3. Ordenação nas List

#### Operações Básicas com List

1. Lista de Tarefas
   Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
- `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
- `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas na lista.

2. Carrinho de Compras:
   Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `calcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

#### Pesquisa em List

1. Catálogo de Livros
   Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

- `adicionarLivro(String titulo, String autor, int anoPublicacao)`: Adiciona um livro ao catálogo.
- `pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- `pesquisarPorTitulo(String titulo)`: Pesquisa livros por título e retorna o primeiro livro encontrado.

2. Soma de Números
   Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista de números.
- `calcularSoma()`: Calcula a soma de todos os números na lista e retorna o resultado.
- `encontrarMaiorNumero()`: Encontra o maior número na lista e retorna o valor.
- `encontrarMenorNumero()`: Encontra o menor número na lista e retorna o valor.
- `exibirNumeros()`: Retorna uma lista contendo todos os números presentes na lista.

#### Ordenação em List

1. Ordenação de Pessoas
   Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

- `adicionarPessoa(String nome, int idade, double altura)`: Adiciona uma pessoa à lista.
- `ordenarPorIdade()`: Ordena as pessoas da lista por idade usando a interface Comparable.
- `ordenarPorAltura()`: Ordena as pessoas da lista por altura usando um Comparator personalizado.

2. Ordenação de Números
   Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

`- adicionarNumero(int numero)`: Adiciona um número à lista.

- `ordenarAscendente()`: Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
- `ordenarDescendente()`: Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.

#### SET

- A interface Set é uma coleção que não pode conter elementos duplicados.
- Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas.
- A plataforma Java possui três implementações de Set de uso geral: HashSet, TreeSet e LinkedHashSet.
- A interface Set não permite acesso aleatório a um elemento na coleção.
- Para percorrer os elementos de um Set, você pode usar um iterador ou um loop foreach.

> HashSet: O HashSet é uma implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto.

> TreeSet: O TreeSet é uma implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet.

> LinkedHashSet: O LinkedHashSet é uma implementação da interface Set que mantém a ordem de inserção dos elementos, além de usar uma tabela hash para obter um bom desempenho de busca. Ele é semelhante ao HashSet, mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O LinkedHashSet é útil quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca.

#### Fixando os Conhecimentos

Exercícios:

1. Pesquisa em Set
2. Ordenação nas Set
3. Operações Básicas com Set

**Operações Básicas com Set**

1. Conjunto de Convidados

   Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.

2. Conjunto de Palavras Únicas

   Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.

**Pesquisa em Set**

1. Agenda de Contatos

   Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.

2. Lista de Tarefas

   Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

-` adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.

- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.

**Ordenação em Set**

1. Cadastro de Produtos

   Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.

2. Lista de Alunos

   Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.

#### MAP

![Hierarchy of Collection Framework in Java](https://github.com/cami-la/collections-java-api-2023/raw/master/assets/image/map-interface-hierarchy.png)
[Hierarchy of Collection Framework in Java](https://data-flair.training/blogs/collection-framework-in-java/)

- A interface `Map` é usada para mapear dados na forma de chaves e valores.
- O `Map` do Java é um objeto que mapeia chaves para valores.
- Um `Map` não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
- A plataforma Java possui três implementações gerais de `Map`: `HashMap`, `TreeMap` e `LinkedHashMap`.
- As operações básicas do `Map` são: `put` (inserir ou atualizar), `get` (obter), `containsKey` (verificar se contém uma chave), `containsValue` (verificar se contém um valor), `size` (obter o tamanho) e `isEmpty` (verificar se está vazio).

> _HashTable_ é uma implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.

> _LinkedHashMap_, por outro lado, é uma implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.

> _HashMap_ é uma implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos.

**Fixando os Conhecimentos**

Exercícios:

1. Operações Básicas com Map
2. Pesquisa em Map
3. Ordenação nas Map

**Operações Básicas com Map**

**1. Agenda de Contatos**

Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- `adicionarContato(String nome, Integer telefone)`: Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato(String nome)`: Remove um contato da agenda, dado o nome do contato.
- `exibirContatos()`: Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.

**2. Dicionário**

Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e retorna sua definição correspondente.

**Pesquisa em Map**

**1. Estoque de Produtos com Preço**

Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade \* preço).

**2. Contagem de Palavras**

Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra à contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.

**Ordenação nos Map**

**1. Agenda de Eventos**

Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.

**2. Livraria Online**

Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

- `adicionarLivro(String link, String titulo, String autor, private double preco)`: Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String titulo)`: Remove um livro da livraria, dado o titulo do livro.
- `exibirLivrosOrdenadosPorPreco()`: Exibe os livros da livraria em ordem crescente de preço.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro disponível na livraria.
- `exibirLivroMaisBarato()`: Retorna o livro mais barato disponível na livraria.

### Ganhando Produtividade com Stream API e Java

- A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional.
- Stream, trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional e burocrática forma imperativa.

      public class CarrinhoDeCompras {
        //atributos
        private List<Item> itemList;
        //construtor
        public CarrinhoDeCompras() {
          this.itemList = new ArrayList<>();
        }

        //método para calcular valor total dos itens sem utilizar o Stream API
        public double calcularValorTotal() {
          double valorTotal = 0d;
          if (!itemList.isEmpty()) {
            for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuant();
            valorTotal += valorItem;
          }
          return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
          }
        }
      }

- Na forma imperativa, para realizar uma soma simples, por exemplo, o desenvolvedor tem que se preocupar não apenas com o que deve ser feito em cada elemento, isto é, com as regras associadas ao processamento dos elementos da lista, mas também com a maneira de realizar essa iteração.

  public class CarrinhoDeCompras {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoDeCompras() {
  this.itemList = new ArrayList<>();
  }

      //método para calcular valor total dos itens utilizando o Stream API
      public double calcularValorTotal() {
        if (itemList.isEmpty()) {
          throw new RuntimeException("A lista está vazia!");
        }
        return itemList.stream()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
      }

  }

- Combinada com as Expressões Lambda e Method reference, eles proporcionam uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
- As operações na Stream API podem ser classificadas em duas categorias principais:

1. Operações Intermediárias: são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. São elas:

- `filter(Predicate<T> predicate)`: Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado. Exemplo: ` stream.filter(n -> n > 5)`
- `map(Function<T, R> mapper)`: Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes. Exemplo: `stream.map(s -> s.toUpperCase())`
- `sorted()`: Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido. Exemplo: `stream.sorted()`
- `distinct()`: Remove elementos duplicados da Stream, considerando a implementação do método `equals()` para comparação. Exemplo: `stream.distinct()`
- `limit(long maxSize)`: Limita o número de elementos da Stream aos maxSize primeiros elementos Exemplo: `stream.limit(10)`
- `skip(long n)`: Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles. Exemplo: `stream.skip(5)`

2. Operações Terminais: são aquelas que encerram o pipeline e produzem um resultado final. São elas:

- `forEach(Consumer<T> action)`: Executa uma ação para cada elemento da Stream. Exemplo: `stream.forEach(System.out::println)`
- `toArray()`: Converte a Stream em um array contendo os elementos da Stream. Exemplo: `stream.toArray()`
- `collect(Collector<T, A, R> collector)`: Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa. Exemplo: `stream.collect(Collectors.toList())`
- `count()`: Retorna o número de elementos na Stream. Exemplo: `stream.count()`
- `anyMatch(Predicate<T> predicate)`: Verifica se algum elemento da Stream atende ao predicado especificado. Exemplo: `stream.anyMatch(s -> s.startsWith("A"))`
- `allMatch(Predicate<T> predicate)`: Verifica se todos os elementos da Stream atendem ao predicado especificado. Exemplo: `stream.allMatch(n -> n > 0)`
- `noneMatch(Predicate<T> predicate)`: Verifica se nenhum elemento da Stream atende ao predicado especificado. Exemplo: `stream.noneMatch(s -> s.isEmpty())`
- `min(Comparator<T> comparator)` e `max(Comparator<T> comparator)`: Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido. Exemplo: `stream.min(Comparator.naturalOrder())` ou `stream.max(Comparator.naturalOrder())`
- `reduce(T identity, BinaryOperator<T> accumulator)`: Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final. Exemplo: `stream.reduce(0, (a, b) -> a + b)`

#### Lambda

- As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.
- As interfaces funcionais desempenham um papel crucial na programação funcional em Java, pois servem de base para o uso de expressões lambda.
- Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.
- As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

      public class OrdenacaoPessoa {
        //atributo
        private List<Pessoa> pessoaList;

        //construtor
        public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
        }

        public List<Pessoa> ordenarPorAltura() {
          if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            return pessoasPorAltura;
          } else {
            throw new RuntimeException("A lista está vazia!");
          }
        }
      }

#### Method Reference

- Method Reference é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.
- Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo “::” e o nome do método sem os parênteses no final.

      public class OrdenacaoPessoa {
        //atributo
        private List<Pessoa> pessoaList;

        //construtor
        public OrdenacaoPessoa() {
        thi s.pessoaList = new ArrayList<>();
        }

        public List<Pessoa> ordenarPorAltura() {
          if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
          } else {
            throw new RuntimeException("A lista está vazia!");
          }
        }
      }

#### Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.

- `Consumer<T>`: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

        public class ConsumerExample {
          public static void main(String[] args) {
            // Criar uma lista de números inteiros
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

              // Usar o Consumer com expressão lambda para imprimir números pares
              Consumer<Integer> imprimirNumeroPar = numero -> {
                if (numero % 2 == 0) {
                  System.out.println(numero);
                }
              };

              // Usar o Consumer para imprimir números pares no Stream
              numeros.stream_api().forEach(imprimirNumeroPar);
            }
        }

        public class ConsumerExample {
          public static void main(String[] args) {
            // Criar uma lista de números inteiros
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            // Usar o Consumer com uma classe anônima para imprimir números pares
            Consumer<Integer> imprimirNumeroPar = new Consumer<Integer>() {
              @Override
              public void accept(Integer numero) {
                if (numero % 2 == 0) {
                  System.out.println(numero);
                }
              }
            };

            // Usar o Consumer para imprimir números pares da lista
            for (Integer numero : numeros) {
              imprimirNumeroPar.accept(numero);
            }
          }
        }

- `Supplier<T>`: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

        public class SupplierExample {
          public static void main(String[] args) {
            // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
            Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

            // Usar o Supplier para obter uma lista com 5 saudações
            List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

            // Imprimir as saudações geradas
            listaSaudacoes.forEach(System.out::println);
          }
        }

        public class SupplierExample {
          public static void main(String[] args) {
            // Usar o Supplier com uma classe anônima para fornecer uma saudação personalizada
            Supplier<String> saudacao = new Supplier<String>() {
              @Override
              public String get() {
                return "Olá, seja bem-vindo(a)!";
              }
            };

            // Usar o Supplier para obter uma lista com 5 saudações
            List<String> listaSaudacoes = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
              listaSaudacoes.add(saudacao.get());
            }

            // Imprimir as saudações geradas
            for (String saudacaoGerada : listaSaudacoes) {
              System.out.println(saudacaoGerada);
            }
          }
        }

- `Function<T, R>`: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

        public class FunctionExample {
          public static void main(String[] args) {
            // Criar uma lista de números inteiros
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            // Usar a Function com expressão lambda para dobrar todos os números
            Function<Integer, Integer> dobrar = numero -> numero * 2;

            // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
            List<Integer> numerosDobrados = numeros.stream_api()
                .map(dobrar)
                .collect(Collectors.toList());

            // Imprimir a lista de números dobrados
            numerosDobrados.forEach(System.out::println);
          }
        }

        public class FunctionExample {
          public static void main(String[] args) {
            // Criar uma lista de números inteiros
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            // Usar a Function com uma classe anônima para dobrar todos os números
            Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {
              @Override
              public Integer apply(Integer numero) {
                return numero * 2;
              }
            };

            // Usar a função para dobrar todos os números e armazená-los em outra lista
            List<Integer> numerosDobrados = new ArrayList<>();
            for (Integer numero : numeros) {
              numerosDobrados.add(dobrar.apply(numero));
            }

            // Imprimir a lista de números dobrados
            for (Integer numeroDobrado : numerosDobrados) {
              System.out.println(numeroDobrado);
            }
          }
        }

- `Predicate<T>`: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.

        public class PredicateExample {
          public static void main(String[] args) {
          // Criar uma lista de números inteiros
          List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

              // Usar o Predicate com expressão lambda para filtrar números pares
              Predicate<Integer> isPar = numero -> numero % 2 == 0;

              // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
              List<Integer> numerosPares = numeros.stream_api()
                  .filter(isPar)
                  .collect(Collectors.toList());

              // Imprimir a lista de números pares
              numerosPares.forEach(System.out::println);
          }
        }

        public class PredicateExample {
          public static void main(String[] args) {
          // Criar uma lista de números inteiros
          List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

              // Usar o Predicate com uma classe anônima para filtrar números pares
              Predicate<Integer> isPar = new Predicate<Integer>() {
                @Override
                public boolean test(Integer numero) {
                  return numero % 2 == 0;
                }
              };

              // Usar o predicado para filtrar números pares e armazená-los em outra lista
              List<Integer> numerosPares = new ArrayList<>();
              for (Integer numero : numeros) {
                if (isPar.test(numero)) {
                  numerosPares.add(numero);
                }
              }

              // Imprimir a lista de números pares
              for (Integer numeroPar : numerosPares) {
                System.out.println(numeroPar);
              }
          }
        }

- `BinaryOperator<T>`: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

        public class BinaryOperatorExample {
          public static void main(String[] args) {
          // Criar uma lista de números inteiros
          List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

              // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
              BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

              // Usar o BinaryOperator para somar todos os números no Stream
              int resultado = numeros.stream_api()
                  .reduce(0, somar);

              // Imprimir o resultado da soma
              System.out.println("A soma dos números é: " + resultado);
          }
        }

        public class BinaryOperatorExample {
          public static void main(String[] args) {
          // Criar uma lista de números inteiros
          List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

              // Usar o BinaryOperator com classe anônima para somar dois números inteiros
              BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer num1, Integer num2) {
                  return num1 + num2;
                }
              };

              // Usar o BinaryOperator para somar todos os números no Stream
              int resultado = numeros.stream_api()
                  .reduce(0, somar);

              // Imprimir o resultado da soma
              System.out.println("A soma dos números é: " + resultado);
          }
        }

> Classe Anônima: A classe anônima em Java é uma classe não recebeu um nome e é tanto declarado e instanciado em uma única instrução. Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado apenas uma vez.

#### Stream API Java - Principais Métodos

Vamos praticar e aprofundar nossos conhecimentos na poderosa Stream API do Java!
Abaixo, apresentamos uma lista de desafios envolvendo operações com streams para exercitar suas habilidades e criatividade.

Para todos os desafios, utilizem a lista de números inteiros fornecida:

`List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);`

- Desafio 1 - Mostre a lista na ordem numérica:
  Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

- Desafio 2 - Imprima a soma dos números pares da lista:
  Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

- Desafio 3 - Verifique se todos os números da lista são positivos:
  Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

- Desafio 4 - Remova todos os valores ímpares:
  Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

- Desafio 5 - Calcule a média dos números maiores que 5:
  Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

- Desafio 6 - Verificar se a lista contém algum número maior que 10:
  Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

- Desafio 7 - Encontrar o segundo número maior da lista:
  Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

- Desafio 8 - Somar os dígitos de todos os números da lista:
  Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

- Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
  Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

- Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
  Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

- Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
  Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

- Desafio 12 - Encontre o produto de todos os números da lista:
  Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

- Desafio 13 - Filtrar os números que estão dentro de um intervalo:
  Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

- Desafio 14 - Encontre o maior número primo da lista:
  Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

- Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
  Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

- Desafio 16 - Agrupe os números em pares e ímpares:
  Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

- Desafio 17 - Filtrar os números primos da lista:
  Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

- Desafio 18 - Verifique se todos os números da lista são iguais:
  Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

- Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
  Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

**Instruções**:

- Cada desafio deverá ser implementado em classes separadas neste mesmo pacote.
- Os desafios podem ser executados individualmente a partir dos métodos main de cada classe.
- Utilize a Stream API para implementar as operações solicitadas em cada desafio.

Divirta-se resolvendo os desafios da Stream API do Java!
Dúvidas: [https://github.com/cami-la/ganhando_produtividade_com_Stream_API_Java/issues](https://github.com/cami-la/ganhando_produtividade_com_Stream_API_Java/issues)

#### Optional

O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser ausente (nulo). Ela foi introduzida a partir do Java 8 para evitar o temido NullPointerException (NPE) que é comum quando se trabalha com referências nulas. Optional permite encapsular um valor que pode ser nulo dentro de um objeto Optional. Isso indica explicitamente que o valor pode ou não estar presente e requer que o código que deseja acessá-lo faça uma verificação explícita.

- `of(value)`: Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.

        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());

- `ofNullable(value)`: Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.

        String nullableValue = null;
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue.isPresent());

- `empty()`: Retorna um Optional vazio (sem valor).

        Optional<String> optionalValue = Optional.empty();
        System.out.println(optionalValue.isPresent());

- `isPresent()`: Verifica se o Optional contém um valor não nulo.

        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.isPresent());

- `isEmpty()` (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).

        Optional<String> optionalValue = Optional.ofNullable(null);
        System.out.println(optionalValue.isEmpty());

- `get()`: Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.

        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());

- `orElse(defaultValue)`: Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);

- `orElseGet(supplier)`: Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);

- `orElseThrow(exceptionSupplier)`: Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));

- `ifPresent(consumer)`: Executa uma ação fornecida por um Consumer se o Optional contiver um valor.

        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
