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

Esse tipos são considerados objetos, e portanto, representam valores brutos.

#### Númericos Inteiros e decimais

#### Tipos lógicos

#### Caracteres

#### Objetos

#### Diferença entre variável e constante
