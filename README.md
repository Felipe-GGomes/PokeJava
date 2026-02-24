# Mini Jogo de Pokémons em Java (console)
## Projeto simples em Java feito para revisar POO, herança e uso básico do VS Code com Java.

* Objetivo
1. Relembrar sintaxe de Java.
2. Praticar conceitos de Programação Orientada a Objetos:
3. classe base abstrata
4. herança
5. sobrescrita de métodos
6. Organizar o código em camadas simples (model / service / main).

* O que o projeto faz hoje
1. Mantém uma pequena “Pokédex” com 3 pokémons pré-cadastrados:
2. Charmander (Fogo)
3. Squirtle (Água)
4. Bulbasaur (Planta)
5. Mostra a lista no console.
6. Usuário escolhe um pokémon pelo número.

* O programa:
1. valida a escolha
2. mostra os atributos (nome, tipo, HP, ataque)
3. executa o ataque específico do pokémon escolhido.

Estrutura do projeto
```
src/
├─ main/
│   └─ Main.java          // ponto de entrada, interação com o usuário
├─ model/
│   ├─ Pokemon.java       // classe base abstrata (nome, tipo, hp, ataque)
│   ├─ PokemonFogo.java   // herda de Pokemon, ataque de fogo
│   ├─ PokemonAgua.java   // herda de Pokemon, ataque de água
│   └─ PokemonPlanta.java // herda de Pokemon, ataque de planta
└─ service/
    └─ PokedexService.java // lista de pokémons e acesso por índice
```

### Próximos passos planejados
* Implementar batalha 1x1:
1. método atacar(Pokemon alvo) diminuindo o HP do inimigo.
2. criação de um pokémon inimigo aleatório a partir da Pokédex.
3. Adicionar vantagem de tipo (Fogo x Água x Planta) com multiplicador de dano.
4. Melhorar interface de console (menus, repetição de partidas).

---README padrão do uso do Java no VSCODE abaixo ---

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
