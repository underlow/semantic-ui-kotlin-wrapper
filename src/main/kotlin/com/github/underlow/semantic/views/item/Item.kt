@file:JsModule("semantic-ui-react/dist/commonjs/views/Item")

package com.github.underlow.semantic.views.item

import react.RClass
import react.RProps
import react.ReactElement

external interface ItemProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement? // SemanticShorthandContent?
    var description: ReactElement?//SemanticShorthandItem<ItemDescriptionProps>?
    var extra: ReactElement? //SemanticShorthandItem<ItemExtraProps>?
    var header: ReactElement?//SemanticShorthandItem<ItemHeaderProps>?
    var image: ReactElement?//SemanticShorthandItem<ItemImageProps>?
    var meta: ReactElement?//SemanticShorthandItem<ItemMetaProps>?
}

external interface ItemComponent : RClass<ItemProps>

@JsName("default")
external var Item: ItemComponent = definedExternally
