@file:JsModule("semantic-ui-react/dist/commonjs/views/Item/IconGroup")

package com.github.underlow.semantic.elements.icon

import com.github.underlow.semantic.IconSizeProp
import react.RClass
import react.RProps
import react.ReactElement

external interface IconGroupProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement?
    var size: IconSizeProp?
}

@JsName("default")
external var IconGroup: RClass<IconGroupProps> = definedExternally
