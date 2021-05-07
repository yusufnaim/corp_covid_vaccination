INSERT INTO business_group (name) values ('People Group');
INSERT INTO pos_level (name) values ('Executive');
INSERT INTO department (name, id_business_group) values ('Human Resource (HR)', 1);
INSERT INTO vaccine (name) values ('Pfizer');
INSERT INTO vaccine (name) values ('Astra Zeneca');
INSERT INTO staff_user (name, nric, staff_id, id_pos_level, id_department) values
('Lailatul Mastura', '112233-44-5566', 'A00001B', 1, 1);

COMMIT;