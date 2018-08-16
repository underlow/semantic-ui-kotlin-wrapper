@file:JsModule("semantic-ui-react/dist/commonjs/modules/Modal/Modal")

package com.github.underlow.semantic.modules.modal

import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.addons.PortalProps
import org.w3c.dom.events.Event
import react.RClass
import react.ReactElement

external interface ModalProps : PortalProps {
    var `as`: Any?
    var actions: SemanticShorthandItem<ModalActionsProps>?
    var basic: Boolean?
    var centered: Boolean?
    override var children: ReactElement?
    var className: String?
    var closeIcon: Any?
    var closeOnDimmerClick: Boolean?
    override var closeOnDocumentClick: Boolean?
    var content: SemanticShorthandItem<ModalContentProps>?
    override var defaultOpen: Boolean?
    var dimmer: dynamic /* Boolean | String  "blurring" | "inverted" */
    override var eventPool: String?
    var header: SemanticShorthandItem<ModalHeaderProps>?
    override var mountNode: Any?
    var onActionClick: ((event: Event, data: ModalProps) -> Unit)?
    override var onClose: ((event: Event, data: PortalProps) -> Unit)? // todo: ModalProps
    override var onMount: ((nothing: Nothing?, data: PortalProps) -> Unit)? //todo: ModalProps
    override var onOpen: ((event: Event, data: PortalProps) -> Unit)? //todo: ModalProps
    override var onUnmount: ((nothing: Nothing?, data: PortalProps) -> Unit)? //todo: ModalProps
    override var open: Boolean?
    var size: String? /* "fullscreen" | "large" | "mini" | "small" | "tiny" */
    var style: dynamic //React.CSSProperties?
    override var trigger: ReactElement?
}

external interface ModalComponent : RClass<ModalProps>

@JsName("default")
external var Modal: ModalComponent = definedExternally
