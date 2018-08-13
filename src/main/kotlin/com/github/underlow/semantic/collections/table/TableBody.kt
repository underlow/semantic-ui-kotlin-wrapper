@file:JsModule("semantic-ui-react/dist/commonjs/collections/Table/TableBody")

package com.github.underlow.semantic.collections.table

import react.RClass
import react.RProps
import react.ReactElement

external interface TableBodyProps : RProps {
    var `as`: Any?
    var children: ReactElement?
    var className: String?
}

@JsName("default")
external var TableBody: RClass<TableBodyProps> = definedExternally
