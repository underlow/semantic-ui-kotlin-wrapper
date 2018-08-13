@file:JsModule("semantic-ui-react/dist/commonjs/views/Item/ItemMeta")

package com.github.underlow.semantic.views.item

import react.RClass
import react.RProps
import react.ReactElement

external interface ItemMetaProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement? // SemanticShorthandContent?
}

@JsName("default")
external var ItemMeta: RClass<ItemMetaProps> = definedExternally
