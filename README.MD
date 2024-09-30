# Java Spring Boot 🍃

The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform.


## Generate Project

Go to [Spring Boot Starter Kit](https://start.spring.io/)





## Basic Terms 📚

### IoC - Inversion of Control

is a principle in software development **that shifts control of object creation and lifecycle management from classes themselves to an external entity or framework**, such as Spring Framework or Laravel in PHP.

### DI - Dependency Injection

Dependency Injection (DI) is a **practical implementation** of IoC where the IoC container **injects dependencies into classes** rather than classes creating dependencies themselves. Types of DI include constructor injection, setter injection, and interface injection.

Here are the example the example implementation :

> Conventional Approach

```java
public class UserService {
    private UserRepository userRepository = new UserRepository(); // Dependency created directly

    // Other methods that use userRepository
}
```

> Here, **UserService** creates an instance of **UserRepository** directly, which makes **UserService** tightly coupled to **UserRepository**.

### IoC in Spring

IoC in Spring Boot takes a different approach. Instead of classes creating their own dependencies, Spring manages and injects these dependencies into classes. This is achieved through dependency injection (DI), a key aspect of IoC. Let's rewrite the UserService example using Spring Boot:

```java
@Service
public class UserService {
    private final UserRepository userRepository; // Dependency injected

    // Constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Other methods that use userRepository
}

```

> Spring Boot IoC container is responsible for providing an instance of UserRepository and injecting it into UserService.
