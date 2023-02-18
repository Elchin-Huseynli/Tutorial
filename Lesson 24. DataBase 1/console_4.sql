create database div_academy;                                -- database yaradiriq

create table student(                                       -- student cedveli yaradariq
    id serial primary key,
    name varchar,
    surname varchar,
    subject varchar,
    monthly_payment int,
    start_date date,
    leave_date date,
    create_date timestamp,
    update_date timestamp,
    status int
);

create table teacher(                                       -- teacher cedveli yaradiriq
    id serial primary key,
    name varchar,
    surname varchar,
    subject varchar,
    salary int,
    start_date date,
    leave_date date,
    create_date timestamp,
    update_date timestamp,
    status int
);

create table staff(                                       -- staff cedveli yaradiriq
    id serial primary key,
    name varchar,
    surname varchar,
    position varchar,
    salary int,
    start_date date,
    leave_date date,
    create_date timestamp,
    update_date timestamp,
    status int
);

INSERT INTO student (name, surname,subject,monthly_payment,start_date,create_date,status) values    --setirler daxil edirik
('Elchin','Huseynli','Java',390,('2022-11-19'),now(),1), ('Nihat','Guliyev','Java',390,('2022-11-19'),now(),1),
('Xadica','Madnayeva','Java',390,('2022-11-19'),now(),1), ('Ali','Balayev','HTML',180,('2022-11-19'),now(),1),
('Shovgu','Huseynli','C++',450,('2022-11-19'),now(),1), ('Shehla','Abdullayeva','Python',400,('2022-11-19'),now(),1),
('Husniyya','Gasimova','HTML',270,('2022-11-19'),now(),1), ('Ali','Cafarov','C#',290,('2022-11-19'),now(),1),
('Tarlala','Ramazanova','JavaScript',350,('2022-11-19'),now(),1),('Yasaman','Mammadli','C',670,('2022-11-19'),now(),1),
('Farid','Huseynli','Pthon',290,('2022-11-19'),now(),1), ('Elshan','Rafiyev','Css',230,('2022-11-19'),now(),1),
('Said','Aliyev','Css',190,('2022-11-19'),now(),1), ('Fatima','Bayramlı','HTML',230,('2022-11-19'),now(),1),
('Natavan','Mammadova','Java',390,('2022-11-19'),now(),1),('Mirsaleh','Salayev','Css',360,('2022-11-19'),now(),1),
('Tarlan','Cumiyev','C++',240,('2022-11-19'),now(),1), ('Vusal','Cabbarov','Python',480,('2022-11-19'),now(),1),
('Zumrud','Nusratova','C#',220,('2022-11-19'),now(),1), ('Huseyn','Alipanahov','C',410,('2022-11-19'),now(),1);


INSERT INTO teacher (name, surname,subject,salary,start_date,create_date,status) values    --setirler daxil edirik
('Farid','Tahmazov','Java',5000,('2022-11-19'),now(),1), ('Tarana','Nasirli','Java',5000,('2022-11-19'),now(),1),
('Leyla','Hasanli','Fizika',700,('2009-05-14'),now(),1), ('Solmaz','Aliyeva','Edebiyyat',750,('2010-12-27'),now(),1),
('Toqet','Rehimli','Riyaziyyat',450,('2022-11-19'),now(),1), ('Heyat','Abdullayeva','Python',400,('2022-11-19'),now(),1),
('Rehim','Gasimov','Arxiektura',500,('2007-04-30'),now(),1), ('Ali','Bayramli','C#',3400,('2022-11-19'),now(),1),
('Tarlala','Huseynova','JavaScript',2800,('2022-11-19'),now(),1),('Qasim','Mammadli','C',2300,('2022-11-19'),now(),1),
('Farid','Faridli','Pthon',1700,('2022-11-19'),now(),1), ('Elshan','Guliyev','Css',230,('2022-11-19'),now(),1),
('Said','Elaxnli','Css',1900,('2022-11-19'),now(),1), ('Bayram','Bayramlı','HTML',2600,('2022-11-19'),now(),1),
('Shakir','Mammadov','Java',390,('2022-11-19'),now(),1),('Saleh','Salayev','Css',360,('2022-11-19'),now(),1),
('Zumrud','Cumiyeva','C++',1600,('2022-11-19'),now(),1), ('Vusal','Aqilov','Python',3400,('2022-11-19'),now(),1),
('Nazrin','Nusratova','C#',3780,('2022-11-19'),now(),1), ('Alipanah','Alipanahov','C',3000,('2022-11-19'),now(),1);


