package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7082a;

    public /* synthetic */ mc0(int i6) {
        this.f7082a = i6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7082a) {
            case 0:
                return zzv.zzp();
            case 1:
                return new me0(14);
            case 2:
                return new mj0();
            case 3:
                Set set = Collections.EMPTY_SET;
                ih1.j(set);
                return set;
            case 4:
                return null;
            case 5:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new nt0(h70Var);
            case 6:
                return new l41();
            default:
                return i3.c.f13363a;
        }
    }
}
