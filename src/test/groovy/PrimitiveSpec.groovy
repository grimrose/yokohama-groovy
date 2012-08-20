import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/20
 * Time: 19:38
 * To change this template use File | Settings | File Templates.
 */
class PrimitiveSpec extends Specification {

    def "primitive"() {
        /* リスト3.25 プリミティブ型の扱い */
        expect:
        1.class == java.lang.Integer
        2.plus(1) == 3
        (1 - 5).abs() == 4
    }

}