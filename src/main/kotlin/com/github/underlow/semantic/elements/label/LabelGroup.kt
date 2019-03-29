@file:JsModule("semantic-ui-react/dist/commonjs/elements/Label/LabelGroup")

package com.github.underlow.semantic.elements.label

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticSIZES
import com.github.underlow.semantic.SemanticShorthandContent
import react.RClass
import react.RProps
import react.ReactElement

external interface LabelGroupProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var circular: Boolean?
    var className: String?
    var color: SemanticCOLORS?
    var content: SemanticShorthandContent?
    var size: SemanticSIZES?
    var tag: Boolean?
}

@JsName("default")
external var LabelGroup: RClass<LabelGroupProps> = definedExternally
