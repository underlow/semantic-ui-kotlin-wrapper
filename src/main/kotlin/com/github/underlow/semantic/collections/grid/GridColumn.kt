@file:JsModule("semantic-ui-react/dist/commonjs/collections/Grid/GridColumn")

package com.github.underlow.semantic.collections.grid

import com.github.underlow.semantic.*
import react.RClass
import react.RProps
import react.ReactElement

external interface GridColumnProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var color: SemanticCOLORS?
    var computer: SemanticWIDTHS?
    var floated: SemanticFLOATS?
    var largeScreen: SemanticWIDTHS?
    var mobile: SemanticWIDTHS?
    var only: String?
    var stretched: Boolean?
    var tablet: SemanticWIDTHS?
    var textAlign: SemanticTEXTALIGNMENTS?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
    var widescreen: SemanticWIDTHS?
    var width: SemanticWIDTHS?
    var style: String
}


@JsName("default")
external var GridColumn: RClass<GridColumnProps> = definedExternally
