@file:JsModule("semantic-ui-react")

package com.github.underlow.semantic.modules.search

import react.RClass
import react.RProps
import react.ReactElement

external interface SearchResultsProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement?
}

@JsName("default")
external var SearchResults: RClass<SearchResultsProps> = definedExternally
