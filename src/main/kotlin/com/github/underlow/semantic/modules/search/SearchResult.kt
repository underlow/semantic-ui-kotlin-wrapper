@file:JsModule("semantic-ui-react")

package com.github.underlow.semantic.modules.search

import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface SearchResultProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var className: String?
    var content: ReactElement?
    var description: String?
    var id: dynamic /* String | Number */
    var image: String?
    var onClick: ((event: Event, data: SearchResultProps) -> Unit)?
    var price: String?
    var renderer: ((props: SearchResultProps) -> Array<ReactElement>)?
    var title: String?
}

@JsName("default")
external var SearchResult: RClass<SearchResultProps> = definedExternally

