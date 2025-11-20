DROP DATABASE IF EXISTS CarDealership;
CREATE DATABASE CarDealership;
USE CarDealership;


---------------------------------------------------------------
-- TABLE 1: dealerships
---------------------------------------------------------------
CREATE TABLE dealerships (
    dealership_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    address VARCHAR(50),
    phone VARCHAR(12)
);


---------------------------------------------------------------
-- TABLE 2: vehicles
---------------------------------------------------------------
CREATE TABLE vehicles (
    VIN VARCHAR(17) PRIMARY KEY,
    make VARCHAR(50),
    model VARCHAR(50),
    year INT,
    color VARCHAR(20),
    mileage INT,
    price DECIMAL(10,2),
    SOLD BOOLEAN DEFAULT FALSE
);


---------------------------------------------------------------
-- TABLE 3: inventory
-- Tracks which dealership has which vehicle
---------------------------------------------------------------
CREATE TABLE inventory (
    dealership_id INT,
    VIN VARCHAR(17),
    PRIMARY KEY (dealership_id, VIN),
    FOREIGN KEY (dealership_id) REFERENCES dealerships(dealership_id),
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);


---------------------------------------------------------------
-- TABLE 4: sales_contracts
---------------------------------------------------------------
CREATE TABLE sales_contracts (
    contract_id INT AUTO_INCREMENT PRIMARY KEY,
    VIN VARCHAR(17),
    customer_name VARCHAR(50),
    sale_price DECIMAL(10,2),
    sale_date DATE,
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);


---------------------------------------------------------------
-- TABLE 5 (OPTIONAL): lease_contracts
---------------------------------------------------------------
CREATE TABLE lease_contracts (
    contract_id INT AUTO_INCREMENT PRIMARY KEY,
    VIN VARCHAR(17),
    customer_name VARCHAR(50),
    lease_start DATE,
    lease_end DATE,
    monthly_payment DECIMAL(10,2),
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);


---------------------------------------------------------------
-- STEP 3: INSERT SAMPLE DATA
---------------------------------------------------------------

-- Dealerships
INSERT INTO dealerships (name, address, phone)
VALUES
('Prime Auto', '123 Main St', '555-111-2222'),
('Elite Motors', '456 Oak Ave', '555-333-4444'),
('City Cars', '789 Pine Rd', '555-555-6666');


-- Vehicles
INSERT INTO vehicles (VIN, make, model, year, color, mileage, price, SOLD)
VALUES
('1HGCM82633A123456', 'Honda', 'Accord', 2018, 'Blue', 45000, 18000.00, FALSE),
('2T1BURHE5GC765432', 'Toyota', 'Corolla', 2020, 'White', 20000, 19500.00, FALSE),
('1FAFP404X1F123789', 'Ford', 'Mustang', 2016, 'Red', 60000, 23000.00, TRUE),
('3VW2K7AJ5FM245678', 'Volkswagen', 'Jetta', 2019, 'Black', 30000, 17500.00, FALSE);


-- Inventory (which dealership has which vehicle)
INSERT INTO inventory (dealership_id, VIN)
VALUES
(1, '1HGCM82633A123456'),
(1, '2T1BURHE5GC765432'),
(2, '1FAFP404X1F123789'),
(3, '3VW2K7AJ5FM245678');


-- Sales Contracts
INSERT INTO sales_contracts (VIN, customer_name, sale_price, sale_date)
VALUES
('1FAFP404X1F123789', 'John Doe', 22000.00, '2024-05-14');


-- Lease Contracts (optional)
INSERT INTO lease_contracts (VIN, customer_name, lease_start, lease_end, monthly_payment)
VALUES
('3VW2K7AJ5FM245678', 'Sarah Smith', '2024-01-01', '2027-01-01', 299.99);