
Table of Contents:

1.Introduction(#introduction)
2.TechStack(#techstack)
3.Installation(#installation)
4.
5.

## <a name="#introduction">🤡 Introduction</a>
Built on Next.js 14 and SpringBoot, the events application stands as a comprehensive, full-stack platform for managing events. It serves as a hub, spotlighting diverse events taking place globally. Featuring seamless payment processing through Stripe, you have the capability to purchase tickets for any event or even initiate and manage your own events.



## <a name="#techstack">🚀 TechStack</a>
1.React JS.
2.SpringBOOT.
3.Tailwind CSS.
4.ShadcnUI.


## <a name="#installtion">🖥️ Installation</a>

Follow these steps to set up the project locally on your machine.

**Client Next-JS  App**

1.Navigate to the client directory:
```bash
cd client
```
2.Install dependencies:
```bash
npm i
```

3.Start the Next-JS App:
```bash
npm run dev
```


**Server SpringBoot App**

1.Navigate to the server directory:
```bash
cd client
```

2. Update MySQL Configuration:
    - Open the `application.properties` file in the `server/src/main/resources` directory.
    - Modify the `username` and `password` fields to match your MySQL Workbench credentials:
        ```properties
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        ```

3. Start the Spring Boot application:
    - Run the main Java file of your Spring Boot application. Typically, this involves running the `main` method in your IDE.





