@file:JsModule("semantic-ui-react/dist/commonjs/elements/Segment/SegmentGroup")

package com.github.underlow.semantic.elements.segment

import com.github.underlow.semantic.SegmentSizeProp
import com.github.underlow.semantic.SemanticShorthandContent
import react.RClass
import react.RProps
import react.ReactElement

external interface SegmentGroupProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var compact: Boolean?
    var content: SemanticShorthandContent?
    var horizontal: Boolean?
    var piled: Boolean?
    var raised: Boolean?
    var size: SegmentSizeProp?
    var stacked: Boolean?
}

@JsName("default")
external var SegmentGroup: RClass<SegmentGroupProps> = definedExternally
