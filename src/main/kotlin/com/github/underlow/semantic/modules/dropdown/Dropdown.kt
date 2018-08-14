@file:JsModule("semantic-ui-react/dist/commonjs/modules/Dropdown")

package com.github.underlow.semantic.modules.dropdown

import com.github.underlow.semantic.elements.label.LabelProps
import org.w3c.dom.events.Event
import react.RClass
import react.RProps
import react.ReactElement

external interface DropdownProps : RProps {
    var `as`: Any?
    var additionLabel: dynamic /* String | Number */
    var additionPosition: String? /* "top" | "bottom" */
    var allowAdditions: Boolean?
    var basic: Boolean?
    var button: Boolean?
    var children: ReactElement?
    var className: String?
    var closeOnBlur: Boolean?
    var closeOnChange: Boolean?
    var compact: Boolean?
    var deburr: Boolean?
    var defaultOpen: Boolean?
    var defaultSearchQuery: String?
    var defaultSelectedLabel: dynamic /* String | Number */
    var defaultUpward: Boolean?
    var defaultValue: dynamic /* String | Number | Boolean | Array<dynamic /* String | Number | Boolean */> */
    var direction: dynamic /* String /* "left" */ | String /* "right" */ */
    var disabled: Boolean?
    var error: Boolean?
    var floating: Boolean?
    var fluid: Boolean?
    var header: ReactElement?
    var icon: Any?
    var inline: Boolean?
    var item: Boolean?
    var labeled: Boolean?
    var lazyLoad: Boolean?
    var loading: Boolean?
    var minCharacters: Number?
    var multiple: Boolean?
    var noResultsMessage: String?
    var onAddItem: ((event: Event, data: DropdownProps) -> Unit)?
    var onBlur: ((event: Event, data: DropdownProps) -> Unit)?
    var onChange: ((event: Event, data: DropdownProps) -> Unit)?
    var onClick: ((event: Event, data: DropdownProps) -> Unit)?
    var onClose: ((event: Event, data: DropdownProps) -> Unit)?
    var onFocus: ((event: Event, data: DropdownProps) -> Unit)?
    var onLabelClick: ((event: Event, data: LabelProps) -> Unit)?
    var onMouseDown: ((event: Event, data: DropdownProps) -> Unit)?
    var onOpen: ((event: Event, data: DropdownProps) -> Unit)?
    var onSearchChange: ((event: Event, data: DropdownOnSearchChangeData) -> Unit)?
    var open: Boolean?
    var openOnFocus: Boolean?
    var options: Array<DropdownItemProps>?
    var placeholder: String?
    var pointing: dynamic /* Boolean |  "top" | "bottom" | "left" | "right" | "top left" | "top right" | "bottom left" | "bottom right" */
    var renderLabel: ((item: DropdownItemProps, index: Number, defaultLabelProps: LabelProps) -> Any)?
    var scrolling: Boolean?
    var search: dynamic /* Boolean | (options: Array<DropdownItemProps>, value: String) -> Array<DropdownItemProps> */
    var searchInput: Any?
    var searchQuery: String?
    var selectOnBlur: Boolean?
    var selectOnNavigation: Boolean?
    var selectedLabel: dynamic /* String | Number */
    var selection: Any?
    var simple: Boolean?
    var tabIndex: dynamic /* String | Number */
    var text: String?
    var trigger: ReactElement?
    var value: dynamic /* String | Number | Boolean | Array<dynamic /* String | Number | Boolean */> */
    var upward: Boolean?
    var wrapSelection: Boolean?
}

external interface DropdownOnSearchChangeData : DropdownProps {
    override var searchQuery: String?
}

external interface DropdownComponent : RClass<DropdownProps>

@JsName("default")
external var Dropdown: DropdownComponent = definedExternally
