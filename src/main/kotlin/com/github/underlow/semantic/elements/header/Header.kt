@file:JsModule("semantic-ui-react/dist/commonjs/elements/Header")

package com.github.underlow.semantic.elements.header

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticFLOATS
import com.github.underlow.semantic.SemanticTEXTALIGNMENTS
import react.RClass
import react.RProps
import react.ReactElement

external interface HeaderProps : RProps {
    var `as`: Any?
    var attached: dynamic /* Boolean | String /* "top" */ | String /* "bottom" */ */
    var block: Boolean?
    var children: ReactElement?
    var className: String?
    var color: SemanticCOLORS?
    var content: ReactElement?
    var disabled: Boolean?
    var dividing: Boolean?
    var floated: SemanticFLOATS?
    var icon: Any?
    var image: Any?
    var inverted: Boolean?
    var size: String? /* "tiny" | "small" | "medium" | "large" | "huge" */
    var sub: Boolean?
    var subheader: Any?
    var textAlign: SemanticTEXTALIGNMENTS?
}

external interface HeaderComponent : RClass<HeaderProps>

@JsName("default")
external var Header: HeaderComponent = definedExternally
