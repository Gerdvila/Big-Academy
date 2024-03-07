# Swedbank-IT-Academy

#### Group Project Team members

 - TODO

## Overview
 - Frontend framework: Angular
 - Backend framework: Spring Boot Java
 - Database: TODO
 - Project setup tool: npm, spring initialzr


## [Debian] Developers setup

### [Angular] setup.

```bash
sudo apt install npm
sudo npm install -g @angular/cli
```

Install nvm using (This is v0.39.7, you can find latest [here](https://nvm.sh)):
```bash
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash
```
Install 20.11.0 node LTS (Long Term Support) version which works with angular
```bash
nvm install 20.11.0
```
Head to Angular project path and initialize and setup packages by writing:
```bash
npm install
```
To build Angular project for local usage :
```bash
ng serve
```

To build Angular project for production :
```bash
ng build 
```
### [Spring Boot] setup.

Download and run Java 21 setup [here](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html)

Use Spring initialzr to set up with the dependencies of your project [here](https://start.spring.io)

When beggining to learn JAVA or Spring Boot it is recommended to use Maven instead of gradle.

### [Database] Setup.

TODO

## [Windows] Developers setup


Download and run nvm setup [here](https://github.com/coreybutler/nvm-windows/releases)

Install 20.11.0 node LTS (Long Term Support) version which works with angular. This will download npm as well.
```bash
nvm install 20.11.0
```
Install angular CLI (This is global installation, not sure if it would work like this)
```bash
npm install -g @angular/cli
```
Head to Angular project path and initialize and setup packages by writing:
```bash
npm install
```
To build Angular project for local usage :
```bash
ng serve
```
To build Angular project for production :
```bash
ng build 
```
### [Spring Boot] setup.

Download and run Java 21 setup [here](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html)

Use Spring initialzr to set up with the dependencies of your project [here](https://start.spring.io)

When beggining to learn JAVA or Spring Boot it is recommended to use Maven instead of gradle.

### [Database] Setup.

TODO

# *Repo is under MIT license so you're free to use pretty much everything from this repository :)*


