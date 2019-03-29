@file:JsModule("semantic-ui-react/dist/commonjs/modules/Tab")
@file:Suppress("unused")

package com.github.underlow.semantic.modules.tab

import com.github.underlow.semantic.SemanticShorthandItem
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface TabPanesProps {
    var content: SemanticShorthandItem<TabPaneProps>?
    var menuItem: Any?
    var render: (() -> ReactElement)?
}

external interface TabProps : RProps {
    var `as`: Any?
    var defaultActiveIndex: dynamic /* String | Number */
    var activeIndex: dynamic /* String | Number */
    var menu: Any?
    var grid: Any?
    var onTabChange: ((event: Event, data: TabProps) -> Unit)?
    var panes: Array<TabPanesProps>?
    var renderActiveOnly: Boolean?
}

external interface TabComponent : RClass<TabProps>

@JsName("default")
external var Tab: TabComponent = definedExternally
