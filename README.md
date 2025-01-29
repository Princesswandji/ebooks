# Projet Ebooks

## Prérequis

- Java 11 ou supérieur
- Maven
- MySQL

## Installation

1. Clonez le dépôt :
    ```bash
    git clone https://github.com/Princesswandji/ebooks.git
    cd votre-repo
    ```

2. Copiez le fichier [.env.example](http://_vscodecontentref_/0) en [.env](http://_vscodecontentref_/1) :
    ```bash
    cp .env.example .env
    ```

3. Modifiez le fichier [.env](http://_vscodecontentref_/2) avec vos informations de base de données :
    ```bash
    SPRING_DATASOURCE_HOST=localhost
    SPRING_DATASOURCE_PORT=3306
    SPRING_DATASOURCE_USERNAME=votre-username
    SPRING_DATASOURCE_PASSWORD=votre-password
    DB_DATABASE=ebooks
    SPRING_DATASOURCE_URL=jdbc:mysql://${SPRING_DATASOURCE_HOST}:${SPRING_DATASOURCE_PORT}/${DB_DATABASE}
    ```

4. Installez les dépendances Maven :
    ```bash
    ./mvnw clean install
    ```

## Utilisation

1. Démarrez l'application :
    ```bash
    ./mvnw spring-boot:run
    ```

2. L'application sera disponible à l'adresse suivante :
    ```
    http://localhost:8080
    ```

## Endpoints

- `GET /ebooks` : Récupère la liste des ebooks
- `GET /ebooks/{ebookId}` : Récupère un ebook par son ID
- `POST /ebooks` : Ajoute un nouvel ebook

## Contribuer

1. Forkez le projet
2. Créez votre branche feature (`git checkout -b feature/AmazingFeature`)
3. Commitez vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Poussez votre branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request
