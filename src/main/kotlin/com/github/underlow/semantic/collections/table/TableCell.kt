@file:JsModule("semantic-ui-react/dist/commonjs/collections/Table/TableCell")

package com.github.underlow.semantic.collections.table

import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.SemanticTEXTALIGNMENTS
import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import com.github.underlow.semantic.SemanticWIDTHS
import com.github.underlow.semantic.elements.icon.IconProps
import react.RClass
import react.RProps
import react.ReactElement

external interface TableCellProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var children: ReactElement?
    var className: String?
    var collapsing: Boolean?
    var content: ReactElement? //  SemanticShorthandContent?
    var disabled: Boolean?
    var error: Boolean?
    var icon: SemanticShorthandItem<IconProps>?
    var negative: Boolean?
    var positive: Boolean?
    var selectable: Boolean?
    var singleLine: Boolean?
    var textAlign: SemanticTEXTALIGNMENTS?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
    var warning: Boolean?
    var width: SemanticWIDTHS?
}

@JsName("default")
external var TableCell: RClass<TableCellProps> = definedExternally
