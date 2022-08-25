CREATE TABLE plumbers
(
    id     serial PRIMARY KEY,
    name   VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    score INTEGER NOT NULL
);

INSERT INTO plumbers(name, status, score) VALUES('Mario', 'AVAILABLE', 1);
INSERT INTO plumbers(name, status, score) VALUES('Luigi', 'AVAILABLE', 1);
INSERT INTO plumbers(name, status, score) VALUES('Kate', 'AVAILABLE', 1);
INSERT INTO plumbers(name, status, score) VALUES('Harry', 'AVAILABLE', 1);
INSERT INTO plumbers(name, status, score) VALUES('Thomas', 'AVAILABLE',1);
INSERT INTO plumbers(name, status, score) VALUES('Mary', 'AVAILABLE',1);