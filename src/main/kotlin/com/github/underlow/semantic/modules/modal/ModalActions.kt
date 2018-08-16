@file:JsModule("semantic-ui-react/dist/commonjs/modules/Modal/ModalActions")

package com.github.underlow.semantic.modules.modal

import com.github.underlow.semantic.SemanticShorthandContent
import com.github.underlow.semantic.elements.button.ButtonProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface ModalActionsProps : RProps {
    var `as`: Any?
    var actions: ReactElement? //SemanticShorthandCollection<ButtonProps>?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var onActionClick: ((event: Event, data: ButtonProps) -> Unit)?
}

@JsName("default")
external var ModalActions: RClass<ModalActionsProps> = definedExternally
