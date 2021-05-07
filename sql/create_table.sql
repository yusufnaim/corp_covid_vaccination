DROP TABLE IF EXISTS pos_level;
CREATE TABLE pos_level (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25) NOT NULL,
    created_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_dt DATETIME DEFAULT CURRENT_TIMESTAMP
);

DROP TABLE IF EXISTS business_group;
CREATE TABLE business_group (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    created_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_dt DATETIME DEFAULT CURRENT_TIMESTAMP
);

DROP TABLE IF EXISTS vaccine;
CREATE TABLE vaccine (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25) NOT NULL,
    created_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_dt DATETIME DEFAULT CURRENT_TIMESTAMP
);

DROP TABLE IF EXISTS department;
CREATE TABLE department (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    id_business_group INT NOT NULL,
    created_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_business_group) REFERENCES business_group(uuid)
);

DROP TABLE IF EXISTS staff_user;
CREATE TABLE staff_user (
	uuid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    nric VARCHAR(14) NOT NULL,
    staff_id VARCHAR(25) NOT NULL,
    id_pos_level INT NOT NULL,
    id_department INT NOT NULL,
    created_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_pos_level) REFERENCES pos_level(uuid),
    FOREIGN KEY (id_department) REFERENCES department(uuid)
);

DROP TABLE IF EXISTS vaccination;
CREATE TABLE vaccination (
    uuid INT AUTO_INCREMENT PRIMARY KEY,
    id_staff_user INT NOT NULL,
    id_vaccine INT NOT NULL,
    first_dose DATETIME NOT NULL,
    second_dose DATETIME NOT NULL,
    created_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_dt DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_staff_user) REFERENCES staff_user(uuid),
    FOREIGN KEY (id_vaccine) REFERENCES vaccine(uuid)
);

COMMIT;