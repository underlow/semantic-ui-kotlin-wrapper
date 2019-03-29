@file:JsModule("semantic-ui-react/dist/commonjs/modules/TabPane")
@file:Suppress("unused")

package com.github.underlow.semantic.modules.tab

import com.github.underlow.semantic.SemanticShorthandContent
import react.RClass
import react.RProps
import react.ReactElement

external interface TabPaneProps : RProps {
    var `as`: Any?
    var active: Boolean?
    var children: ReactElement?
    var className: String?
    var content: SemanticShorthandContent?
    var loading: Boolean?
}

@JsName("default")
external var TabPane: RClass<TabPaneProps> = definedExternally
