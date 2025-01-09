# scm
<h1>SCM: Smart Contact Manager</h1>
<h3>Project for storing and managing contacts on cloud.</h3>
<br>
<h2>Project MetaData</h2>
<p>Initialised the project using start.spring.io</p>
<dl>
    <dt>Project</dt><dd>Maven</dd>
    <dt>Language</dt><dd>Java</dd>
    <dt>SpringBoot</dt><dd>3.4.1</dd>
    <dt>Group</dt><dd>com.scm.scm</dd>
    <dt>Artifact</dt><dd>scm</dd>
    <dt>Description</dt><dd>Project for storing and managing contacts on cloud.</dd>
    <dt>Packaging</dt><dd>Jar</dd>
    <dt>Dependencies</dt>
        <dd>
            <ul>
                <li>Spring Web</li>
                <li>Thymeleaf</li>
                <li>Spring Data JPA</li>
                <li>Validation</li>
                <li>Lombok</li>
                <li>Spring Boot DevTools</li>
                <li>MySQL Driver</li>
            </ul>
        </dd>
</dl>
<br>
<h2>Things to Mind</h2>
<ul>
    <li>I have used MySQL database for this project if you alternate option, then go to application.properties file and make the necessary changes for running the project.</li>
    <li>spring.jpa.properties.hibernate.dialect is used to tell hibernate to generate the appropriate SQL queries with respect to specified database. For MySQL, it is not necessary to define it but for other it should be defined.</li>
</ul>