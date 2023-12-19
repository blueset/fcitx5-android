/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * SPDX-FileCopyrightText: Copyright 2021-2023 Fcitx5 for Android Contributors
 */
package org.fcitx.fcitx5.android.input.popup

/**
 * based on
 * [fcitx5/src/im/keyboard/longpress.cpp](https://github.com/fcitx/fcitx5/blob/5.0.18/src/im/keyboard/longpress.cpp#L15)
 */
val PopupPreset: Map<String, Array<String>> = hashMapOf(
    //
    // Latin
    //
    "q" to arrayOf("1", "Q"),
    "w" to arrayOf("2", "W"),
    "f" to arrayOf("3", "F"),
    "p" to arrayOf("4", "P"),
    "g" to arrayOf("5", "G", "ğ"),
    "j" to arrayOf("6", "J"),
    "l" to arrayOf("7", "L", "ł"),
    "u" to arrayOf("8", "U", "û", "ü", "ū", "ú", "ǔ", "ù"),
    "y" to arrayOf("9", "Y", "ÿ", "ұ", "ү", "ӯ", "ў"),
    "a" to arrayOf("@", "A", "â", "ä", "ā", "á", "ǎ", "à", "æ", "ã", "å"),
    "r" to arrayOf("*", "R"),
    "s" to arrayOf("+", "S", "ß", "ś", "š", "ş"),
    "t" to arrayOf("-", "T"),
    "d" to arrayOf("=", "D", "ð"),
    "h" to arrayOf("/", "H"),
    "n" to arrayOf("#", "N", "ñ", "ń"),
    "e" to arrayOf("(", "E", "ê", "ë", "ē", "é", "ě", "è", "ė", "ę", "ȩ", "ḝ", "ə"),
    "i" to arrayOf(")", "I", "î", "ï", "ī", "í", "ǐ", "ì", "į", "ı"),
    "o" to arrayOf("&", "O", "ô", "ö", "ō", "ó", "ǒ", "ò", "œ", "ø", "õ"),
    "z" to arrayOf("'", "Z", "`", "ž", "ź", "ż"),
    "x" to arrayOf(":", "X", "×"),
    "c" to arrayOf("\"", "C", "ç", "ć", "č"),
    "v" to arrayOf("?", "V", "¿", "ü", "ǖ", "ǘ", "ǚ", "ǜ"),
    "b" to arrayOf("!", "B", "¡"),
    "k" to arrayOf("~", "K"),
    "m" to arrayOf("\\", "M"),
    ";" to arrayOf("0"),
    //
    // Upper case Latin
    //
    "Q" to arrayOf("1", "q"),
    "W" to arrayOf("2", "w"),
    "F" to arrayOf("3", "f"),
    "P" to arrayOf("4", "p"),
    "G" to arrayOf("5", "g", "Ğ"),
    "J" to arrayOf("6", "j"),
    "L" to arrayOf("7", "l", "Ł"),
    "U" to arrayOf("8", "u", "Û", "Ü", "Ù", "Ú", "Ū"),
    "Y" to arrayOf("9", "y", "Ÿ", "Ұ", "Ү", "Ӯ", "Ў"),
    "A" to arrayOf("@", "a", "Â", "Ä", "Ā", "Á", "À", "Æ", "Ã", "Å"),
    "R" to arrayOf("*", "r"),
    "S" to arrayOf("+", "s", "ẞ", "Ś", "Š", "Ş"),
    "T" to arrayOf("-", "t"),
    "D" to arrayOf("=", "d", "Ð"),
    "H" to arrayOf("/", "h"),
    "N" to arrayOf("#", "n", "Ñ", "Ń"),
    "E" to arrayOf("(", "e", "Ê", "Ë", "Ē", "É", "È", "Ė", "Ę", "Ȩ", "Ḝ", "Ə"),
    "I" to arrayOf(")", "i", "Î", "Ï", "Í", "Ī", "Į", "Ì"),
    "O" to arrayOf("&", "o", "Ô", "Ö", "Ò", "Ó", "Œ", "Ø", "Ō", "Õ"),
    "Z" to arrayOf("'", "z", "`", "Ž", "Ź", "Ż"),
    "X" to arrayOf(":", "x"),
    "C" to arrayOf("\"", "c", "Ç", "Ć", "Č"),
    "V" to arrayOf("?", "v"),
    "B" to arrayOf("!", "b", "¡"),
    "K" to arrayOf("(", "k"),
    "M" to arrayOf("\\", "m"),
    //
    // Upper case Cyrillic
    //
    "г" to arrayOf("ғ"),
    "е" to arrayOf("ё"),      // this in fact NOT the same E as before
    "и" to arrayOf("ӣ", "і"), // і is not i
    "й" to arrayOf("ј"),      // ј is not j
    "к" to arrayOf("қ", "ҝ"),
    "н" to arrayOf("ң", "һ"), // һ is not h
    "о" to arrayOf("ә", "ө"),
    "ч" to arrayOf("ҷ", "ҹ"),
    "ь" to arrayOf("ъ"),
    //
    // Cyrillic
    //
    "Г" to arrayOf("Ғ"),
    "Е" to arrayOf("Ё"),      // This In Fact Not The Same E As Before
    "И" to arrayOf("Ӣ", "І"), // І is sot I
    "Й" to arrayOf("Ј"),      // Ј is sot J
    "К" to arrayOf("Қ", "Ҝ"),
    "Н" to arrayOf("Ң", "Һ"), // Һ is not H
    "О" to arrayOf("Ә", "Ө"),
    "Ч" to arrayOf("Ҷ", "Ҹ"),
    "Ь" to arrayOf("Ъ"),
    //
    // Arabic
    //
    // This renders weirdly in text editors, but is valid code.
    "ا" to arrayOf("أ", "إ", "آ", "ء"),
    "ب" to arrayOf("پ"),
    "ج" to arrayOf("چ"),
    "ز" to arrayOf("ژ"),
    "ف" to arrayOf("ڤ"),
    "ك" to arrayOf("گ"),
    "ل" to arrayOf("لا"),
    "ه" to arrayOf("ه"),
    "و" to arrayOf("ؤ"),
    //
    // Hebrew
    //
    // Likewise, this will render oddly, but is still valid code.
    "ג" to arrayOf("ג׳"),
    "ז" to arrayOf("ז׳"),
    "ח" to arrayOf("ח׳"),
    "צ׳" to arrayOf("צ׳"),
    "ת" to arrayOf("ת׳"),
    "י" to arrayOf("ײַ"),
    "י" to arrayOf("ײ"),
    "ח" to arrayOf("ױ"),
    "ו" to arrayOf("װ"),
    //
    // Numbers
    //
    "0" to arrayOf("∅", "ⁿ", "⁰"),
    "1" to arrayOf("¹", "½", "⅓", "¼", "⅕", "⅙", "⅐", "⅛", "⅑", "⅒"),
    "2" to arrayOf("²", "⅖", "⅔"),
    "3" to arrayOf("³", "⅗", "¾", "⅜"),
    "4" to arrayOf("⁴", "⅘", "⅝", "⅚"),
    "5" to arrayOf("⁵", "⅝", "⅚"),
    "6" to arrayOf("⁶"),
    "7" to arrayOf("⁷", "⅞"),
    "8" to arrayOf("⁸"),
    "9" to arrayOf("⁹"),
    //
    // Punctuation
    //
    "." to arrayOf("…", ",", "?", "!", ":", ";", "_", "%", "$", "&"),
    "-" to arrayOf("—", "–", "·"),
    "?" to arrayOf("¿", "‽"),
    "'" to arrayOf("‘", "’", "‚", "›", "‹"),
    "!" to arrayOf("¡"),
    "\"" to arrayOf("“", "”", "„", "»", "«"),
    "/" to arrayOf("÷"),
    "#" to arrayOf("№"),
    "%" to arrayOf("‰", "℅"),
    "^" to arrayOf("↑", "↓", "←", "→"),
    "+" to arrayOf("±"),
    "<" to arrayOf("«", "≤", "‹", "⟨"),
    "=" to arrayOf("∞", "≠", "≈"),
    ">" to arrayOf("⟩", "»", "≥", "›"),
    "°" to arrayOf("′", "″"),
    "·" to arrayOf("♪", "♦", "♠", "♥", "♣"),
    //
    // Currency
    //
    "$" to arrayOf("¢", "€", "£", "¥", "₹", "₽", "₺", "₩", "₱", "₿"),
)
