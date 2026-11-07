package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fd0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4612a;

    public /* synthetic */ fd0(int i6) {
        this.f4612a = i6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4612a) {
            case 0:
                return new ArrayDeque();
            case 1:
                return new f0(13);
            case 2:
                Set set = Collections.EMPTY_SET;
                ih1.j(set);
                return set;
            case 3:
                return "native";
            case 4:
                return null;
            case 5:
                return new lt0();
            case 6:
                return new my0();
            case 7:
                return new n51();
            case 8:
                Object arrayList = new ArrayList();
                sn snVar = zn.Db;
                if (!((String) zzbe.zzc().a(snVar)).isEmpty()) {
                    arrayList = Arrays.asList(((String) zzbe.zzc().a(snVar)).split(","));
                }
                ih1.j(arrayList);
                return arrayList;
            case 9:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new z61(h70Var);
            case 10:
                return new cc1();
            case 11:
                return new mc1();
            default:
                return new jd1();
        }
    }
}
