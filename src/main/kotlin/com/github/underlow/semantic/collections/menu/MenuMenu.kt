@file:JsModule("semantic-ui-react/dist/commonjs/collections/Menu/MenuMenu")

package com.github.underlow.semantic.collections.menu

import react.RClass
import react.RProps
import react.ReactElement

external interface MenuMenuProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement? //SemanticShorthandContent?
    var position: String?
}

external interface MenuMenuComponent : RClass<MenuMenuProps>


@JsName("default")
external var MenuMenu: MenuMenuComponent = definedExternally
