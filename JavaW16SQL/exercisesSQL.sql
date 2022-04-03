
show tables;

#table Movie(mID int, title text, year int, director text);
#table Reviewer(rID int, name text);
#table Rating(rID int, mID int, stars int, ratingDate date);
-- Exercise 1
use benga;
SELECT 
    title
FROM
    Movie
WHERE
    director = 'Steven Spielberg';

-- Exercise 2
SELECT DISTINCT
    year
FROM
    Movie AS a
        LEFT JOIN
    Rating AS b ON a.mID = b.mID
WHERE
    stars BETWEEN 4 AND 5
ORDER BY year;

-- Exercise 3
SELECT 
    title
FROM
    Movie AS a
        LEFT JOIN
    Rating AS b ON a.mID = b.mID
WHERE
    stars IS NULL
ORDER BY year;

-- Exercise 4
SELECT 
    name
FROM
    Reviewer AS a
        LEFT JOIN
    Rating AS b ON a.rID = b.rID
WHERE
    ratingDate IS NULL;

-- Exercise 4
SELECT 
    name, title, stars, ratingDate
FROM
    Reviewer AS a
        LEFT JOIN
    Rating AS b ON a.rID = b.rID
        LEFT JOIN
    Movie AS c ON b.mID = c.mID
ORDER BY name , title , stars;