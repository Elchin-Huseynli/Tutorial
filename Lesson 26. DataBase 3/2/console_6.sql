create table x (
    id serial primary key,
    odd int,
    even int
);

do $$
    declare
    a int;
    begin
    for i in 1..100 loop
        a = i%2;
        if a=0 then
            insert into x (even) values (i);
        else
            insert into x (odd) values (i);
        end if;
    end loop;
    end;
$$;



------------------------------------------------



create table simple_digits (
    id serial primary key,
    simple int
);

do $$
    declare
    a int;
    count int;
    begin
    for i in 1..500 loop
        for j in 1..i loop
            a = i%j;
            if a=0 then
                count = count + 1;
            end if;
        end loop;
        if count<=2 then
            insert into simple_digits(simple) values (i);
        end if;
        count = 0;
    end loop;
    end;
$$;



------------------------------------------------


create table number (
  num int,
  hundred int,
  ten int,
  odd int
);

do $$
    declare
    begin
        for i in 100..999 loop
            insert into number(num, hundred, ten, odd) values (i, i/100, i/10%10, i%10);
        end loop;
    end;
$$;