Ant-Java-JUnit-Coverage-Checkstyle build template
=================================================

![Build status](https://img.shields.io/jenkins/s/http/julenpardo.com/jenkins/ant-java-junit-coverage-checkstyle-template.svg) ![Tests](https://img.shields.io/jenkins/t/http/julenpardo.com/jenkins/ant-java-junit-coverage-checkstyle-template.svg) ![Coverage](https://img.shields.io/jenkins/c/http/julenpardo.com/jenkins/ant-java-junit-coverage-checkstyle-template.svg)

This template is designed for building Java projects with Apache Ant, including the following software engineering practices automated in the build:

 - Unit testing, with JUnit.
 - Coverage analysis, with Cobertura.
 - Code style validation, with Checkstyle.

### Making this thing work

Just run `ant`. The default target is `test`; to run another target, specify it typing `ant <other-target>`.

### Requirements
- Apache Ant 1.9.3 or later.
- Java 1.5 or later (see [required versions of Java for Apache Ant](https://ant.apache.org/faq.html#java-version)).

### What are those cool badges? I want them!
These badges show the status of the project. In this case, they show the last build status, and unit tests and coverage results; all of them for Jenkins CI.

To add the to your project, you must have a server accesible from the Internet, and a Continuous Integration system.

[shields.io](http://shields.io/) provides a large variety of embeddable badges, for many CI systems, and plugins for each one. When you construct the URL for the shield, you just have to add it to the README, and this will show the results regarding to the latest build.

