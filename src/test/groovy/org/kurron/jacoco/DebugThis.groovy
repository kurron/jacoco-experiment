package org.kurron.jacoco

def xml = new XmlParser( false, false ).parse( 'build/reports/jacoco/test/jacocoTestReport.xml' )
def missedCoverage = xml.package.class.counter.findAll{ it.@type == 'CLASS' }.collect { it.@missed >= it.@covered }.any { it }
println( missedCoverage )
