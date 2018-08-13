@file:JsModule("semantic-ui-react/dist/commonjs/elements/Button")

package com.github.underlow.semantic.elements.button

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticFLOATS
import com.github.underlow.semantic.SemanticSIZES
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.label.LabelProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface ButtonProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var animated: dynamic /* Boolean | String /* "fade" */ | String /* "vertical" */ */
    var attached: dynamic /* Boolean | String /* "left" */ | String /* "right" */ | String /* "top" */ | String /* "bottom" */ */
    var basic: Boolean?
    var children: ReactElement?
    var circular: Boolean?
    var className: String?
    var color: SemanticCOLORS? //"facebook" | "google plus" |"vk" |  "twitter" | "linkedin" | "instagram" | "youtube" */
    var compact: Boolean?
    var content: ReactElement?
    var disabled: Boolean?
    var floated: SemanticFLOATS?
    var fluid: Boolean?
    var icon: Any?
    var inverted: Boolean?
    var label: SemanticShorthandItem<LabelProps>?
    var labelPosition: String? /* "left" | "right" */
    var loading: Boolean?
    var negative: Boolean?
    var onClick: ((event: Event, data: ButtonProps) -> Unit)?
    var positive: Boolean?
    var primary: Boolean?
    var secondary: Boolean?
    var size: SemanticSIZES?
    var tabIndex: dynamic /* String | Number */
    var toggle: Boolean?
}

abstract external class ButtonComponent : RClass<ButtonProps> {
    override var displayName: String? = definedExternally
    var focus: () -> Unit
}

@JsName("default")
external var Button: ButtonComponent = definedExternally