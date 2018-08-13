@file:JsModule("semantic-ui-react/dist/commonjs/collections/Menu/MenuHeader")

package com.github.underlow.semantic.collections.menu

import react.RClass
import react.RProps
import react.ReactElement

external interface MenuHeaderProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement?
}

@JsName("default")
external var MenuHeader: RClass<MenuHeaderProps> = definedExternally
