package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class io extends jo {
    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        while (i7 < str.length() && str.charAt(i7) == ',') {
            i7++;
        }
        while (length > 0) {
            int i8 = length - 1;
            if (str.charAt(i8) != ',') {
                break;
            }
            length = i8;
        }
        if (length < i7) {
            return null;
        }
        if (i7 != 0) {
            i6 = i7;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i6, length);
    }

    @Override // com.google.android.gms.internal.ads.jo
    public final String a(String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        return TextUtils.isEmpty(strB) ? strB2 : TextUtils.isEmpty(strB2) ? strB : androidx.activity.m.d(strB, ",", strB2);
    }
}
