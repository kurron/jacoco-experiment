package org.kurron.jacoco

import groovy.util.logging.Slf4j
import spock.lang.Specification

/**
 * Test drives the Simple Service.
 */
@Slf4j
class SimpleServiceUnitTest extends Specification {

    def 'exercise happy path'() {
        given: 'valid subject under test'
        SimpleService sut = new SimpleService()

        when: 'echo is called'
        String results = sut.echo(Long.toHexString(System.currentTimeMillis()).toUpperCase())

        then: 'results are valid'
        results
        log.debug( results )
    }
}
