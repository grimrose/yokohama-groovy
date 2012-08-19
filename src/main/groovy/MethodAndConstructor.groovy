
/**
 * Created with IntelliJ IDEA.
 * User: grimrose
 * Date: 2012/08/19
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */

def foo(Map param) {
    assert param.name == "太郎"
    assert param.age == 25
    assert param.gender == null
}

foo(age: 25, name: "太郎")