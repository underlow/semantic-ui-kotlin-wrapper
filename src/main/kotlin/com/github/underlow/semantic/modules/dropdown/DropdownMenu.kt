@file:JsModule("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownMenu")

package com.github.underlow.semantic.modules.dropdown

import com.github.underlow.semantic.SemanticShorthandContent
import react.RClass
import react.RProps
import react.ReactElement

external interface DropdownMenuProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var direction: dynamic /* String /* "left" */ | String /* "right" */ */
    var open: Boolean?
    var scrolling: Boolean?
}

@JsName("default")
external var DropdownMenu: RClass<DropdownMenuProps> = definedExternally
