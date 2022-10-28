CREATE TABLE student (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(100),
    "address" VARCHAR(100),
    "phone" VARCHAR(10),
    "created_by" VARCHAR(50),
    "created_date" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    "updated_by" VARCHAR(50),
    "updated_date" TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
