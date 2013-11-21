package org.kurron.jacoco

import groovy.util.logging.Slf4j
import spock.lang.Ignore
import spock.lang.Specification

/**
 * Test drives the Simple Service.
 */
@Ignore( 'Just to trigger a coverage failure' )
@Slf4j
class UntestedServiceUnitTest extends Specification {

    def 'exercise happy path'() {
        given: 'valid subject under test'
        UntestedService sut = new UntestedService()

        when: 'echo is called'
        String results = sut.echo(Long.toHexString(System.currentTimeMillis()).toUpperCase())

        then: 'results are valid'
        results
        log.debug( results )
    }
}
