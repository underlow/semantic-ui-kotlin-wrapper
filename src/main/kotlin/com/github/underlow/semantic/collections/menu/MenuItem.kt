@file:JsModule("semantic-ui-react/dist/commonjs/collections/Menu/MenuItem")

package com.github.underlow.semantic.collections.menu

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.icon.IconProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface MenuItemProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var children: ReactElement?
    var className: String?
    var color: SemanticCOLORS?
    var content: ReactElement?
    var disabled: Boolean?
    var fitted: dynamic /* Boolean | String /* "horizontally" */ | String /* "vertically" */ */
    var header: Boolean?
    var icon: SemanticShorthandItem<IconProps>
    var index: Number?
    var link: Boolean?
    var name: String?
    var onClick: ((event: Event, data: MenuItemProps) -> Unit)?
    var position: String?
}

external interface MenuItemComponent : RClass<MenuItemProps>

@JsName("default")
external var MenuItem: MenuItemComponent = definedExternally
