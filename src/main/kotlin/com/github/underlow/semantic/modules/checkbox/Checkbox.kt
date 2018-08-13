@file:JsModule("semantic-ui-react/dist/commonjs/modules/Checkbox")

package com.github.underlow.semantic.modules.checkbox

import com.github.underlow.semantic.HtmlLabelProps
import com.github.underlow.semantic.SemanticShorthandItem
import org.w3c.dom.events.Event
import react.RClass
import react.RProps

external interface CheckboxProps : RProps {
    var `as`: Any?
    var checked: Boolean?
    var className: String?
    var defaultChecked: Boolean?
    var defaultIndeterminate: Boolean?
    var disabled: Boolean?
    var fitted: Boolean?
    var id: dynamic /* String | Number */
    var indeterminate: Boolean?
    var label: SemanticShorthandItem<HtmlLabelProps>?
    var name: String?
    var onChange: ((event: Event, data: CheckboxProps) -> Unit)?
    var onClick: ((event: Event, data: CheckboxProps) -> Unit)?
    var onMouseDown: ((event: Event, data: CheckboxProps) -> Unit)?
    var radio: Boolean?
    var readOnly: Boolean?
    var slider: Boolean?
    var tabIndex: dynamic /* String | Number */
    var toggle: Boolean?
    var type: String? /* "checkbox" | "radio" */
    var value: dynamic /* String | Number */
}

@JsName("default")
external var Checkbox: RClass<CheckboxProps> = definedExternally
