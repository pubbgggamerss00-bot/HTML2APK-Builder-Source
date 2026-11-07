package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzic implements zzih {
    private static final boolean zzb(int i10) throws IOException {
        try {
            new Socket("localhost", i10).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) throws zzce {
        ArrayList arrayList = new ArrayList(objArr.length);
        int i10 = 0;
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num == null) {
                throw new zzce(4, 5, null);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            int iIntValue = ((Number) obj2).intValue();
            if (zzb(iIntValue)) {
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList2;
    }
}
