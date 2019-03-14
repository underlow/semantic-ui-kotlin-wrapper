@file:JsModule("semantic-ui-react/dist/commonjs/elements/List")

package com.github.underlow.semantic.elements.list

import com.github.underlow.semantic.*
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface ListProps : RProps {
    var `as`: Any?
    var animated: Boolean?
    var bulleted: Boolean?
    var celled: Boolean?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var divided: Boolean?
    var floated: SemanticFLOATS?
    var horizontal: Boolean?
    var inverted: Boolean?
    var items: SemanticShorthandCollection<ListItemProps>?
    var link: Boolean?
    var onItemClick: ((event: Event, data: ListItemProps) -> Unit)?
    var ordered: Boolean?
    var relaxed: dynamic /* Boolean | String /* "very" */ */
    var selection: Boolean?
    var size: SemanticSIZES?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
}

external interface ListComponent : RClass<ListProps>

@JsName("default")
external var List: ListComponent = definedExternally
