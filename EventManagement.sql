SHOW databases;
CREATE database EventManagement;

USE EventManagement;

CREATE Table EventManage
(
	EventID integer NOT NULL AUTO_INCREMENT,
    EventName VARCHAR(30),
    Location VARCHAR(30),
    EventType VARCHAR(30),
    EventDate DATE,
    EventTime VARCHAR(10),
    PRIMARY KEY (EventID)
);

SELECT * FROM EventManage;

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('OSS Meetup', 'North Cafe Pune', 'OSS Technical', '2024-01-30', '1600 hrs');

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('Tree Plantation', 'T2 Pune', 'CSR', '2024-01-27', '0930 hrs');

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('GenZ vs Millennials', 'Teams Online', 'Employee Life', '2024-01-24', '1500 hrs');

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('Fiesta 4.0', 'Gurgaon', 'Amdocs Innvotaion', '2024-01-10', '1100 hrs');

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('HR4U Connect', 'Ground Floor T2', 'HR', '2024-02-01', '1030 hrs');

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('Make It Amazing', 'Auditorium', 'ICOMM', '2024-02-18', '1115 hrs');

INSERT INTO EventManage(EventName, Location, EventType, EventDate, EventTime) 
VALUES ('Blossom Marathon', 'Pune', 'CSR', '2024-02-17', '0600 hrs');

COMMIT;