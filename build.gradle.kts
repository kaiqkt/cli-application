import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.4.30"
	application
	id ("org.jetbrains.kotlin.kapt") version "1.4.30"
}

group = "me.user"
version = "1.0"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(kotlin("test-junit5"))
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
	implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.2")
	implementation("com.fasterxml.jackson.core:jackson-databind:2.13.2")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

	kapt("info.picocli:picocli-codegen:4.6.3")
	implementation ("info.picocli:picocli:4.6.1")
}

kapt {
	arguments {
		arg("project", "${project.group}/${project.name}")
	}
}

val jar by tasks.getting(Jar::class) {

	duplicatesStrategy = DuplicatesStrategy.EXCLUDE

	manifest {
		attributes["Implementation-Title"] = project.name
		attributes["Implementation-Version"] = project.version
		attributes["Main-Class"] = "com.github.kaiqkt.SearchCommand"
	}
	from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) }) {
		exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
	}
}

tasks.test {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
	kotlinOptions.jvmTarget = "1.8"
}

application {
	mainClassName = "CheckSumKt"
}