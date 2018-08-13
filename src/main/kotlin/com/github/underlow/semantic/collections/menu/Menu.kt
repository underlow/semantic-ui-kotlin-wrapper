@file:JsModule("semantic-ui-react/dist/commonjs/collections/Menu")

package com.github.underlow.semantic.collections.menu

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticWIDTHS
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface MenuProps : RProps {
    var `as`: Any?
    var activeIndex: dynamic /* String | Number */
    var attached: dynamic /* Boolean | String /* "bottom" */ | String /* "top" */ */
    var borderless: Boolean?
    var children: ReactElement?
    var className: String?
    var color: SemanticCOLORS?
    var compact: Boolean?
    var defaultActiveIndex: dynamic /* String | Number */
    var fixed: String?
    var floated: Boolean?
    var fluid: Boolean?
    var icon: Boolean?
    var inverted: Boolean?
    //    var items: SemanticShorthandCollection<MenuItemProps>?
    var onItemClick: ((event: Event, data: MenuItemProps) -> Unit)?
    var pagination: Boolean?
    var pointing: Boolean?
    var secondary: Boolean?
    var size: String?
    var stackable: Boolean?
    var tabular: Boolean?
    var text: Boolean?
    var vertical: Boolean?
    var widths: SemanticWIDTHS?
}

external interface MenuComponent : RClass<MenuProps>

@JsName("default")
external var Menu: MenuComponent = definedExternally
