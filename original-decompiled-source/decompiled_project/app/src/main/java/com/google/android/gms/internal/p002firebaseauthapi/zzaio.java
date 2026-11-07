package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wa.f;

/* loaded from: classes2.dex */
public final class zzaio {
    private List<String> zza;

    public zzaio() {
        this(null);
    }

    public static zzaio zza() {
        return new zzaio(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzaio(List<String> list) {
        this.zza = new ArrayList();
    }

    public zzaio(int i10, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, f.a(list.get(i11)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.EMPTY_LIST;
    }
}
