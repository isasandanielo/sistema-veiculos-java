# Sistema de Veículos em Java

Projeto de estudo em Java que demonstra os principais conceitos de **Programação Orientada a Objetos (POO)** por meio de uma hierarquia de veículos: **herança**, **encapsulamento**, **sobrescrita de métodos** e **polimorfismo (ligação dinâmica)**.

## Estrutura do projeto

```
.
├── App.java                 # Classe principal (main) com exemplos de uso
├── Veiculo.java             # Superclasse com os atributos e comportamentos comuns
├── CarroCombustivel.java    # Subclasse: carro a combustão
└── CarroEletrico.java       # Subclasse: carro elétrico
```

### Diagrama de classes

```
            Veiculo
   (marca, modelo, ano, placa)
      buzinar() / exibirInfo()
          ▲              ▲
          │              │
 CarroCombustivel    CarroEletrico
 (temTurbo,          (capacidadeBateriaKwh)
  cilindradas)       buzinar() e exibirInfo()
 exibirFichaTecnica()   sobrescritos
```

## Descrição das classes

### `Veiculo`
Classe base que representa um veículo genérico.

- **Atributos privados:** `marca`, `modelo`, `ano`, `placa`
- **Encapsulamento:** acesso por meio de *getters* e *setters*, com validações simples nos setters (exibem "Invalido" quando o valor não é aceito)
- **Construtor:** recebe marca, modelo, ano e placa
- **Métodos:**
  - `buzinar()`: imprime a buzina padrão de um veículo
  - `exibirInfo()`: imprime o modelo e a marca

### `CarroCombustivel` (herda de `Veiculo`)
Representa um carro movido a combustível.

- **Atributos próprios:** `temTurbo` (boolean) e `cilidradas` (int)
- **Construtor:** chama `super(...)` para inicializar os dados da superclasse e depois define os atributos próprios
- **Métodos:**
  - `exibirFichaTecnica()`: imprime modelo, marca, ano, placa, cilindradas e se tem turbo
  - **Não sobrescreve** `buzinar()`, então usa a versão herdada de `Veiculo`

### `CarroEletrico` (herda de `Veiculo`)
Representa um carro elétrico.

- **Atributo próprio:** `capacidadeBateriaKwh` (double)
- **Sobrescrita (`@Override`):**
  - `buzinar()`: imprime uma mensagem de buzina silenciosa/alerta sonoro de pedestres
  - `exibirInfo()`: reaproveita `super.exibirInfo()` e acrescenta a capacidade da bateria

### `App`
Classe com o método `main`, que:

1. Cria um `CarroCombustivel`, exibe sua ficha técnica e chama `buzinar()`
2. Cria um `CarroEletrico`, chama `buzinar()` e `exibirInfo()`
3. Monta um vetor `Veiculo[]` (frota) com objetos de tipos diferentes e percorre chamando `buzinar()` em cada um, demonstrando o polimorfismo

## Conceitos demonstrados

| Conceito | Onde aparece |
|---|---|
| **Herança** | `CarroCombustivel` e `CarroEletrico` estendem `Veiculo` |
| **Encapsulamento** | Atributos `private` com getters e setters |
| **Construtores e `super(...)`** | Subclasses chamam o construtor da superclasse, que é obrigatório pois `Veiculo` não tem construtor sem parâmetros |
| **Sobrescrita (`@Override`)** | `buzinar()` e `exibirInfo()` em `CarroEletrico` |
| **Polimorfismo / Dynamic Binding** | Vetor `Veiculo[]` no `App`: a JVM escolhe em tempo de execução qual `buzinar()` executar, conforme o tipo real do objeto |

### Sobre o Dynamic Binding

No loop `for (Veiculo v : frota) { v.buzinar(); }`, a variável `v` é do tipo `Veiculo` (tipo estático, verificado na compilação). Em tempo de execução, a JVM olha o **tipo real** do objeto:

- `CarroEletrico` tem `buzinar()` próprio, então executa a versão sobrescrita.
- `CarroCombustivel` e `Veiculo` não sobrescrevem, então executa a versão de `Veiculo`.

Assim, o mesmo comando executa comportamentos diferentes para cada objeto.

## Como compilar e executar

Pré-requisito: **JDK 8 ou superior** instalado.

```bash
javac *.java
java App
```

## Exemplo de saída

```
Modelo: Polo
Marca: VW
Ano: 2019
Placa: EVO9B58
Cilindradas: 999
Tem turbo? true
Buzina padão de veículo
Buzina silenciosa/alerta sonoro de pedestres
Modelo: Song Pro
Marca: BYD
Capacidade da bateria: 26.6
Buzina padão de veículo
Buzina silenciosa/alerta sonoro de pedestres
Buzina padão de veículo
```

## Tecnologias

- Java (sem dependências externas)
