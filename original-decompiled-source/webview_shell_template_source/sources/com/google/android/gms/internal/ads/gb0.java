package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class gb0 implements or1, fk0 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f4967t;

    /* renamed from: u, reason: collision with root package name */
    public Object f4968u;

    /* renamed from: v, reason: collision with root package name */
    public Object f4969v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4970w;

    /* renamed from: x, reason: collision with root package name */
    public Object f4971x;

    /* renamed from: y, reason: collision with root package name */
    public Object f4972y;

    public /* synthetic */ gb0(Context context, mf mfVar, VersionInfoParcel versionInfoParcel, zza zzaVar, oz0 oz0Var, fc1 fc1Var, String str) {
        this.s = context;
        this.f4967t = mfVar;
        this.f4968u = versionInfoParcel;
        this.f4969v = zzaVar;
        this.f4970w = oz0Var;
        this.f4971x = fc1Var;
        this.f4972y = str;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public /* synthetic */ fk0 a(cb1 cb1Var) {
        this.f4967t = cb1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public /* synthetic */ fk0 b(oa1 oa1Var) {
        this.f4968u = oa1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public id0 zzh() {
        ih1.k((rm0) this.f4969v, rm0.class);
        ih1.k((jk0) this.f4970w, jk0.class);
        ih1.k((ro0) this.f4971x, ro0.class);
        ih1.k((dh0) this.f4972y, dh0.class);
        return new id0((kd0) this.s, (dh0) this.f4972y, (ro0) this.f4971x, new bq(24, (byte) 0), (rm0) this.f4969v, (jk0) this.f4970w, new xj0(11), (cb1) this.f4967t, (oa1) this.f4968u);
    }

    @Override // com.google.android.gms.internal.ads.or1
    public c5.a zza() {
        zzv.zzA();
        Context context = (Context) this.s;
        cc0 cc0Var = new cc0(0, 0, 0);
        mf mfVar = (mf) this.f4967t;
        oz0 oz0Var = (oz0) this.f4970w;
        zza zzaVar = (zza) this.f4969v;
        xa0 xa0VarA = ib0.a(context, cc0Var, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, mfVar, null, (VersionInfoParcel) this.f4968u, null, zzaVar, new kk(), null, null, oz0Var, (fc1) this.f4971x);
        n70 n70Var = new n70(xa0VarA);
        xa0VarA.zzN().f4196y = new xj0(6, n70Var);
        xa0VarA.loadUrl((String) this.f4972y);
        return n70Var;
    }

    public /* synthetic */ gb0(kd0 kd0Var) {
        this.s = kd0Var;
    }
}
