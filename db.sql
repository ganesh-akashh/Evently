

-- Create the database
create database evently;

-- Use the database
use evently;



--Create user table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    photo VARCHAR(1025)
);

-- Create event table
CREATE TABLE events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    location VARCHAR(255),
    created_at DATETIME,
    image_url VARCHAR(255),
    start_date_time DATETIME,
    end_date_time DATETIME,
    price VARCHAR(50),
    is_free BOOLEAN,
    url VARCHAR(255),
    category_id INT,
    organizer_id INT,
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (organizer_id) REFERENCES users(id)
);


-- Create category table
CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create Orders table
CREATE TABLE Orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    stripe_id VARCHAR(255) UNIQUE NOT NULL,
    total_amount VARCHAR(50),
    event_id INT,
    buyer_id INT,
    FOREIGN KEY (event_id) REFERENCES events(id),
    FOREIGN KEY (buyer_id) REFERENCES users(id)
);


-- Insert UserTable value
INSERT INTO users (email, password, user_name, first_name, last_name, photo) VALUES
('user1@example.com', 'password1', 'user1', 'John', 'Doe', 'photo1.jpg'),
('user2@example.com', 'password2', 'user2', 'Jane', 'Smith', 'photo2.jpg'),
('user3@example.com', 'password3', 'user3', 'Mike', 'Johnson', 'photo3.jpg');

-- Insert EventTable value
INSERT INTO events (title, description, location, created_at, image_url, start_date_time, end_date_time, price, is_free, url, category_id, organizer_id) VALUES
('Event 1', 'Description for event 1', 'Location 1', NOW(), 'image1.jpg', NOW(), NOW(), '20', false, 'https://event1.com', 1, 1),
('Event 2', 'Description for event 2', 'Location 2', NOW(), 'image2.jpg', NOW(), NOW(), '10', true, 'https://event2.com', 2, 2),
('Event 3', 'Description for event 3', 'Location 3', NOW(), 'image3.jpg', NOW(), NOW(), '15', false, 'https://event3.com', 1, 3);

-- Insert CategoryTable value
INSERT INTO category (name) VALUES
('Category 1'),
('Category 2'),
('Category 3');

-- Insert Orders value
INSERT INTO Orders (stripe_id, total_amount, event_id, buyer_id) VALUES
('stripe_id_1', '20', 1, 1),
('stripe_id_2', '10', 2, 2),
('stripe_id_3', '15', 3, 3);
