plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.36")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.apache.commons:commons-lang3:3.0")
    implementation("com.github.kiprobinson:bigfraction:1.1.0-java7")
    implementation(project(":CommonUtils"))
}

tasks.test {
    useJUnitPlatform()
}