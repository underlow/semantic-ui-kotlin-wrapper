@file:JsModule("semantic-ui-react/dist/commonjs/views/Item/ItemExtra")

package com.github.underlow.semantic.views.item

import react.RClass
import react.RProps
import react.ReactElement

external interface ItemExtraProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement? // SemanticShorthandContent?
}

@JsName("default")
external var ItemExtra: RClass<ItemExtraProps> = definedExternally
