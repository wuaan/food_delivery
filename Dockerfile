FROM openjdk:20
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp/src
RUN javac Main.java
CMD ["java", "Main"]