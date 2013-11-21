package org.kurron.jacoco

import groovy.util.logging.Slf4j
import spock.lang.Ignore
import spock.lang.Specification

/**
 * Test drives the Simple Service.
 */
@Slf4j
@Ignore
class XmlUnitTest extends Specification {

    def 'exercise happy path'() {
        given: 'valid subject under test'
        true

        when: 'echo is called'
        def xml = new XmlParser( false, false ).parse( 'build/reports/jacoco/test/jacocoTestReport.xml' )

        then: 'results are valid'
        xml.findAll{ it.package.counter.@type == 'CLASS' }
    }
}
