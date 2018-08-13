@file:JsModule("semantic-ui-react/dist/commonjs/elements/Icon/Icon")

package com.github.underlow.semantic.elements.icon

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticICONS
import com.github.underlow.semantic.SemanticSIZES
import react.RClass
import react.RProps

external interface IconProps : RProps {
    var `as`: Any?
    var bordered: Boolean?
    var circular: Boolean?
    var className: String?
    var color: SemanticCOLORS?
    var corner: Boolean?
    var disabled: Boolean?
    var fitted: Boolean?
    var flipped: String? /* "horizontally" | "vertically" */
    var inverted: Boolean?
    var link: Boolean?
    var loading: Boolean?
    var name: SemanticICONS?
    var rotated: String? /* "clockwise" | counterclockwise" */
    var size: SemanticSIZES?
    var href: String?
}

@JsName("default")
external var Icon: RClass<IconProps>

