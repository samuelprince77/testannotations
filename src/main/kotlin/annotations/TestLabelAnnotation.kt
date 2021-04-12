package annotations

/**
 * An annotation that should be used with functions that are executors
 * @param label is a human friendly text that you would use to describe what the function does. # can be used as a place
 * holder for locations where you'd want to insert the value of the parameters of the functions. The #'s are replaced in
 * order of definition of the function parameters. The number of #'s in the label should match the number of params for
 * the function
 */
@Retention(AnnotationRetention.RUNTIME)
annotation class TestLabel constructor(val label: String)