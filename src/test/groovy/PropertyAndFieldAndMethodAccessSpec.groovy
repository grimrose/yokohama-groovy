import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/19
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 */
class PropertyAndFieldAndMethodAccessSpec extends Specification {

    /* リスト3.17 フィールドやプロパティの参照の例 */

    class MyClass {
        public a = 1
    }

    def "field and properties access"() {
        when:
        def c = new MyClass()

        def fieldName = 'a'

        then:
        c.a == 1
        c.'a' == 1
        c."a" == 1
        c."$fieldName" == 1
        c['a'] == 1
        c[fieldName] == 1
        c.getProperty(fieldName) == 1

    }
}