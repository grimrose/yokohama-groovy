import spock.lang.Specification
import spock.lang.Unroll
/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/06
 * Time: 21:08
 * To change this template use File | Settings | File Templates.
 */
class SampleSpec extends Specification {

    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    @Unroll
    def "#nameの文字列長は#lengthというのをやってみた"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

}
