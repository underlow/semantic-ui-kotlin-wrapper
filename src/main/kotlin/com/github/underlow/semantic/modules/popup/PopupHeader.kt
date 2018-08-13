@file:JsModule("semantic-ui-react/dist/commonjs/modules/Popup/PopupHeader")

package com.github.underlow.semantic.modules.popup

import react.RClass
import react.RProps
import react.ReactElement

external interface PopupHeaderProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement?//SemanticShorthandContent?
}

@JsName("default")
external var PopupHeader: RClass<PopupHeaderProps> = definedExternally
