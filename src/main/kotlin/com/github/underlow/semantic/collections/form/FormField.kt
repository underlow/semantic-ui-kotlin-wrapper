@file:JsModule("semantic-ui-react/dist/commonjs/collections/Form")

package com.github.underlow.semantic.collections.form

import com.github.underlow.semantic.HtmlLabelProps
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.SemanticWIDTHS
import react.RClass
import react.RProps
import react.ReactElement

external interface FormFieldProps : RProps {
    var `as`: Any?
    var children: react.ReactElement?
    var className: String?
    var content: ReactElement?
    var control: Any?
    var disabled: Boolean?
    var error: Boolean?
    var inline: Boolean?
    var label: SemanticShorthandItem<HtmlLabelProps>?
    var required: Any?
    var type: String?
    var width: SemanticWIDTHS?
}

@JsName("default")
external var FormField: RClass<FormFieldProps> = definedExternally
