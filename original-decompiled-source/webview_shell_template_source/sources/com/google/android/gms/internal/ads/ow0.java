package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ow0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r30 f7877b;

    public /* synthetic */ ow0(r30 r30Var, int i6) {
        this.f7876a = i6;
        this.f7877b = r30Var;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f7876a) {
            case 0:
                return bs1.m(new jx0(inputStream, this.f7877b));
            default:
                String str = new String(dq1.a(inputStream), StandardCharsets.UTF_8);
                r30 r30Var = this.f7877b;
                r30Var.B = str;
                return bs1.m(r30Var);
        }
    }
}
