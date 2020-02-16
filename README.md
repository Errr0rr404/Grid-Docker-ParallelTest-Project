Steps to run the project :

1. Download [https://www.docker.com/products/docker-desktop][Docker-Desktop] and login 
2. From the project directory run below commands 
 * `docker-compose up` from the project directory
 * `docker-compose scale chrome=(?)` ,
 * `docker-compose scale firefox=(?)`

FYI : 
* (?) replace with the number of desired browser do you want.
For example with current project, run `docker-compose scale chrome=2` , `docker-compose scale firefox=2`
* TestNG.xml is the runner file to trigger the parallel exec 
* After execution , run `docker-compose down` to clean up the docker-compose
* Hub URL : http://localhost:4444/grid/console
