@file:JsModule("semantic-ui-react/dist/commonjs/modules/Popup/Popup")

package com.github.underlow.semantic.modules.popup

import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.addons.PortalProps
import org.w3c.dom.events.Event
import react.RClass
import react.ReactElement

external interface PopupProps : PortalProps {
    var `as`: Any?
    var basic: Boolean?
    override var children: ReactElement?
    var className: String?
    var content: SemanticShorthandItem<PopupContentProps>?
    var context: Any?
    var flowing: Boolean?
    var header: SemanticShorthandItem<PopupHeaderProps>?
    var hideOnScroll: Boolean?
    var hoverable: Boolean?
    var inverted: Boolean?
    var horizontalOffset: Number?
    var verticalOffset: Number?
    var on: String? /* "hover" | "click" |"focus" | Array<dynamic /* String /* "hover" */ | String /* "click" */ | String /* "focus" */ */> */
    // todo: originally there should be PopupProps
    override var onClose: ((event: Event, data: PortalProps) -> Unit)?
    override var onMount: ((nothing: Nothing?, data: PortalProps) -> Unit)?
    override var onOpen: ((event: Event, data: PortalProps) -> Unit)?
    override var onUnmount: ((nothing: Nothing?, data: PortalProps) -> Unit)?
    var position: dynamic /* String /* "top left" */ | String /* "top right" */ | String /* "bottom right" */ | String /* "bottom left" */ | String /* "right center" */ | String /* "left center" */ | String /* "top center" */ | String /* "bottom center" */ */
    var size: String? /* "mini" | "tiny" |"small" | "large" | "huge" */
    var style: Any?
    override var trigger: ReactElement?
    var wide: dynamic /* Boolean | String /* "very" */ */
    var keepInViewPort: Boolean?
}

external interface PopupComponent : RClass<PopupProps>

@JsName("default")
external var Popup: PopupComponent = definedExternally
