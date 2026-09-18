plugins {
    kotlin("jvm") version "2.2.0"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(24)
}

sourceSets {
    main {
        kotlin.srcDir("Source Code")
    }
}

val exercises = mapOf(
    "runConditionals" to "_01_conditionalsKt",
    "runNullability" to "_02_nullabilityKt",
    "runClassesObjects" to "_03_classes_objectsKt",
    "runFunctionTypesLambdas" to "_04_function_types_lambdasKt",
    "runPracticeKotlinFundamentals" to "_05_practice_kotlin_fundamentalsKt"
)

exercises.forEach { (taskName, mainClassName) ->
    tasks.register<JavaExec>(taskName) {
        group = "application"
        description = "Runs $mainClassName"
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set(mainClassName)
    }
}
