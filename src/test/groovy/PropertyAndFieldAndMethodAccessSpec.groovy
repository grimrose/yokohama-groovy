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

    class MyClass1 {
        def method1() {
            return "A"
        }

        def method2() {
            return "B"
        }

        def method3() {
            return "C"
        }

    }

    def "using GString"() {
        /* リスト3.18 GStringでメソッド名を指定する例 */
        expect:
        def c = new MyClass1()
        c."method${i}"() == expect

        where:
        i | expect
        1 | "A"
        2 | "B"
        3 | "C"
    }

}