import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("jacoco")
  kotlin("jvm") version "1.4.31"
  kotlin("kapt") version "1.4.31"
  id("org.jetbrains.kotlin.plugin.serialization") version "1.5.10"
}

group = "org.beckn"
version = "0.9.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11


repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.+")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.+")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.+")

}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "11"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.jar{
  archiveBaseName.set("beckn-protocol-dtos")
}
jacoco {
  toolVersion = "0.8.7"
}

tasks.jacocoTestReport {
  dependsOn("build")
  reports {
    xml.required.set(false)
    csv.required.set(false)
    html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
  }
}
