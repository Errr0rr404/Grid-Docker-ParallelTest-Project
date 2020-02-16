Steps to run the project :

1. Sign up and Download [https://www.docker.com/products/docker-desktop] and login on downloaded docker-desktop 
2. From the project directory run below commands 
 * `docker login`
 * `docker-compose up`
 * `docker-compose scale chrome=(?)` ,
 * `docker-compose scale firefox=(?)`

FYI : 
* (?) replace with the number of desired browser do you want.
For example with current project, run `docker-compose scale chrome=2` , `docker-compose scale firefox=2`
* TestNG.xml is the runner file to trigger the parallel exec 
* After execution , run `docker-compose down` to clean up the docker-compose
* Hub URL : http://localhost:4444/grid/console
