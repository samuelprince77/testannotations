package annotations

/**
 * An annotation that should be used with a function that takes its containing class as a receiver
 * @param label is a human friendly text that you would use to describe the screen it "operates" on
 */
@Retention(AnnotationRetention.RUNTIME)
annotation class EntryScreenLabel constructor(val label: String)