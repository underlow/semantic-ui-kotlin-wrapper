@file:JsModule("semantic-ui-react/dist/commonjs/collections/Grid")

package com.github.underlow.semantic.collections.grid

import com.github.underlow.semantic.SemanticTEXTALIGNMENTS
import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import com.github.underlow.semantic.SemanticWIDTHS
import react.RClass
import react.RProps
import react.ReactElement

external interface GridProps : RProps {
    var `as`: Any?
    var celled: Boolean
    var centered: Boolean?
    var children: ReactElement?
    var className: String?
    var columns: SemanticWIDTHS?
    var container: Boolean?
    var divided: Boolean?
    var doubling: Boolean?
    var inverted: Boolean?
    var padded: Boolean?
    var relaxed: Boolean?
    var reversed: String?
    var stackable: Boolean?
    var stretched: Boolean?
    var textAlign: SemanticTEXTALIGNMENTS?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
    var style: String
}

external interface GridComponent : RClass<GridProps>

@JsName("default")
external var Grid: GridComponent = definedExternally

