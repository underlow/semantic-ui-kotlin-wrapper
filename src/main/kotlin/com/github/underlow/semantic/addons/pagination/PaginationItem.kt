@file:JsModule("semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem")

package com.github.underlow.semantic.addons.pagination

import org.w3c.dom.events.Event
import react.RClass
import react.RProps

external interface PaginationItemProps : RProps {
    var active: Boolean?
    var disabled: Boolean?
    var onClick: ((event: Event, data: PaginationItemProps) -> Unit)?
    var onKeyDown: ((event: Event, data: PaginationItemProps) -> Unit)?
    var type: String?  /* "ellipsisItem" | "firstItem" | "prevItem" | "pageItem" | "nextItem" | "lastItem"  */
}

@JsName("default")
external var PaginationItem: RClass<PaginationItemProps>
