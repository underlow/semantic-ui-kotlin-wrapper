@file:JsModule("semantic-ui-react/dist/commonjs/elements/ListItem")

package com.github.underlow.semantic.elements.list

import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.image.ImageProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface ListItemProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandItem<ListContentProps>?
    var description: SemanticShorthandItem<ListDescriptionProps>?
    var disabled: Boolean?
    var header: SemanticShorthandItem<ListHeaderProps>?
    var icon: SemanticShorthandItem<ListIconProps>?
    var image: SemanticShorthandItem<ImageProps>?
    var onClick: ((event: Event, data: ListItemProps) -> Unit)?
    var value: String?
}

@JsName("default")
external var ListItem: RClass<ListItemProps> = definedExternally
