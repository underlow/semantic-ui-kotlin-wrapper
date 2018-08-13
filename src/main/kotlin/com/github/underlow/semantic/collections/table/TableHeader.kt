@file:JsModule("semantic-ui-react/dist/commonjs/collections/Table/TableHeader")

package com.github.underlow.semantic.collections.table

import react.RClass
import react.RProps
import react.ReactElement

external interface TableHeaderProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
    var content: ReactElement?
    var fullWidth: Boolean?
}

@JsName("default")
external var TableHeader: RClass<TableHeaderProps> = definedExternally
