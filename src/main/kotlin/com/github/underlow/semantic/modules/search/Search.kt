@file:JsModule("semantic-ui-react/dist/commonjs/modules/Search")
@file:Suppress("unused")

package com.github.underlow.semantic.modules.search

import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.elements.input.InputProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface SearchProps : RProps {
    var `as`: Any?
    var defaultOpen: Boolean?
    var defaultValue: String?
    var icon: Any?
    var minCharacters: Number?
    var noResultsDescription: ReactElement?
    var noResultsMessage: ReactElement?
    var open: Boolean?
    var results: Array<SearchResultProps>? // categories?
    var selectFirstResult: Boolean?
    var showNoResults: Boolean?
    var value: String?
    var categoryRenderer: ((props: SearchCategoryProps) -> ReactElement)?
    var resultRenderer: ((props: SearchResultProps) -> Array<ReactElement>)?
    var onBlur: ((event: Event, data: SearchProps) -> Unit)?
    var onFocus: ((event: Event, data: SearchProps) -> Unit)?
    var onMouseDown: ((event: Event, data: SearchProps) -> Unit)?
    var onResultSelect: ((event: Event, data: SearchResultData) -> Unit)?
    var onSearchChange: ((event: Event, data: SearchProps) -> Unit)?
    var onSelectionChange: ((event: Event, data: SearchResultData) -> Unit)?
    var aligned: String?
    var category: Boolean?
    var className: String?
    var fluid: Boolean?
    var input: SemanticShorthandItem<InputProps>?
    var loading: Boolean?
    var size: String?  /* "mini" | "tiny"  |"small" |"large" |"big" |"huge" |"massive" */
}

external interface SearchResultData : SearchProps {
    var result: Any? // duck typing ???
}

@Suppress("PropertyName")
external interface SearchComponent : RClass<SearchProps>

@JsName("default")
external val Search: SearchComponent = definedExternally
