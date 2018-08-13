@file:JsModule("semantic-ui-react/dist/commonjs/addons/Portal/Portal")

package com.github.underlow.semantic.addons

import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface PortalProps : RProps {
    var children: ReactElement?
    var closeOnDocumentClick: Boolean?
    var closeOnEscape: Boolean?
    var closeOnPortalMouseLeave: Boolean?
    var closeOnTriggerBlur: Boolean?
    var closeOnTriggerClick: Boolean?
    var closeOnTriggerMouseLeave: Boolean?
    var defaultOpen: Boolean?
    var eventPool: String?
    var mountNode: Any?
    var mouseEnterDelay: Number?
    var mouseLeaveDelay: Number?
    var onClose: ((event: Event, data: PortalProps) -> Unit)?
    var onMount: ((nothing: Nothing?, data: PortalProps) -> Unit)?
    var onOpen: ((event: Event, data: PortalProps) -> Unit)?
    var onUnmount: ((nothing: Nothing?, data: PortalProps) -> Unit)?
    var open: Boolean?
    var openOnTriggerClick: Boolean?
    var openOnTriggerFocus: Boolean?
    var openOnTriggerMouseEnter: Boolean?
    var trigger: ReactElement?
    var triggerRef: ((node: HTMLElement) -> Unit)?
}

@JsName("default")
external var Portal: RClass<PortalProps>
