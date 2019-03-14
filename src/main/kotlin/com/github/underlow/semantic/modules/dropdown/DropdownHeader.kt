@file:JsModule("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownHeader")

package com.github.underlow.semantic.modules.dropdown

import com.github.underlow.semantic.SemanticShorthandContent
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.icon.IconProps
import react.RClass
import react.RProps
import react.ReactElement

external interface DropdownHeaderProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var icon: SemanticShorthandItem<IconProps>?
}

@JsName("default")
external var DropdownHeader: RClass<DropdownHeaderProps> = definedExternally
