import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/19
 * Time: 15:47
 * To change this template use File | Settings | File Templates.
 */
class MethodAndConstructorSpec extends Specification {

    def "MethodAndConstructor run"() {
        when:
        def base = new File("")
        GroovyShell shell = new GroovyShell()
        def script = shell.parse(new File(base.absolutePath, "src/main/groovy/MethodAndConstructor.groovy"))

        then:
        assert script.run() == null
    }

}