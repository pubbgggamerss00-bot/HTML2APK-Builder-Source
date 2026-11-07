package com.google.android.gms.internal.fido;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
final class zzee {
    private static final zzeg zza = zzb(zzeg.zzd);

    private static zzeg zzb(String[] strArr) {
        zzeg zzegVarZza;
        try {
            zzegVarZza = zzeh.zza();
        } catch (NoClassDefFoundError unused) {
            zzegVarZza = null;
        }
        if (zzegVarZza != null) {
            return zzegVarZza;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzeg) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
