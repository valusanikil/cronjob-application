# Greeting Scheduler Spring Boot Application  

This project is a Spring Boot-based application that demonstrates the integration of **scheduled tasks**, **RESTful APIs**, **asynchronous operations**, and **caching** to provide a robust and scalable solution for managing and automating processes. The main focus of the application is to schedule and execute jobs related to greeting entities, manage their lifecycle through RESTful services, and send emails using asynchronous mechanisms.  

### Key Features  

1. **Scheduled Jobs**  
   - Leverages Spring's `@Scheduled` annotation to automate tasks.  
   - Supports various scheduling configurations:  
     - **Cron Expressions**: Executes tasks at specific intervals (e.g., every 30 seconds).  
     - **Fixed Rate and Delays**: Defines tasks with a fixed execution interval or delay between executions.  

2. **RESTful APIs**  
   - Provides endpoints for managing `Greeting` entities.  
   - CRUD operations are exposed to create, read, update, and delete greetings.  
   - Includes error handling and proper HTTP response codes for seamless client interactions.  

3. **Asynchronous Email Service**  
   - Implements an asynchronous email service to send emails based on greeting data.  
   - Offers two options:  
     - **Asynchronous Execution**: Executes email-sending operations in the background.  
     - **Synchronous Execution with Future**: Provides a result for asynchronous operations when required.  

4. **Caching**  
   - Utilizes Spring Cache to improve application performance by caching frequently accessed `Greeting` data.  
   - Supports operations like evicting specific entries or clearing the entire cache.  

5. **Persistence with JPA and H2 Database**  
   - Integrates Spring Data JPA and Hibernate to manage entity persistence.  
   - Uses an H2 in-memory database for demonstration and development purposes.  

6. **Logging**  
   - Incorporates SLF4J with Logback for structured and detailed logging of application processes, including job execution, REST API interactions, and email operations.  

### Technologies Used  
- **Spring Boot**: Framework for developing production-ready applications.  
- **Spring Data JPA**: Simplifies database interactions.  
- **Hibernate**: ORM framework for entity persistence.  
- **Spring Cache**: Enables efficient caching for improved performance.  
- **H2 Database**: Lightweight in-memory database for development and testing.  
- **SLF4J/Logback**: Provides robust logging capabilities.  

### Application Workflow  
1. **Job Scheduling**:  
   The scheduler periodically invokes methods like `cronJob`, `fixedRateJobWithInitialDelay`, and `fixedDelayJobWithInitialDelay`, showcasing the flexibility of scheduling mechanisms in Spring.  

2. **API Interaction**:  
   Clients can use the RESTful API to interact with the `Greeting` entities, such as fetching a list of greetings, creating new ones, or deleting existing ones.  

3. **Email Processing**:  
   Greetings can be sent via email using the email service. The asynchronous mechanism ensures that the main thread is not blocked, and large email batches can be processed efficiently.  

4. **Caching and Database Management**:  
   The application employs Spring Cache for frequently accessed data and uses the H2 database to persist `Greeting` entity data.  

### Use Case  
This project serves as a comprehensive template for building Spring Boot applications that require scheduling, asynchronous operations, RESTful API design, and caching. It is ideal for applications needing task automation, email processing, and efficient resource management.
