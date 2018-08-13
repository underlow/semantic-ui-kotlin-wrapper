@file:JsModule("semantic-ui-react/dist/commonjs/collections/Table/TableHeaderCell")

package com.github.underlow.semantic.collections.table

import react.RClass

external interface TableHeaderCellProps : TableCellProps {
    override var `as`: Any?
    override var className: String?
    var sorted: String? // "ascending" | "descending"
}

@JsName("default")
external var TableHeaderCell: RClass<TableHeaderCellProps> = definedExternally
