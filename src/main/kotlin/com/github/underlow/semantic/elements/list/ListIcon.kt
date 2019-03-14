@file:JsModule("semantic-ui-react/dist/commonjs/elements/ListIcon")

package com.github.underlow.semantic.elements.list

import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import com.github.underlow.semantic.elements.icon.IconProps
import react.RClass

external interface ListIconProps : IconProps {
    override var className: String?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
}

@JsName("default")
external var ListIcon: RClass<ListIconProps> = definedExternally
