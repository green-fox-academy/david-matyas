
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

-- Exercise 5
SELECT 
    name, title, stars, ratingDate
FROM
    Reviewer AS a
        LEFT JOIN
    Rating AS b ON a.rID = b.rID
        LEFT JOIN
    Movie AS c ON b.mID = c.mID
ORDER BY name , title , stars;

-- Exercise 6 - For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time, return the reviewer’s name and the title of the movie.
SELECT 
    name, title
FROM
    (SELECT 
        c.rID,
            a.mID,
            name,
            title,
            MAX(stars) maxStar,
            MAX(ratingDate) maxDate,
            COUNT(*) count
    FROM
        Movie AS a
    LEFT JOIN Rating AS b ON a.mID = b.mID
    LEFT JOIN Reviewer AS c ON b.rID = c.rID
    GROUP BY c.rID , a.mID
    ORDER BY name , ratingDate DESC) AS twice
        JOIN
    rating AS b ON twice.rID = b.rID AND maxStar = stars
        AND maxDate = b.ratingDate
WHERE
    count > 1
;

-- Excercise 6 - better way based on talk with Patrick 
/*SELECT 
    *
FROM
    rating AS r1
        JOIN
    rating AS r2 ON r1.rID = r2.rID
WHERE
    r1.mID = r2.mID
        AND r1.ratingDate < r2.ratingDate
        AND r1.stars < r2.stars;
        */

-- Exercise 7 - For each movie that has at least one rating, find the highest number of stars that movie received. Return the movie title and number of stars. Sort by movie title.
SELECT 
    a.mID, title, MAX(stars) maxStar
FROM
    Movie AS a
        JOIN
    Rating AS b ON a.mID = b.mID
GROUP BY a.mID
ORDER BY title;

-- Exercise 8 - For each movie, return the title and the ‘rating spread’, that is, the difference between highest and lowest 
-- ratings given to that movie. Sort by rating spread from highest to lowest, then by movie title.
   
   SELECT 
    *
FROM
    (SELECT 
        a.mID, title, MAX(stars) - MIN(stars) spread
    FROM
        Movie AS a
    JOIN Rating AS b ON a.mID = b.mID
    GROUP BY a.mID) AS spread
ORDER BY spread DESC , title
;


-- Exercise 9 Find the difference between the average rating of movies released before 1980 and the average rating of movies 
-- released after 1980. (Make sure to calculate the average rating for each movie, then the average of those averages for movies before 1980 and movies after. 
-- Don’t just calculate the overall average rating before and after 1980.)

Select (sum(newMovies) - sum(oldMovies)) 
from
(SELECT 
    sum(movieAVG)/sum(before_1980) as oldMovies,sum(movieAVG)/sum(after_1980) newMovies
FROM
    (SELECT 
        a.mID,
            CASE
                WHEN year < 1980 THEN 'before 1980'
                WHEN year >= 1980 THEN 'after 1980'
            END AS year_range,

            CASE
                WHEN year < 1980 THEN 0
                WHEN year >= 1980 THEN 1
            END AS before_1980,
			CASE
                WHEN year < 1980 THEN 1
                WHEN year >= 1980 THEN 0
            END AS after_1980,
            AVG(stars) movieAVG
    FROM
        Rating AS a
    JOIN Movie AS b ON a.mID = b.mID
    GROUP BY a.mID
    ORDER BY year) AS new
GROUP BY year_range) as average
;

SELECT 
      *
    FROM
        Rating AS a
    JOIN Movie AS b ON a.mID = b.mID
    GROUP BY a.mID
    ORDER BY year;