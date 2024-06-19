/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Gradle plugin project to get you started.
 * For more details on writing Custom Plugins, please refer to https://docs.gradle.org/8.8/userguide/custom_plugins.html in the Gradle documentation.
 */

plugins {
  // Apply the Java Gradle plugin development plugin to add support for developing Gradle plugins
  `java-gradle-plugin`
  `kotlin-dsl`

  // Apply the Kotlin JVM plugin to add support for Kotlin.
  alias(libs.plugins.jvm)
}

repositories {
  // Use Maven Central for resolving dependencies.
  ivy {
    url = uri("repo-url")
    patternLayout {
      ivy("[organization]/[module]/[revision]/ivy.xml")
      artifact("[organization]/[module]/[revision]/[artifact]-[type].[ext]")
    }
  }
  mavenCentral()
}

dependencies {
  implementation(
      group = "test",
      name = "lib",
      version = "0.1",
      configuration="runtime"
  )
}

gradlePlugin {
  // Define the plugin
  val greeting by
      plugins.creating {
        id = "plugin"
        implementationClass = "org.example.BuildSrcPlugin"
      }
}

