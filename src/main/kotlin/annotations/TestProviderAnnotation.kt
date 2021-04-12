package annotations

import kotlin.reflect.KClass

/**
 * An annotation that should be used in the runner class of the UI test.
 * @param providers Expects one or more KClasses and these KClasses contain functions that run UI test actions. They
 * essentially provide the test functions
 */
@Retention(AnnotationRetention.RUNTIME)
annotation class TestProviders constructor(vararg val providers: KClass<*>)