insert into Classes(classes,type,country,num_guns,bore,displacement) values('Bismarck','bb','Germany',8,15,42000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('Iowa','bb','USA',9,16,46000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('Kongo','bc','Japan',8,14,32000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('North Carolina','bb','USA',12,16,37000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('Renown','bc','Gt.Britain',6,15,32000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('Revenge','bb','Gt.Britain',8,15,29000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('Tennessee','bb','USA',12,14,32000);
insert into Classes(classes,type,country,num_guns,bore,displacement) values('Yamato','bb','Japan',9,18,65000);

;


----Battles------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into Battles(name, date) values('Guadalcanal','19421115 00:00:00.000');
insert into Battles(name, date) values('North Atlantic','19410525 00:00:00.000');
insert into Battles(name, date) values('North Cape','19431226 00:00:00.000');
insert into Battles(name, date) values('Surigao Strait','19441025 00:00:00.000');
insert into battles(name, date) values ('#Cuba62a'   , '19621020');
insert into battles(name, date) values ('#Cuba62b'   , '19621025');

;


----Ships------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into Ships(name,classes,launched) values('California','Tennessee',1921);
insert into Ships(name,classes,launched) values('Haruna','Kongo',1916);
insert into Ships(name,classes,launched) values('Hiei','Kongo',1914);
insert into Ships(name,classes,launched) values('Iowa','Iowa',1943);
insert into Ships(name,classes,launched) values('Kirishima','Kongo',1915);
insert into Ships(name,classes,launched) values('Kongo','Kongo',1913);
insert into Ships(name,classes,launched) values('Missouri','Iowa',1944);
insert into Ships(name,classes,launched) values('Musashi','Yamato',1942);
insert into Ships(name,classes,launched) values('New Jersey','Iowa',1943);
insert into Ships(name,classes,launched) values('North Carolina','North Carolina',1941);
insert into Ships(name,classes,launched) values('Ramillies','Revenge',1917);
insert into Ships(name,classes,launched) values('Renown','Renown',1916);
insert into Ships(name,classes,launched) values('Repulse','Renown',1916);
insert into Ships(name,classes,launched) values('Resolution','Renown',1916);
insert into Ships(name,classes,launched) values('Revenge','Revenge',1916);
insert into Ships(name,classes,launched) values('Royal Oak','Revenge',1916);
insert into Ships(name,classes,launched) values('Royal Sovereign','Revenge',1916);
insert into Ships(name,classes,launched) values('Tennessee','Tennessee',1920);
insert into Ships(name,classes,launched) values('Washington','North Carolina',1941);
insert into Ships(name,classes,launched) values('Wisconsin','Iowa',1944);
insert into Ships(name,classes,launched) values('Yamato','Yamato',1941);
insert into Ships(name,classes,launched) values('South Dakota','North Carolina',1941) ;


;


----Outcomes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into Outcomes(ship,name,result) values('Bismarck','North Atlantic','sunk');
insert into Outcomes(ship,name,result) values('California','Surigao Strait','OK');
insert into Outcomes(ship,name,result) values('Duke of York','North Cape','OK');
insert into Outcomes(ship,name,result) values('Fuso','Surigao Strait','sunk');
insert into Outcomes(ship,name,result) values('Hood','North Atlantic','sunk');
insert into Outcomes(ship,name,result) values('King George V','North Atlantic','OK');
insert into Outcomes(ship,name,result) values('Kirishima','Guadalcanal','sunk');
insert into Outcomes(ship,name,result) values('Prince of Wales','North Atlantic','damaged');
insert into Outcomes(ship,name,result) values('Rodney','North Atlantic','OK');
insert into Outcomes(ship,name,result) values('Schamhorst','North Cape','sunk');
insert into Outcomes(ship,name,result) values('South Dakota','Guadalcanal','damaged');
insert into Outcomes(ship,name,result) values('Tennessee','Surigao Strait','OK');
insert into Outcomes(ship,name,result) values('Washington','Guadalcanal','OK');
insert into Outcomes(ship,name,result) values('West Virginia','Surigao Strait','OK');
insert into Outcomes(ship,name,result) values('Yamashiro','Surigao Strait','sunk');
insert into Outcomes(ship,name,result) values('California','Guadalcanal','damaged');