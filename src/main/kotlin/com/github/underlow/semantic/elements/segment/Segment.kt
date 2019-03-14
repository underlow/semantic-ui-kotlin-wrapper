@file:JsModule("semantic-ui-react/dist/commonjs/elements/Segment/Segment")

package com.github.underlow.semantic.elements.segment

import com.github.underlow.semantic.SemanticCOLORS
import com.github.underlow.semantic.SemanticFLOATS
import com.github.underlow.semantic.SemanticTEXTALIGNMENTS
import react.RClass
import react.RProps
import react.ReactElement

external interface SegmentProps : RProps {
    var `as`: Any?
    var attached: dynamic /* Boolean | String /* "top" */ | String /* "bottom" */ */
    var basic: Boolean?
    var children: ReactElement?
    var circular: Boolean?
    var className: String?
    var clearing: Boolean?
    var color: SemanticCOLORS?
    var compact: Boolean?
    var content: ReactElement? // SemanticShorthandContent?
    var disabled: Boolean?
    var floated: SemanticFLOATS?
    var inverted: Boolean?
    var loading: Boolean?
    var padded: dynamic /* Boolean | String /* "very" */ */
    var piled: Boolean?
    var raised: Boolean?
    var secondary: Boolean?
    var size: dynamic /* String /* "mini" */ | String /* "tiny" */ | String /* "small" */ | String /* "large" */ | String /* "big" */ | String /* "huge" */ | String /* "massive" */ */
    var stacked: Boolean?
    var tertiary: Boolean?
    var textAlign: SemanticTEXTALIGNMENTS?
    var vertical: Boolean?
    var placeholder: Boolean

}

external interface SegmentComponent : RClass<SegmentProps>

@JsName("default")
external var Segment: SegmentComponent = definedExternally
