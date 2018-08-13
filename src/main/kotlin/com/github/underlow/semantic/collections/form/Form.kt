@file:JsModule("semantic-ui-react/dist/commonjs/collections/Form")

package com.github.underlow.semantic.collections.form

import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface FormProps : RProps {
    var `as`: Any?
    var action: String?
    var children: ReactElement?  // ???
    var className: String?
    var error: Boolean?
    var inverted: Boolean?
    var loading: Boolean?
    var onSubmit: ((event: Event, data: FormProps) -> Unit)?
    var reply: Boolean?
    var size: String?
    var success: Boolean?
    var unstackable: Boolean?
    var warning: Boolean?
    var widths: String?
}

external interface FormComponent : RClass<FormProps>

@JsName("default")
external var Form: FormComponent = definedExternally
