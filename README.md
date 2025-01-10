# scm
<h1>Smart Contact Manager</h1>
<h3>Project for storing and managing contacts on cloud.</h3>
<br>
<h2>Project MetaData</h2>
<p>Initialised the project using start.spring.io</p>
<ul>   
    <li>Project: Maven</li>
    <li>Language: Java</li>
    <li>SpringBoot: 3.4.1</li>
    <li>Group: com.scm.scm</li>
    <li>Artifact: scm</li>
    <li>Description: Project for storing and managing contacts on cloud.</li>
    <li>Packaging: Jar</li>
    <li>Dependencies:
        <br>
        <ul>
            <li>Spring Web</li>
            <li>Thymeleaf</li>
            <li>Spring Data JPA</li>
            <li>Validation</li>
            <li>Lombok</li>
            <li>Spring Boot DevTools</li>
            <li>MySQL Driver</li>
        </ul>
    </li>
</ul>
<br>
<h2>Things to Mind</h2>
<ul>
    <li>I have used MySQL database for this project if you alternate option, then go to application.properties file and make the necessary changes for running the project.</li>
    <li>spring.jpa.properties.hibernate.dialect is used to tell hibernate to generate the appropriate SQL queries with respect to specified database. For MySQL, it is not necessary to define it but for other it should be defined.</li>
    <li>Node and NPM must be installed locally or globally for this project. Refer the <a href="https://nodejs.org/">Node Official Website</a></li>
    <li>Tailwindcss setup steps follow from the documention <a href="tailwindcss.com/docs/installation</li">Tailwindcss Official Website</a></li>
    <li>Run the given command into the terminal: <br> <i>npx tailwindcss -i ./src/main/resources/static/css/input.css -o ./src/main/resources/static/css/output.css --watch </i><br> This will help to to scan your template files for classes and build your CSS.</li>
    <li>In Tailwindcss documentation, it is stating to include your output.css file in your template. but you must remember, since you are using thymeleaf, so you have to use th:href="/css/output.css" or data-th-href="/css/output.css"</li>
</ul>