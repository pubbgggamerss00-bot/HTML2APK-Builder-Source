package com.google.android.gms.internal.fido;

import java.util.logging.Level;
import java.util.logging.Logger;
import k3.b;
import p5.g0;

/* loaded from: classes2.dex */
public final class zzbo {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strA;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strA = "null";
            } else {
                try {
                    strA = obj.toString();
                } catch (Exception e10) {
                    String strA2 = b.a(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strA2), (Throwable) e10);
                    strA = g0.a("<", strA2, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i11] = strA;
            i11++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i12, iIndexOf);
            sb.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
