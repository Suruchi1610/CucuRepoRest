Feature: First Rest Assured Test


Scenario: Test my Get Method1
Given user start the rest asured test
When user hit the get request
Then user checks 200 the status code
Then user checks the count or size
Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value

