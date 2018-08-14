@file:JsModule("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem")

package com.github.underlow.semantic.modules.dropdown

import com.github.underlow.semantic.HtmlSpanProps
import com.github.underlow.semantic.SemanticShorthandContent
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.icon.IconProps
import com.github.underlow.semantic.elements.image.ImageProps
import com.github.underlow.semantic.elements.label.LabelProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface DropdownItemProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var description: SemanticShorthandItem<HtmlSpanProps>?
    var disabled: Boolean?
    //  var flag: SemanticShorthandItem<FlagProps>?
    var icon: SemanticShorthandItem<IconProps>?
    var image: SemanticShorthandItem<ImageProps>?
    var label: SemanticShorthandItem<LabelProps>?
    var onClick: ((event: Event, data: DropdownItemProps) -> Unit)?
    var selected: Boolean?
    var text: SemanticShorthandContent?
    var value: dynamic /* String | Number | Boolean */
}

@JsName("default")
external var DropdownItem: RClass<DropdownItemProps> = definedExternally
