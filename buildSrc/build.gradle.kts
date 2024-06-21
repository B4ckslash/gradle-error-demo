plugins {
  java
}

buildscript {
  repositories {
    // Use Maven Central for resolving dependencies.
    ivy {
      url = uri("../dummy-repo")
      patternLayout {
        ivy("[organization]/[module]/[revision]/ivy.xml")
        artifact("[organization]/[module]/[revision]/[artifact]-[type].[ext]")
      }
    }
    mavenCentral()
  }
}


dependencies {
  runtimeOnly(project(":plugin"))
}
