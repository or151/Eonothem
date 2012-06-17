cd Eonothem

call mvn clean install

cd ../EonothemWeb

call mvn org.mortbay.jetty:maven-jetty-plugin:6.1.26:run -Djetty.port=9999

cd ..