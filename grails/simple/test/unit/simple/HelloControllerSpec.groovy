package simple

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test hello"() {
  		when:
  		controller.hello()

  		then:
  		response.text=="hello"
    }

    void "test helloRedir"() {
      when:
      controller.helloRedir()

      then:
      response.redirectUrl=="/hello/hello"
    }

    void "test custom hello"() {
      when:
      params.helloTo="ben"
      controller.list()

      then:
      response.text=="hello ben"
    }

}
