package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj0 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10206d;

    public /* synthetic */ wj0(Object obj, Object obj2, Object obj3, int i6) {
        this.f10203a = i6;
        this.f10204b = obj;
        this.f10205c = obj2;
        this.f10206d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f10203a) {
            case 0:
                tb1 tb1Var = (tb1) obj;
                zzau zzauVar = new zzau((Context) this.f10204b);
                zzauVar.zzp(tb1Var.B);
                zzauVar.zzq(tb1Var.C.toString());
                zzauVar.zzo(((VersionInfoParcel) this.f10205c).afmaVersion);
                zzauVar.zzn(((ec1) this.f10206d).f4211f);
                return zzauVar;
            default:
                xa0 xa0Var = (xa0) this.f10204b;
                if (((tb1) this.f10205c).M) {
                    xa0Var.z();
                }
                ss0 ss0Var = (ss0) this.f10206d;
                xa0Var.i0();
                xa0Var.onPause();
                return ss0Var.s();
        }
    }
}
