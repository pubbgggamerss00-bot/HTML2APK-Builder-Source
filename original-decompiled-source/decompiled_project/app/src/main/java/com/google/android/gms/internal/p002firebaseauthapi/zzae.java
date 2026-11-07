package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;
import k3.b;
import m3.a;
import p5.g0;

/* loaded from: classes2.dex */
public final class zzae {
    public static String zza(String str) {
        return zzr.zzb(str);
    }

    public static String zzb(String str) {
        return zzr.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzr.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i11 = 0; i11 < objArr.length; i11++) {
                objArr[i11] = zza(objArr[i11]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) strValueOf, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < objArr.length) {
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

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String strA = b.a(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", a.a("Exception during lenientFormat for ", strA), (Throwable) e10);
            return g0.a("<", strA, " threw ", e10.getClass().getName(), ">");
        }
    }
}
