Introduction

	This application reads PNL information from a text
	file and generate RESTful web service to deliver data in JSON format to the 
  front-end application and make sure everything is working as expected. 
	
Key features:

	1. Clean codes with production quality.
	2. Used Maven as project management and comprehension tool.
	3. Wrote testable code through spring’s dependency injection.
	4. Designed web services following RESTful API guiding constraints.

Used Technologies:

	Spring Boot 1.5.3, JSON, Gradle, Maven, Spring Tool Suite and Java 8

Building:

	Check out the code using:
	git clone https://github.com/yuohuo/pnl-rest-service-cors.git directory-to-clone-into

	Navigate to the project directory under the cloned repository from above and run:
	mvn install

	This will run all tests and build the application into:
	directory-to-clone-into/complete/target/pnl-rest-service-cors-0.1.0.jar

Running:

    Ensure you are in the "pnl-rest-service-cors" directory after building the software.
    Run the program without parameters input, it will use "src/main/resources/PNL.txt"
	as the defualt employee input file. 
  
  API endpoint:
  /orderList is the RESTful API which will respond the GET request with a list of Object 
  order using JSON format:
	
[
    {
        "orderId": "LVGVUP",
        "passengerList": [
            {
                "name": "ARNOLD/NIGELMR"
            },
            {
                "name": "TAYLOR/HAYLEYMRS"
            }
        ]
    },
    {
        "orderId": "LVKBTB",
        "passengerList": [
            {
                "name": "ATKINSON/KARENMRS"
            }
        ]
    },
    {
        "orderId": "LVHZDG",
        "passengerList": [
            {
                "name": "BALL/LINDAANNMRS"
            },
            {
                "name": "BALL/STEPHENJOHNMR"
            }
        ]
    },
    {
        "orderId": "LVK6HA",
        "passengerList": [
            {
                "name": "CLARKE/MICHAELMR"
            },
            {
                "name": "CLARKE/TRACEYMRS"
            }
        ]
    },
    {
        "orderId": "LVKBCB",
        "passengerList": [
            {
                "name": "CLIFFORD/DAVIDMR"
            }
        ]
    }
]

	]

