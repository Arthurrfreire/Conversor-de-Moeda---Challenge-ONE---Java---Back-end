# **Conversor de Moedas**

## **Descrição**
O **Conversor de Moedas** é uma aplicação em Java que permite ao usuário realizar conversões dinâmicas entre diferentes moedas, utilizando taxas de câmbio em tempo real obtidas de uma API externa. A aplicação oferece uma interface textual amigável via console, permitindo múltiplas conversões de forma prática e eficiente.

---

## **Funcionalidades**
- Realizar conversões entre diferentes moedas.
- Taxas de câmbio dinâmicas obtidas de uma API em tempo real.
- Listar moedas disponíveis.
- Interface textual amigável com validação de entradas do usuário.
- Permitir múltiplas conversões sem reiniciar o programa.

---

## **Tecnologias Utilizadas**
- **Java**: Linguagem principal.
- **HttpClient**: Para consumo da API.
- **Gson**: Para manipulação de dados JSON.
- **API Externa**: [Exchangerate-API](https://www.exchangerate-api.com/).

---

## **Como Funciona**
1. O programa consome dados de uma API de taxas de câmbio.
2. O JSON retornado é processado utilizando a biblioteca Gson.
3. O usuário interage com o programa via console, escolhendo moedas de origem e destino, e inserindo o valor a ser convertido.
4. O programa calcula o valor convertido com base nas taxas de câmbio e exibe o resultado.

---

## **Pré-requisitos**
Antes de executar o projeto, certifique-se de ter instalado:
- Java 8 ou superior.
- IntelliJ IDEA ou outro IDE para Java.
- Biblioteca Gson (adicionada ao projeto como dependência).

---

## **Como Executar o Projeto**
1. Clone o repositório ou copie os arquivos do projeto.
2. Adicione a biblioteca Gson ao projeto:
    - Usando Maven/Gradle ou manualmente, baixando o JAR da [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson).
3. Compile e execute o arquivo `Main.java` no IntelliJ IDEA ou outro IDE de sua escolha.
4. Siga as instruções no console:
    - Digite a moeda de origem.
    - Digite a moeda de destino.
    - Insira o valor a ser convertido.

---

## **Estrutura do Projeto**

src/ ├── ApiClient.java // Lida com a requisição à API 
    ├── CurrencyData.java // Processa os dados retornados pela API 
    ├── CurrencyConverter.java // Contém a lógica de conversão 
    ├── Main.java // Ponto de entrada do programa


---

## **Exemplo de Uso**
Ao executar o programa, você verá uma interface como esta:

Bem-vindo ao Conversor de Moedas! Digite a moeda de origem (ex: USD) ou 'sair' para encerrar:

USD Digite a moeda de destino (ex: BRL): BRL Digite o valor a ser convertido: 100 Resultado: 100.00 USD é equivalente a 500.00 BRL

---

## **Contribuindo**
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

1. Faça um fork do repositório.
2. Crie um branch para sua funcionalidade (`git checkout -b feature/nova-funcionalidade`).
3. Faça o commit das alterações (`git commit -m 'Adicionei uma nova funcionalidade'`).
4. Faça o push para o branch (`git push origin feature/nova-funcionalidade`).
5. Abra um pull request.

---

## **Licença**
Este projeto é de uso livre e aberto. Sinta-se à vontade para utilizá-lo e adaptá-lo às suas necessidades.

---

## **Contato**
Caso tenha dúvidas ou sugestões, entre em contato:

- **Email**: [seu-email@example.com](mailto:arthur.ramalho.freire@gmail.com)
- **LinkedIn**: [Seu Perfil](https://www.linkedin.com/in/arthurramalhofreire/)