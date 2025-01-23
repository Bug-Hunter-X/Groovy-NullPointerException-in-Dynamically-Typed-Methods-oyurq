```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            println "Parameter is null"
            return
        }
        //some other code here that might throw NullPointerException if param is unexpectedly null
        println param.someProperty
    }
}

MyClass myObj = new MyClass();
myObj.myMethod(null);
myObj.myMethod(["a","b"]);
myObj.myMethod( ["a", null]);
```