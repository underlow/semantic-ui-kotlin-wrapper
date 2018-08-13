@file:JsModule("semantic-ui-react/dist/commonjs/elements/Image/Image")

package com.github.underlow.semantic.elements.image

import com.github.underlow.semantic.SemanticFLOATS
import com.github.underlow.semantic.SemanticSIZES
import com.github.underlow.semantic.SemanticVERTICALALIGNMENTS
import react.RClass
import react.RProps
import react.ReactElement

external interface ImageProps : RProps {
    var `as`: Any?
    var avatar: Boolean?
    var bordered: Boolean?
    var centered: Boolean?
    var children: ReactElement?
    var circular: Boolean?
    var className: String?
    var content: ReactElement? //SemanticShorthandContent?
    var disabled: Boolean?
    var dimmer: ReactElement? // SemanticShorthandItem<DimmerProps>?
    var floated: SemanticFLOATS?
    var fluid: Boolean?
    var hidden: Boolean?
    var href: String?
    var inline: Boolean?
    var label: ReactElement? // SemanticShorthandItem<LabelProps>?
    var rounded: Boolean?
    var size: SemanticSIZES?
    var spaced: dynamic /* Boolean | String /* "left" */ | String /* "right" */ */
    var ui: Boolean?
    var verticalAlign: SemanticVERTICALALIGNMENTS?
    var wrapped: Boolean?
    var src: String?
}

external interface ImageComponent : RClass<ImageProps>

@JsName("default")
external var Image: ImageComponent = definedExternally
