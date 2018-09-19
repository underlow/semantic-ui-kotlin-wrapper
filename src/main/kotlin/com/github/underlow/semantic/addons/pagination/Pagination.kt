@file:JsModule("semantic-ui-react/dist/commonjs/addons/Pagination/Pagination")

package com.github.underlow.semantic.addons.pagination

import com.github.underlow.semantic.SemanticShorthandItem
import org.w3c.dom.events.Event
import react.RClass
import react.RProps

external interface PaginationProps : RProps {
    var defaultActivePage: Int? /* String | Number */
    var activePage: Int? /* String | Number */
    var boundaryRange: Int? /* String | Number */
    var ellipsisItem: SemanticShorthandItem<PaginationItemProps>?
    var firstItem: SemanticShorthandItem<PaginationItemProps>?
    var lastItem: SemanticShorthandItem<PaginationItemProps>?
    var nextItem: SemanticShorthandItem<PaginationItemProps>?
    var pageItem: SemanticShorthandItem<PaginationItemProps>?
    var prevItem: SemanticShorthandItem<PaginationItemProps>?
    var onPageChange: ((event: Event, data: PaginationProps) -> Unit)?
    var siblingRange: Int? /* String | Number */
    var totalPages: Int? /* String | Number */
}

@JsName("default")
external var Pagination: RClass<PaginationProps>