@file:JsModule("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownSearchInput")

package com.github.underlow.semantic.modules.dropdown

import org.w3c.dom.HTMLInputElement
import react.RClass
import react.RProps

external interface DropdownSearchInputProps : RProps {
    var `as`: Any?
    var autoComplete: String?
    var className: String?
    var inputRef: ((c: HTMLInputElement) -> Unit)?
    var tabIndex: dynamic /* String | Number */
    var type: String?
    var value: dynamic /* String | Number */
}

@JsName("default")
external var DropdownSearchInput: RClass<DropdownSearchInputProps> = definedExternally
