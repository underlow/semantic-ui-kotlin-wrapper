@file:Suppress("unused")

package com.github.underlow.semantic

import com.github.underlow.semantic.modules.tab.TabPanesProps
import react.ReactElement


typealias SemanticShorthandCollection<T> = Array<SemanticShorthandItem<T>>;
//typealias SemanticShorthandContent = ReactElement;
typealias SemanticShorthandItem<T> = Any // ReactElement | T;

typealias SemanticCOLORS = String // 'red' | 'orange' | 'yellow' | 'olive' | 'green' | 'teal' | 'blue' | 'violet' | 'purple' | 'pink' | 'brown' | 'grey' | 'black';
typealias SemanticSIZES = String // 'mini' | 'tiny' | 'small' | 'medium' | 'large' | 'big' | 'huge' | 'massive';

typealias SemanticFLOATS = String // 'left' | 'right';

typealias SemanticTEXTALIGNMENTS = String // 'left' | 'center' | 'right' | 'justified';
typealias SemanticVERTICALALIGNMENTS = String // 'top' | 'middle' | 'bottom';

typealias SemanticWIDTHSNUMBER = Int // 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16;
typealias SemanticWIDTHSSTRING = String // '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '10' | '11' | '12' | '13' | '14' | '15' | '16' |
//    'one' | 'two' | 'three' | 'four' | 'five' | 'six' | 'seven' | 'eight' |
//    'nine' | 'ten' | 'eleven' | 'twelve' | 'thirteen' | 'fourteen' | 'fifteen' | 'sixteen';

typealias SemanticWIDTHS = Any // SemanticWIDTHSNUMBER | SemanticWIDTHSSTRING;
typealias IconSizeProp = String //'mini' | 'tiny' | 'small' | 'large' | 'big' | 'huge' | 'massive'

typealias SemanticShorthandContent = ReactElement

typealias SegmentSizeProp = String // 'mini' | 'tiny' | 'small' | 'large' | 'big' | 'huge' | 'massive'

/**
 * use like
 * attrs.color = SemanticColor.red.name
 */
@Suppress("EnumEntryName")
enum class SemanticColor {
    red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black
}

@Suppress("EnumEntryName")
enum class SemanticSizes {
    mini, tiny, small, medium, large, big, huge, massive
}

@Suppress("EnumEntryName")
enum class SemanticIconSize {
    mini, tiny, small, large, big, huge, massive
}

@Suppress("EnumEntryName")
enum class SemanticSegmentSize {
    mini, tiny, small, large, big, huge, massive
}

@Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
fun buildTab(block: TabPanesProps.() -> Unit): TabPanesProps {
    val tbp = js("{}") as TabPanesProps
    tbp.block()
    return tbp
}