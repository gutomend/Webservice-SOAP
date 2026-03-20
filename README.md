# Webservice-SOAP
Webservice SOAP (CP1)
# 🍷 Winery WebService SOAP

## 👥 Integrantes

| Nome               | RM     |
|--------------------|--------|
| Gustavo Oliveira   | 559163 |
| Gabriel Vasquez    | 557056 |
| Augusto Mendonça   | 558371 |

---

## 🎯 Objetivo

Este projeto tem como objetivo aplicar os conceitos de **Arquitetura Orientada a Serviços (SOA)** e **Web Services SOAP**, por meio da criação de serviços no lado **Publisher (Servidor)** e consumo desses serviços no lado **Client (Consumidor)**.

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Maven
* JAX-WS (SOAP)
* Jakarta Web Services

---

## 📂 Estrutura do Projeto

O projeto está organizado em três partes principais:

```
Winery/
├── Publisher/
│   └── WinerySys (Servidor SOAP)
│
├── Consumer/
│   ├── WineStockClient (Cliente - consulta menu)
│   └── WineOrderClient (Cliente - realiza pedidos e avisos)
```

---

## 🚀 Funcionalidades

### 🔹 Serviço 1 – WineStockService

* `getMenu()`: Retorna o menu de vinhos disponíveis
* `placeOrder(String name, int quantity)`: Realiza um pedido

### 🔹 Serviço 2 – WineWarningService

* `sendWarn()`: Retorna aviso de estoque insuficiente

---

## 🌐 Endpoints

* WineStockService:

  ```
  http://localhost:8085/WineStockService
  ```

* WineWarningService:

  ```
  http://localhost:8086/WineWarningService
  ```

---

## ▶️ Como Executar

### 1️⃣ Subir o servidor (Publisher)

1. Acesse o projeto `WinerySys`
2. Execute a classe:

```
Loader.java
```

3. Verifique no console:

```
Serviço publicado!
```

---

### 2️⃣ Executar cliente de consulta

1. Acesse o projeto:

```
WineStockClient
```

2. Execute:

```
ApplicationClient1.java
```

3. Resultado esperado:

* Exibição do menu de vinhos no console

---

### 3️⃣ Executar cliente de pedidos

1. Acesse o projeto:

```
WineOrderClient
```

2. Execute:

```
ApplicationClient2.java
```

3. Resultado esperado:

* Confirmação do pedido
* Aviso de estoque insuficiente

---

## ⚙️ Configurações Importantes

* Dependência principal:

```xml
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
</dependency>
```

* Plugin utilizado para geração de classes a partir do WSDL:

```xml
jaxws-maven-plugin
```

---

## 📌 Conceitos Aplicados

* Arquitetura SOA
* Web Services SOAP
* WSDL (Web Service Description Language)
* Publicação de serviços com `Endpoint`
* Consumo de serviços com `Service` e `QName`

---
