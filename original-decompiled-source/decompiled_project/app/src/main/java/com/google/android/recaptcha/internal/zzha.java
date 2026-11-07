package com.google.android.recaptcha.internal;

import java.util.Arrays;
import qg.o;

/* loaded from: classes2.dex */
public final class zzha implements zzgx {
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] clsArrZzf = zzgdVar.zzc().zzf(o.B(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i10, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e10) {
            throw new zzce(6, 9, e10);
        }
    }
}
