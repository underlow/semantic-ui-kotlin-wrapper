# Kotlin JS wrapper for Semantic UI

Kotlin wrapper library to use [Semantic UI React](https://react.semantic-ui.com) in Kotlin JS project.

This is more than Proof of Concept than a production quality library. If you have some thoughts feel free to submit tickets 
or pull requests. 

***Usage*** 

- Build by `gradle build` 
- Add jar file to your project
- Add semantic ui react npm package, usually that means add **"semantic-ui-react": "^0.82.1"** to **package.json**
- Try somthing like 
```kotlin

class LoginComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        Button {
            attrs {
                fluid = true
                color = "teal"
                size = "large"
            }
            +"Login"
        }
    }
}

```
