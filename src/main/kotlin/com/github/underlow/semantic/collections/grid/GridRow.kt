@file:JsModule("semantic-ui-react/dist/commonjs/collections/Grid/GridRow")

package com.github.underlow.semantic.collections.grid

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticWIDTHS
import react.RClass
import react.RProps
import react.ReactElement

external interface GridRowProps : RProps {
    var `as`: Any?
    var centered: Boolean?
    var children: ReactElement?
    var className: String?
    var color: SemanticCOLORS?
    var columns: SemanticWIDTHS?
    var divided: Boolean?
    var only: String? // typealias GridOnlyProp = String //| 'computer' | 'largeScreen' | 'mobile' | 'tablet mobile' | 'tablet' | 'widescreen';
    var reversed: String? //export type GridReversedProp = string | 'computer' | 'computer vertically' | 'mobile' | 'mobile vertically' | 'tablet' | 'tablet vertically';
    var stretched: Boolean?
//    var textAlign: SemanticTEXTALIGNMENTS? get() = definedExternally; set(value) = definedExternally
//    var verticalAlign: SemanticVERTICALALIGNMENTS? get() = definedExternally; set(value) = definedExternally
}

@JsName("default")
external var GridRow: RClass<GridRowProps> = definedExternally
