package org.kurron.jacoco

def xml = new XmlParser( false, false ).parse( 'build/reports/jacoco/test/jacocoTestReport.xml' )
def exclude = ['org/kurron/jacoco/SkippedService','org/kurron/jacoco/UntestedService']
def missedCoverage = xml.package.class.findAll { clazz -> !exclude.contains( clazz.@name ) }.collect{ it.counter }.flatten().findAll{ it.@type == 'INSTRUCTION' }.flatten().collect { it.@missed >= it.@covered }.any { it }
println( missedCoverage )
