package com.github.underlow.semantic

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
