CREATE TABLE USERS (
    id INT PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    pass_word VARCHAR(255) NOT NULL
);

CREATE TABLE task (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    completed BOOLEAN NOT NULL,
    create_at TIMESTAMP NOT NULL
);

INSERT INTO USERS (id, user_name, email, pass_word)
VALUES (1, 'admin', 'admin@example.com', '12345');

INSERT INTO task (title, description, completed, create_at)
VALUES ('Complete Study', 'Finish studying SQL and JPA.', false, CURRENT_TIMESTAMP);

