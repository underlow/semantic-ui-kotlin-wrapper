@file:JsModule("semantic-ui-react/dist/commonjs")

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)

package com.github.underlow.semantic

import react.RProps
import react.ReactElement

external interface HtmlLabelProps : RProps {
    var children: ReactElement?
}

external interface HtmlIframeProps : RProps {
    var src: String?
}

external interface HtmlImageProps : RProps {
    var src: String?
}

external interface HtmlInputrops : RProps {
    var type: String?
}

external interface HtmlSpanProps : RProps {
    var children: ReactElement?
}
