@file:JsModule("semantic-ui-react/dist/commonjs/modules/Modal/ModalContent")

package com.github.underlow.semantic.modules.modal

import com.github.underlow.semantic.SemanticShorthandContent
import react.RClass
import react.RProps
import react.ReactElement

external interface ModalContentProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var image: Boolean?
    var scrolling: Boolean?
}

@JsName("default")
external var ModalContent: RClass<ModalContentProps> = definedExternally
