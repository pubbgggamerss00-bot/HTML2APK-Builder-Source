package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dm1 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length) {
                break;
            }
            Object obj = objArr[i7];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e6) {
                    String strD = androidx.activity.m.d(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strD), (Throwable) e6);
                    string = "<" + strD + " threw " + e6.getClass().getName() + ">";
                }
            }
            objArr[i7] = string;
            i7++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i8 = 0;
        while (true) {
            length2 = objArr.length;
            if (i6 >= length2 || (iIndexOf = str.indexOf("%s", i8)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i8, iIndexOf);
            sb.append(objArr[i6]);
            i6++;
            i8 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i8, str.length());
        if (i6 < length2) {
            sb.append(" [");
            sb.append(objArr[i6]);
            for (int i9 = i6 + 1; i9 < objArr.length; i9++) {
                sb.append(", ");
                sb.append(objArr[i9]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
