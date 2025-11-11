# Teste Técnico QA – Blog do Agi (Java + Selenium + JUnit5)

Automação de testes Web para o blog https://blogdoagi.com.br/.

## Cenários implementados
1. **Pesquisa com resultados** — pesquisa por "cartão" e valida que há resultados.
2. **Pesquisa sem resultados** — pesquisa por termo inexistente e valida mensagem de "nada encontrado".

## Como executar localmente
Requisitos:
- Java 17+
- Maven
- Chrome (instalado)

```bash
# clonar
git clone https://github.com/MauricioCLMonteiro/blogdoagi-qa-java.git
cd blogdoagi-qa-java

# executar
mvn test
```

> Observação: o WebDriverManager baixa automaticamente o ChromeDriver compatível.

## Rodando headless
Edite `DriverFactory` e descomente a linha `options.addArguments("--headless=new");` para execução sem UI.

## CI
Um workflow GitHub Actions foi adicionado em `.github/workflows/ci.yml` para executar `mvn test` em pushes e PRs.
