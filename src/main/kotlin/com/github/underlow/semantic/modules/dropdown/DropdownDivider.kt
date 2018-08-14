@file:JsModule("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider")

package com.github.underlow.semantic.modules.dropdown

import react.RClass
import react.RProps

external interface DropdownDividerProps : RProps {
    var `as`: Any?
    var className: String?
}

@JsName("default")
external var DropdownDivider: RClass<DropdownDividerProps> = definedExternally
