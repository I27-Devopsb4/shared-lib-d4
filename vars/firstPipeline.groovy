Import com.divya.builds.Calculator;
def call(Map pipelineparams) {
    Calculator calculator = new Calculator(this)

    pipeline {
        agent any
        environment {
            APP_NAME = "${pipelineparams.appName}"
        }
        stages {
            stage ('AdditionStage') {
                steps {
                    script {
                        echo "Printing sum of 2 numbers"
                        println calculator.add(3,4)
                        echo "******Microservice name is: ${APP_NAME}*********"
                    }
                }
            }
            stage ('SecondStage') {
                steps {
                    echo "Printing second stage"
                }
            }
        }
    }
}
