# TP1 - Systèmes Parallèles et Distribués (2025)

Description
-----------
Ce dépôt contient le travail du TP1 pour le cours « Systèmes Parallèles et Distribués » (2025). L'objectif principal est d'illustrer l'utilisation d'Apache Kafka avec une application Java Spring (producteur / consommateur), montrer la configuration des topics, la sérialisation des messages (ex. JSON) et fournir des exemples d'envoi/réception de messages pour tester le flux asynchrone.

Technologies (présentes / attendues)
------------------------------------
- Java (code principal)
- Spring Boot (microservice producteur/consommateur)
- Apache Kafka (broker, topics)
- HTML (pages statiques si présentes)
- (Optionnel) Docker / Docker Compose pour démarrer Kafka rapidement

But du TP
---------
- Concevoir une application Java Spring qui produit et consomme des messages via Kafka.
- Configurer un ou plusieurs topics et démontrer l'échange asynchrone de messages.
- Tester la fiabilité minimale : envoi, consommation et logs.
- Documenter l'installation et fournir des captures d'écran illustrant le fonctionnement.

Prérequis
---------
- Java 11 ou supérieur installé
- Maven ou Gradle (selon le système de build du projet) ou utiliser un IDE (IntelliJ, Eclipse)
- Un broker Kafka accessible (local ou distant)
  - Exemple rapide : démarrer Kafka via Docker Compose (voir section Exécution)
- Outils utiles : cURL, Postman, kafka-topics.sh, docker, docker-compose

Installation et exécution (exemples)
-----------------------------------
1. Cloner le dépôt
   - git clone https://github.com/omarelkadiri/kafka-spring.git

2. Démarrer Kafka (option A : Docker Compose)
   - Créer un fichier `docker-compose.yml` (si vous n’en avez pas) avec Zookeeper + Kafka, puis :
     - docker-compose up -d
   - Vérifier que Kafka fonctionne :
     - docker ps
     - Ou : kafka-topics.sh --bootstrap-server localhost:9092 --list

3. Construire et lancer l'application
   - Si Maven :
     - mvn clean package
     - mvn spring-boot:run
   - Ou lancer depuis votre IDE.

4. Tester l'envoi de messages
   - Si l'application expose un endpoint HTTP (ex. POST /api/messages) : utiliser curl ou Postman pour poster un JSON.
   - Exemple :
     - curl -X POST http://localhost:8080/api/messages -H "Content-Type: application/json" -d '{"id":1,"text":"Bonjour Kafka"}'

5. Observer les logs
   - Vérifier la console du producteur (envoi) et du consommateur (réception).
   - Utiliser kafka-console-consumer.sh pour voir les messages dans un topic :
     - kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mon-topic --from-beginning

Exemples d'usage attendus
-------------------------
- Endpoint HTTP pour produire un message vers Kafka.
- Service Consumer qui traite/affiche les messages reçus.
- Configuration du topic dans application.properties / application.yml.

Structure suggérée du dépôt
---------------------------
- src/main/java/... : code Java (producteur, consommateur, config Kafka)
- src/main/resources/application.properties : configuration Kafka
- src/main/resources/static : pages HTML
- screenshots/ : captures d'écran et diagrammes
- README.md : ce fichier





captures d'écran
-----------------------------


