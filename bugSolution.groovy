```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            println "Parameter is null"
            return
        }
        // Use safe navigation operator to handle potential nulls within the list
        param.each { item ->
            println "Item: ${item?.toString() ?: 'null'}"
        }
    }
}

MyClass myObj = new MyClass();
myObj.myMethod(null);
myObj.myMethod(["a","b"]);
myObj.myMethod(["a", null]);
```