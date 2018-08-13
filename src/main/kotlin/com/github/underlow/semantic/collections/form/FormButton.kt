@file:JsModule("semantic-ui-react/dist/commonjs/collections/Form")

package com.github.underlow.semantic.collections.form

import com.github.underlow.semantic.HtmlLabelProps
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.button.ButtonProps
import react.RClass
import react.ReactElement

external interface FormButtonProps : FormFieldProps, ButtonProps {
    override var disabled: Boolean?
    override var className: String?
    override var children: ReactElement?

    override var `as`: Any?
    override var control: Any?
    override var label: SemanticShorthandItem<HtmlLabelProps>?
}

@JsName("default")
external var FormButton: RClass<FormButtonProps> = definedExternally
