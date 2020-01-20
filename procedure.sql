delimiter //
create procedure eliminiaPringaos()
begin
delete from bfplayer where class_id > 3;
end //
delimiter ;