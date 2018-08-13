@file:JsModule("semantic-ui-react/dist/commonjs/modules/Search")

package com.github.underlow.semantic.modules.search

import react.RClass
import react.RProps
import react.ReactElement

external interface SearchCategoryProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var children: ReactElement?
    var className: String?
    var content: ReactElement?
    var name: String?
    var renderer: ((props: SearchCategoryProps) -> ReactElement)?
    var results: Array<dynamic>?
}

@JsName("default")
external var SearchCategory: RClass<SearchCategoryProps> = definedExternally
