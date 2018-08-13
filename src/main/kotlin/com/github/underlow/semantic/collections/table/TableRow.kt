@file:JsModule("semantic-ui-react/dist/commonjs/collections/Table/TableRow")

package com.github.underlow.semantic.collections.table

import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import react.RClass
import react.RProps
import react.ReactElement

external interface TableRowProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var cellAs: Any?
    var cells: ReactElement? //  SemanticShorthandCollection<TableCellProps>?
    var children: ReactElement?
    var className: String?
    var disabled: Boolean?
    var error: Boolean?
    var negative: Boolean?
    var positive: Boolean?
    var textAlign: String? /* "center" |"left" | "right" */
    var verticalAlign: SemanticVERTICALALIGNMENTS?
    var warning: Boolean?
}

@JsName("default")
external var TableRow: RClass<TableRowProps> = definedExternally
