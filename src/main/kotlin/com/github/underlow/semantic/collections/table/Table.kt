@file:JsModule("semantic-ui-react/dist/commonjs/collections/Table/Table")

package com.github.underlow.semantic.collections.table

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticShorthandItem
import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import com.github.underlow.semantic.SemanticWIDTHS
import react.RClass
import react.RProps
import react.ReactElement

external interface TableProps : RProps {
    var `as`: Any?
    var attached: dynamic /* Boolean | String /* "top" */ | String /* "bottom" */ */
    var basic: dynamic /* Boolean | String /* "very" */ */
    var celled: dynamic /* Boolean | String /* "internally" */ */
    var children: ReactElement?
    var className: String?
    var collapsing: Boolean?
    var color: SemanticCOLORS?
    var columns: SemanticWIDTHS?
    var compact: dynamic /* Boolean | String /* "very" */ */
    var definition: Boolean?
    var fixed: Boolean?
    var footerRow: SemanticShorthandItem<TableRowProps>?
    var headerRow: SemanticShorthandItem<TableRowProps>?
    var inverted: Boolean?
    var padded: dynamic /* Boolean | String /* "very" */ */
    var renderBodyRow: ((data: Any, index: Number) -> Any)?
    var selectable: Boolean?
    var singleLine: Boolean?
    var size: dynamic /* String /* "small" */ | String /* "large" */ */
    var sortable: Boolean?
    var stackable: Boolean?
    var striped: Boolean?
    var structured: Boolean?
    var tableData: Array<Any>?
    var textAlign: dynamic /* String /* "center" */ | String /* "left" */ | String /* "right" */ */
    var unstackable: Boolean?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
}

external interface TableComponent : RClass<TableProps>

@JsName("default")
external var Table: TableComponent = definedExternally
