@file:JsModule("semantic-ui-react/dist/commonjs/views/Item/ItemGroup")

package com.github.underlow.semantic.views.item

import react.RClass
import react.RProps
import react.ReactElement

external interface ItemGroupProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement? //SemanticShorthandContent?
    var divided: Boolean?
    var items: ReactElement? // SemanticShorthandCollection<ItemProps>?
    var link: Boolean?
    var relaxed: dynamic /* Boolean | String /* "very" */ */
    var unstackable: Boolean?
}

@JsName("default")
external var ItemGroup: RClass<ItemGroupProps> = definedExternally
