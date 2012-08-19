import spock.lang.Specification
/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/18
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */
class WordCountSpec extends Specification {


    def "specification wordCount running" () {

        expect:
        def base = new File("")
//        println base.absolutePath

        GroovyShell shell = new GroovyShell()

        def script = shell.parse(new File(base.absolutePath, "src/main/groovy/wordCount.groovy"))
        script.setProperty("args", [ "${base.absolutePath}/src/main/resources/input.txt"])

        def expect = [That:1, not: 2, it:2, that: 4, is: 6]
        assert script.run() == expect

    }

}
