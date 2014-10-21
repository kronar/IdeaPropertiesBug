IdeaPropertiesBug
=================

The project in this repo reproduces small bug in IDEA 13 Community Edition.
IDEA installed out of the box.
idea console output here https://gist.github.com/kronar/94a2cb4521fb9e9baba0
VM options for test run "-ea"


So, the main question is why IDEA applies properties from pom.xml and surefire plugin to jvm under the test runner and do it silently? 
