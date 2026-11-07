package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ui {
    public static int a(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        int i6;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i6 = length & (-4);
            if (i7 >= i6) {
                break;
            }
            int i9 = ((bytes[i7] & 255) | ((bytes[i7 + 1] & 255) << 8) | ((bytes[i7 + 2] & 255) << 16) | (bytes[i7 + 3] << 24)) * (-862048943);
            int i10 = i8 ^ (((i9 >>> 17) | (i9 << 15)) * 461845907);
            i8 = (((i10 >>> 19) | (i10 << 13)) * 5) - 430675100;
            i7 += 4;
        }
        int i11 = length & 3;
        if (i11 == 1) {
            int i12 = ((bytes[i6] & 255) | i) * (-862048943);
            i8 ^= ((i12 >>> 17) | (i12 << 15)) * 461845907;
        } else {
            if (i11 != 2) {
                i = i11 == 3 ? (bytes[i6 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i6 + 1] & 255) << 8;
            int i122 = ((bytes[i6] & 255) | i) * (-862048943);
            i8 ^= ((i122 >>> 17) | (i122 << 15)) * 461845907;
        }
        int i13 = i8 ^ length;
        int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
        int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
        return i15 ^ (i15 >>> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] b(String str, boolean z6) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i6 = 0;
        boolean z7 = false;
        int i7 = 0;
        while (i6 < str.length()) {
            int iCodePointAt = Character.codePointAt(charArray, i6);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z7) {
                        arrayList.add(new String(charArray, i7, i6 - i7));
                    }
                    arrayList.add(new String(charArray, i6, iCharCount));
                } else if (Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                    if (true != z7) {
                        i7 = i6;
                    }
                    z7 = true;
                } else if (z6 && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                    if (true != z7) {
                    }
                    z7 = true;
                } else if (z7) {
                    arrayList.add(new String(charArray, i7, i6 - i7));
                }
                z7 = false;
            }
            i6 += iCharCount;
        }
        if (z7) {
            arrayList.add(new String(charArray, i7, i6 - i7));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
