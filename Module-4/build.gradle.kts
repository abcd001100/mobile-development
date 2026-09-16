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
    "runPrintMessages" to "_01_print_messagesKt",
    "runFixCompileErrors" to "_02_fix_compile_errorsKt",
    "runStringTemplates" to "_03_string_templatesKt",
    "runNotificationSummary" to "_04_notification_summaryKt"
)

exercises.forEach { (taskName, mainClassName) ->
    tasks.register<JavaExec>(taskName) {
        group = "application"
        description = "Runs $mainClassName"
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass.set(mainClassName)
    }
}