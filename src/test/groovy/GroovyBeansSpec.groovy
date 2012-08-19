import spock.lang.Specification
import javax.swing.JFrame
import javax.swing.JButton
import spock.lang.Ignore

/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/19
 * Time: 21:32
 * To change this template use File | Settings | File Templates.
 */
class GroovyBeansSpec extends Specification {

    /* リスト3.12 getter/setterの自動生成 */
    /* リスト3.13 生成されるgetter/setter */
    class MyClass2 {
        String msg
    }

    def "auto getter setter"() {
        when:
        def c2 = new MyClass2()
        c2.setMsg(msg)

        then:
        expect == c2.getMsg()

        where:
        msg     | expect
        "hello" | "hello"
    }

    def "property access"() {
        /* リスト3.14 プロパティアクセスの簡略記法 */
        when:
        def c2 = new MyClass2()
        c2.msg = msg

        then:
        expect == c2.msg

        where:
        msg      | expect
        "hello!" | "hello!"
    }

    def "date property access"() {
        /* リスト3.15 Javaクラスのプロパティをフィールドのようにアクセス */
        expect:
        def date = new Date()
        date.time == date.getTime()
        System.env.PATH == System.getenv().get("PATH")
    }

    @Ignore
    def "event "() {
        /* リスト3.16 イベント処理 */
        def frame = new JFrame()
        JButton button = new JButton("say Hello")
        button.actionPerformed = { event -> println 'hello!' }
        frame.add button
        frame.visible = true

        expect:
        frame.visible
    }

}
