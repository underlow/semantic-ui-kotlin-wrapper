@file:JsModule("semantic-ui-react/dist/commonjs/collections/Form/FormInput")

package com.github.underlow.semantic.collections.form

import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.input.InputProps
import com.github.underlow.semantic.elements.label.LabelProps
import react.RClass

external interface FormInputProps : FormFieldProps, InputProps {
    override var `as`: Any?
    override var control: Any?
    override var label: SemanticShorthandItem<LabelProps>?
}

@JsName("default")
external var FormInput: RClass<FormInputProps> = definedExternally
