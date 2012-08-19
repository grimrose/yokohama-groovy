/* リスト3.7 名前付き引数 */

def foo(Map param) {
    assert param.name == "太郎"
    assert param.age == 25
    assert param.gender == null
}

foo(age: 25, name: "太郎")

/* リスト3.8 マップで初期化を行うコンストラクタ */

class MyClass {
    String name
    int age
}

def c = new MyClass(name: "太郎", age: 25)

assert c.name == "太郎"
assert c.age == 25

/* リスト3.9 引数のデフォルト値 */

def foo2(int data = 333) {
    assert data == 333
}

foo2()

/* リスト3.10 staticメソッドからのthisの参照 */
class MyClass1 {

    static foo() {
        assert this == MyClass1
        assert this.class == java.lang.Class
    }
}

MyClass1.foo()

/* リスト3.11 マルチメソッドの例 */
def hello(String s) {
    println "hello(String) -> $s"
}

def hello(Integer i) {
    println "hello(Integer) -> $i"
}

Object x = 3
Object y = "ABC"

hello(x)

hello(y)



