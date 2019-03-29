@file:JsModule("semantic-ui-react/dist/commonjs/elements/Label/LabelDetail")

package com.github.underlow.semantic.elements.label

import com.github.underlow.semantic.SemanticShorthandContent
import react.RClass
import react.RProps
import react.ReactElement

external interface LabelDetailProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
}

@JsName("default")
external var LabelDetail: RClass<LabelDetailProps> = definedExternally
