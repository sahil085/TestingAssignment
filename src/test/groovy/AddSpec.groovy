import spock.lang.Specification

class AddSpec extends Specification {

    def addition;

    void setup() {
        addition = new Addition();
    }


    void "canary test"() {
        println "this is canary test"
        expect:
        true
    }

    void "sum of two integers"() {
        expect:
        addition.sum(1, 3) == 4
        addition.sum(7, 4) == 11
        addition.sum(0, 0) != 4
    }

    void "sum of two floats"() {
        expect:
        addition.sum(10.5f, 3.0f) == 13.5f
        addition.sum(7.0f, 4.0f) == 11.0f
        addition.sum(0.0f, 0.0f) == 0.0f
    }

    void "sum of two doubles"() {
        expect:
        addition.sum(10.5, 3.0) == 13.5
        addition.sum(7.0, 4.0) == 11.0
        addition.sum(0.0, 0.0) == 0.0
    }

    void "sum using when then"(){
        when :
        def x=addition.sum(5,10)
        then:
        x==16
    }

//    void "test addition of integer numbers"(){
//        setup: "setup details come here"
//        given: "an empty block"
//    }

}
