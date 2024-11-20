# Conversor de Moedas 💱

Um projeto simples e prático em **Java** para realizar conversões de moedas em tempo real, utilizando uma **API de taxas de câmbio**. Este projeto reforça conceitos como consumo de APIs, manipulação de JSON, logging eficiente, e boas práticas de desenvolvimento.

---

## 🚀 Funcionalidades
- Conversão dinâmica entre várias moedas.
- Taxas de câmbio atualizadas em tempo real via API.
- Validação de entradas do usuário para garantir segurança e consistência.
- Menu interativo no console com múltiplas opções de conversão.
- Suporte a múltiplas conversões sem reiniciar o programa.
- Logging robusto com `java.util.logging`.

---

## 🛠️ Tecnologias Utilizadas
- **Java** (JDK 17 ou superior)
- **HttpClient** para requisições HTTP.
- **Gson** para manipulação de dados JSON.
- **java.util.logging** para logging eficiente.
- API de taxas de câmbio: [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 📂 Estrutura do Projeto

    . ├── src/ │ 
    
    ├── currencyconverter/ │ 
    ├── ApiClient.java // Consome a API de taxas de câmbio │ 
    ├── CurrencyData.java // Modela os dados retornados pela API │ 
    ├── CurrencyConverter.java // Menu interativo para conversões │ 
    ├── Main.java // Classe principal para execução 
    ├── lib/ // Dependências externas (como gson-2.10.1.jar) 
    ├── .env // Chave de API ├── README.md // Documentação do projeto 
    ├── .gitignore // Arquivos ignorados no Git

---

## 🔧 Configuração e Uso

### **1. Configurar o Ambiente**
1. Certifique-se de que o JDK 17 ou superior está instalado.
2. Baixe e adicione o JAR da biblioteca Gson à pasta `lib/` ou configure no `pom.xml`/`build.gradle`.

### **2. Obter a Chave da API**
1. Registre-se na [ExchangeRate-API](https://www.exchangerate-api.com/) para obter uma chave gratuita.
2. Crie um arquivo `.env` na raiz do projeto com o seguinte conteúdo:

       API_KEY=YOUR_API_KEY

### **3. Executar o Projeto**
1. Compile o projeto:

        javac src/currencyconverter/*.java

2. Execute o programa:

        java src.currencyconverter.Main

🧑‍💻 Exemplos de Uso

Menu interativo:

![](https://i.imgur.com/2mS2kZO.png)

---

## 🔍 Boas Práticas Implementadas

Logging robusto: Em vez de printStackTrace, utilizamos java.util.logging para melhorar o diagnóstico e manutenibilidade.
Formatação eficiente de strings: Substituímos concatenações por String.format() e System.out.printf().
Estrutura modular: Código dividido em classes responsáveis por funções específicas, seguindo princípios de coesão.

---

## 🔮 Melhorias Futuras

Criar uma interface gráfica com JavaFX.
Adicionar suporte a histórico de conversões.
Implementar gráficos para análise de variações cambiais.

---

## 🤝 Contribuições

Sinta-se à vontade para sugerir melhorias ou contribuir com o projeto. Crie uma issue ou envie um pull request! 😊

---

## 📜 Licença

Este projeto é open-source e está sob a licença MIT.

---