INSERT INTO staff (name, surname,position,salary,start_date,create_date,status) values    --setirler daxil edirik
('Farid','Tahmazov','Java',5000,('2022-11-19'),now(),1), ('Tarana','Nasirli','Java',5000,('2022-11-19'),now(),1),
('Leyla','Hasanli','Fizika',700,('2009-05-14'),now(),1), ('Solmaz','Aliyeva','Edebiyyat',750,('2010-12-27'),now(),1),
('Toqet','Rehimli','Riyaziyyat',450,('2022-11-19'),now(),1), ('Heyat','Abdullayeva','Python',400,('2022-11-19'),now(),1),
('Rehim','Gasimov','Arxiektura',500,('2007-04-30'),now(),1), ('Ali','Bayramli','C#',3400,('2022-11-19'),now(),1),
('Tarlala','Huseynova','JavaScript',2800,('2022-11-19'),now(),1),('Qasim','Mammadli','C',2300,('2022-11-19'),now(),1),
('Farid','Faridli','Pthon',1700,('2022-11-19'),now(),1), ('Elshan','Guliyev','Css',230,('2022-11-19'),now(),1),
('Said','Elaxnli','Css',1900,('2022-11-19'),now(),1), ('Bayram','Bayramlı','HTML',2600,('2022-11-19'),now(),1),
('Shakir','Mammadov','Java',390,('2022-11-19'),now(),1),('Saleh','Salayev','Css',360,('2022-11-19'),now(),1),
('Zumrud','Cumiyeva','C++',1600,('2022-11-19'),now(),1), ('Vusal','Aqilov','Python',3400,('2022-11-19'),now(),1),
('Nazrin','Nusratova','C#',3780,('2022-11-19'),now(),1), ('Alipanah','Alipanahov','C',3000,('2022-11-19'),now(),1);


SELECT * FROM student ORDER BY name;                                --name gore siraliyiriq
SELECT * FROM teacher ORDER BY salary;                              --salarye gore siraliyirq
SELECT * FROM staff ORDER BY start_date;                            --start_dateye gore siraliyir


SELECT * FROM student WHERE subject='Java';                         --subjecti java olanlari gosterir
SELECT * FROM teacher WHERE salary>=2000;                           --salarisi 2000den yuaxri olanlari gosterir
SELECT * FROM staff WHERE position='Python';                        --subjecti python olanlari gosterir


SELECT * FROM student WHERE monthly_payment between 200 and 400;    --odenisi 200 ile 400 arasinda olanlari cagirir
SELECT * FROM teacher WHERE salary between 2000 and 4000;           --salaryisi 2000 ile 4000 arasinda olanlari cagirir
SELECT * FROM staff WHERE salary between 3000 and 4000;             --salaryisi 3000 ile 4000 arasinda olanlari cagirir


SELECT DISTINCT subject FROM student;                               --eyni subjectleri tekrar cagirmir
SELECT DISTINCT salary FROM teacher;                                --eyni salaryileri tekrar cagirmir
SELECT DISTINCT position FROM staff;                                --eyni positionlari tekrar cagirmir


SELECT count(subject) FROM student GROUP BY subject='Java';         --say
SELECT count(subject) FROM teacher GROUP BY subject='Python';       --say
SELECT count(position) FROM staff GROUP BY position='C++';          --say


UPDATE student SET subject='Java' WHERE name='Shehla';              --subjecti update eledik
UPDATE teacher SET salary='7000' WHERE name='Farid';                --salaryini update eledik
UPDATE staff SET position='Python' WHERE name='Said';               --positionu update eledik


DELETE FROM student WHERE id=20;                                    --idsi 20 olani silir
DELETE FROM teacher WHERE id=15;                                    --idsi 15 olani silir
DELETE FROM staff WHERE id=18;                                      --idsi 18 olani silir


SELECT * FROM student WHERE subject like '%a%';                     --subjectde ortada a olanlar gelir
SELECT * FROM teacher WHERE name like 'A%';                         --name basda A olanlar gelir
SELECT * FROM staff WHERE position like '%s%';                      --positionda ortada s olanlar gelir


SELECT sum(monthly_payment) FROM student;                           --ayliq odenislerin cemi
SELECT sum(salary) FROM teacher;                                    --salaryinin cemi
SELECT sum(salary) FROM staff;                                      --salaryinin cemi


SELECT avg(monthly_payment) FROM student;                           --ayliq odenislerin ededi ortasi
SELECT avg(salary) FROM teacher;                                    --salaryinin ededi ortasi
SELECT avg(salary) FROM staff;                                      --salaryinin ededi ortasi