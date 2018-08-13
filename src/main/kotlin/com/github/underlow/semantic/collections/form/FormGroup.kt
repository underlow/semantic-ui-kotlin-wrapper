@file:JsModule("semantic-ui-react/dist/commonjs/collections/Form/FormInput")

package com.github.underlow.semantic.collections.form

import com.github.underlow.semantic.SemanticWIDTHS
import react.RClass
import react.RProps
import react.ReactElement

external interface FormGroupProps : RProps {
    operator fun set(key: String, value: Any)
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var grouped: Boolean?
    var inline: Boolean?
    var unstackable: Boolean?
    var widths: SemanticWIDTHS?
}

@JsName("default")
external var FormGroup: RClass<FormGroupProps> = definedExternally
