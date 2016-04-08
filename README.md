Ant-Java-JUnit-Coverage-Checkstyle build template
=================================================

![Build status](https://julen-ci.com/jenkins/job/ant-java-junit-template/badge/icon) ![Tests](https://img.shields.io/jenkins/t/https/julen-ci.com/jenkins/ant-java-junit-template.svg) ![Coverage](https://img.shields.io/jenkins/c/https/julen-ci.com/jenkins/ant-java-junit-template.svg)

This template is designed for building Java projects with Apache Ant, including the following software engineering practices automated in the build:

 - Unit testing, with JUnit.
 - Coverage analysis, with Cobertura.
 - Code style validation, with Checkstyle.

### Making this thing work

Just run `ant`. The default target is `test`; to run another target, specify it typing `ant <other-target>`.

### Requirements
- Apache Ant 1.9.3 or later.
- Java 1.5 or later (see [required versions of Java for Apache Ant](https://ant.apache.org/faq.html#java-version)).

