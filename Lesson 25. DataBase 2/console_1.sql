create database div_academy2;                              --databaseyi yaradirq

create schema public;                                      --schemani yaradiriq


create table teacher_row_info (                            --tablelerli yaradiriq
    id serial primary key,
    created_date timestamp,
    update_date timestamp,
    status int
);

create table student_row_info (
    id serial primary key,
    created_date timestamp,
    update_date timestamp,
    status int
);

create table teacher (
    id serial primary key,
    name varchar,
    surname varchar,
    salary int,
    start_date date,
    leave_date date,
    teacher_row_info_id int,

    foreign key (teacher_row_info_id) references teacher_row_info
);

create table student (
    id serial primary key,
    name varchar,
    surname varchar,
    fee int,
    start_date date,
    leave_date date,
    teacher_id int,
    student_row_info_id int,

    foreign key (teacher_id) references teacher,
    foreign key (student_row_info_id) references student_row_info
);


insert into teacher_row_info(created_date,update_date,status)            --teacherleri elave edirik
values (now(),now(),1);
insert into teacher(name, surname, salary, start_date, teacher_row_info_id)
values ('Farid','Tahmazov',7500,('2022-11-19'),(select id from teacher_row_info order by id desc limit 1));


insert into student_row_info(created_date, update_date, status)          --studentleri elave edirik
values (now(),now(),1);
insert into student(name, surname, fee, start_date, teacher_id, student_row_info_id)
values ('Elchin','Huseynli',390,('2022-11-19'),(select id from teacher order by id desc limit 1),
        (select id from student_row_info order by id desc limit 1));


update student set teacher_id=1 where id=1;    --idsi 1 olan studenti teacher idsi 1 olan teacher ile deyisir


--join ile tableleri birlesdiririk ve silinmeyenlere baxiriq
select s.id, s.name as student_name, s.surname as student_surname, s.fee, s.start_date ,t.name as teacher_name,
       t.surname as teacher_surname from student s inner join teacher t on teacher_id = t.id
           inner join student_row_info sri on student_row_info_id = sri.id where status=1;


--statusu 0 elemekle gorunmesini istemirik ve update_datei yenileyirik
update student_row_info set status=0, update_date=now() where id=(select student_row_info_id from student where id=4);
