@file:JsModule("semantic-ui-react/dist/commonjs/elements/List")

package com.github.underlow.semantic.elements.list

import com.github.underlow.semantic.SemanticFLOATS
import com.github.underlow.semantic.SemanticShorthandContent
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import react.RClass
import react.RProps
import react.ReactElement

external interface ListContentProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var description: SemanticShorthandItem<ListDescriptionProps>?
    var floated: SemanticFLOATS?
    var header: SemanticShorthandItem<ListHeaderProps>?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
}

@JsName("default")
external var ListContent: RClass<ListContentProps> = definedExternally
