package com.google.android.gms.internal.consent_sdk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s0 {
    public static String a(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length = objArr.length;
            if (i6 >= length || (iIndexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, iIndexOf);
            sb.append(b(objArr[i6]));
            i7 = iIndexOf + 2;
            i6++;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i6 < length) {
            String str2 = " [";
            while (i6 < objArr.length) {
                sb.append(str2);
                sb.append(b(objArr[i6]));
                i6++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String strD = androidx.activity.m.d(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strD), (Throwable) e6);
            return "<" + strD + " threw " + e6.getClass().getName() + ">";
        }
    }
}
