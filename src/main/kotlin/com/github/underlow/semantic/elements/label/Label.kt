@file:JsModule("semantic-ui-react/dist/commonjs/elements/Label")

package com.github.underlow.semantic.elements.label

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticSIZES
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.icon.IconProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface LabelProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var attached: String? /* "top" | "bottom" | "top right" | "top left" | "bottom left" | "bottom right" */
    var basic: Boolean?
    var children: ReactElement?
    var circular: Boolean?
    var className: String?
    var color: SemanticCOLORS?
    var content: ReactElement?
    var corner: dynamic /* Boolean | String /* "left" */ | String /* "right" */ */
    //        var detail: SemanticShorthandItem<LabelDetailProps>? get() = definedExternally; set(value) = definedExternally
    var empty: Any?
    var floating: Boolean?
    var horizontal: Boolean?
    var icon: SemanticShorthandItem<IconProps>?
    var image: Any?
    var onClick: ((event: Event, data: LabelProps) -> Unit)?
    var onRemove: ((event: Event, data: LabelProps) -> Unit)?
    var pointing: dynamic /* Boolean | String /* "left" */ | String /* "right" */ | String /* "above" */ | String /* "below" */ */
    var removeIcon: SemanticShorthandItem<IconProps>?
    var ribbon: dynamic /* Boolean | String /* "right" */ */
    var size: SemanticSIZES?
    var tag: Boolean?
}

external interface LabelComponent : RClass<LabelProps>

@JsName("default")
external var Label: LabelComponent = definedExternally
