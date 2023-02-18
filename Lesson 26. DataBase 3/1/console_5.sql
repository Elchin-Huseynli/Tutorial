create database div_academy3;       --database yaradiriq

--tableleri yaradiriq
create table teacher_row_info (
    id serial primary key,
    create_date timestamp default now(),
    update_date timestamp,
    status int default 1
);

create table student_row_info (
    id serial primary key,
    create_date timestamp default now(),
    update_date timestamp,
    status int default 1
);

create table group_row_info (
    id serial primary key,
    create_date timestamp default now(),
    update_date timestamp,
    status int default 1
);

create table teacher (
    id serial primary key,
    name varchar,
    surname varchar,
    profession varchar,
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
    major varchar,
    fee int,
    start_date date,
    leave_date date,
    student_row_info_id int,

    foreign key (student_row_info_id) references student_row_info

);

create table group_ (
    id serial primary key,
    name varchar,
    group_row_info_id int,

    foreign key (group_row_info_id) references group_row_info
);

create table student_teacher_group (
    id serial primary key,
    group_id int,
    student_id int,
    teacher_id int,

    foreign key (group_id) references group_,
    foreign key (student_id) references student,
    foreign key (teacher_id) references teacher
);

-- cedveli doldururuq
insert into student_row_info(update_date) values (now()),(now()),(now()),(now()),(now()),(now()),(now()),(now()),(now()),(now());
insert into student (name, surname, major, fee, start_date, student_row_info_id) values
('Elchin','Huseynli','Backend',390,('2022-11-19'),(select id from student_row_info order by id limit 1)),
('Nihat','Guliyev','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 1 limit 1)),
('Xedice','Madnayeva','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 2 limit 1)),
('Emin','Guliyev','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 3 limit 1)),
('Nurlan','Cahangirzade','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 4 limit 1)),
('Leman','Xudatzade','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 5 limit 1)),
('Ilyas','Bayramov','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 6 limit 1)),
('Hesen','Huseynov','Backend',390,('2022-11-19'),(select id from student_row_info order by id offset 7 limit 1)),
('Farid','Huseynli','Fronted',390,('2022-11-19'),(select id from student_row_info order by id offset 8 limit 1)),
('Eli','Balayev','Fronted',390,('2022-11-19'),(select id from student_row_info order by id offset 9 limit 1));


insert into teacher_row_info(update_date) values (now()),(now());
insert into teacher (name, surname, profession, salary, start_date, teacher_row_info_id) values
('Farid','Tahmazov','Backend',7500,('2022-11-19'),(select id from teacher_row_info order by id limit 1)),
('Serxan','Orxanli','Fronted',7500,('2022-11-19'),(select id from teacher_row_info order by id offset 1 limit 1));


insert into group_row_info(update_date) values (now()),(now());
insert into group_(name, group_row_info_id) values ('Backend',(select id from group_row_info order by id limit 1)),
('Fronted',(select id from group_row_info order by id offset 1 limit 1));


insert into student_teacher_group (group_id, student_id, teacher_id) values
((select g.id from group_ g inner join student s on s.major = g.name order by s.id limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 1 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 1 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 1 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 2 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 2 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 2 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 3 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 3 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 3 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 4 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 4 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 4 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 5 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 5 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 5 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 6 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 6 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 6 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 7 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 7 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 7 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 8 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 8 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 8 limit 1)),
((select g.id from group_ g inner join student s on s.major = g.name order by s.id offset 9 limit 1),(select s.id from student s inner join teacher t on s.major = t.profession order by s.id offset 9 limit 1),(select t.id from teacher t inner join student s on t.profession = s.major order by t.id offset 9 limit 1));


--hamisin birlesdirib statusa gore gormek
select * from student_teacher_group stg inner join teacher t on stg.teacher_id = t.id
inner join student s on stg.student_id = s.id inner join group_ g on g.id = stg.group_id
inner join group_ g2 on g.group_row_info_id = g2.group_row_info_id
inner join student_row_info sri on s.student_row_info_id = sri.id
inner join teacher_row_info tri on t.teacher_row_info_id = tri.id where sri.status = 1 and tri.status = 1;


--statusu deyiserek cagiranda gelmesin istemirik ve update_date yeniliyirik
update student_row_info  set status=0 where id = (select id from student  where id=10);
update student_row_info  set update_date=now() where id = (select id from student  where id=10);

