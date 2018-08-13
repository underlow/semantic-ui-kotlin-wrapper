@file:JsModule("semantic-ui-react/dist/commonjs/elements/Input")

package com.github.underlow.semantic.elements.input

import com.github.underlow.semantic.SemanticSIZES
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface InputProps : RProps {
    var `as`: Any?
    var action: dynamic
    var actionPosition: String?
    var children: ReactElement?
    var className: String?
    var disabled: Boolean?
    var error: Boolean?
    var fluid: Boolean?
    var focus: Boolean?
    var icon: dynamic /* Any | SemanticShorthandItem<InputProps> */
    var iconPosition: String? /* "left" */
    var input: dynamic // SemanticShorthandItem<HtmlInputrops>?
    var inverted: Boolean?
    var label: dynamic // SemanticShorthandItem<LabelProps>?
    var labelPosition: String /* "left" |"right" | "left corner" | "right corner" */
    var loading: Boolean?
    var onChange: ((event: Event, data: InputOnChangeData) -> Unit)?
    var size: SemanticSIZES?
    var tabIndex: dynamic /* String | Number */
    var transparent: Boolean?
    var type: String?
    var placeholder: String?
}

external interface InputOnChangeData : InputProps {
    var value: String
}

@JsName("default")
external var Input: RClass<InputProps>