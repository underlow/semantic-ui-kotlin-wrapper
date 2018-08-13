@file:JsModule("semantic-ui-react/dist/commonjs/views/Item/ItemContent")

package com.github.underlow.semantic.views.item

import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import react.RClass
import react.RProps
import react.ReactElement

external interface ItemContentProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement? //SemanticShorthandContent?
    var description: ReactElement? //SemanticShorthandItem<ItemDescriptionProps>?
    var extra: ReactElement?//SemanticShorthandItem<ItemExtraProps>?
    var header: ReactElement?//SemanticShorthandItem<ItemHeaderProps>?
    var meta: ReactElement?//SemanticShorthandItem<ItemMetaProps>?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
}

@JsName("default")
external var ItemContent: RClass<ItemContentProps> = definedExternally
