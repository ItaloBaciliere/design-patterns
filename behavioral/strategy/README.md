# 🧠 Design Patterns - Strategy

This repository demonstrates the 
**Strategy Pattern** in Java using Spring Boot.

The **Strategy Pattern** is a behavioral design
pattern that enables selecting an algorithm’s 
behavior at runtime. It defines a family of algorithms,
encapsulates each one, and makes them interchangeable 
without altering the code that uses them.

> 📌 In this project, we simulate a **notification service**
> that can send messages via different channels (e.g., Email, 
> SMS, Push) by dynamically selecting the notification strategy.

## 📚 Strategy Pattern Overview

    “Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.” – GoF

In this example:

* NotificationService delegates the logic to a strategy 
* NotificationStrategy is the common interface 
* Strategies like EmailNotification, SmsNotification, and DiscordNotification implement different behaviors

This pattern improves code flexibility and scalability while keeping responsibilities well-separated.

[Guru - Strategy](https://refactoring.guru/design-patterns/strategy)



# 🛠 Technologies Used

| Tecnologia                            | Versão         |
|---------------------------------------|----------------|
| ☕ **Java**                           | 21             |
| 🌱 **Spring Boot**                    | 3.4.5          |
| 🧰 **Maven**                          | Latest Version |
| 🐳 **Docker**                         | Latest Version |
| 📫 **Postman (for testing)**          | Latest Version |

 

# 🚀 How to Run the Application

To package the project and generate the `.jar` file, run:
```shell
mvn clean install
```

To build the Docker image (without using the cache):
```bash
docker-compose build --no-cache
```

To start the application:
```shell
docker-compose up
```

Once the app is running, it will be available at:

http://localhost/v1/notifications



# 📬 How to Use the API

In the postman_collection folder,
you’ll find a Postman collection 
with example REST calls to test the application.

Each request allows you to send a notification 
by specifying the channel (e.g., EMAIL, SMS, DISCORD),
destination, and message content.



## 👨‍💻 Author
Made with ❤️ by Ítalo Baciliere \
[LinkedIn](https://www.linkedin.com/in/italobaciliere/) • [GitHub](https://github.com/ItaloBaciliere)