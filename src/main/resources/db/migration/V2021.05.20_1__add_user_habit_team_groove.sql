CREATE TABLE "user" (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    create_date TIMESTAMP NOT NULL,
    last_login TIMESTAMP
);

CREATE TABLE "team" (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL
);

CREATE TABLE "habit" (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    user_id BIGINT REFERENCES "user" (id),
    activity_id INTEGER
);

CREATE TABLE "groove" (
    id BIGSERIAL PRIMARY KEY,
    habit_id BIGINT REFERENCES "habit" (id),
    date DATE NOT NULL
);
