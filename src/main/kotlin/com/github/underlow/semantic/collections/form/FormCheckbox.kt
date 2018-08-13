@file:JsModule("semantic-ui-react/dist/commonjs/collections/Form")

package com.github.underlow.semantic.collections.form

import com.github.underlow.semantic.HtmlLabelProps
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.modules.checkbox.CheckboxProps
import react.RClass
import react.ReactElement

external interface FormCheckboxProps : FormFieldProps, CheckboxProps {
    override var children: ReactElement?
    override var className: String?
    override var disabled: Boolean?

    override var `as`: Any?
    override var control: Any?
    override var type: String? /* "checkbox" |"radio" */
    override var label: SemanticShorthandItem<HtmlLabelProps>?

}

@JsName("default")
external var FormCheckbox: RClass<FormCheckboxProps> = definedExternally
