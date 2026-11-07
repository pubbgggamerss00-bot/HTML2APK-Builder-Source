package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements ConsentInformation.b, ConsentInformation.a {
    public final /* synthetic */ t3 s;

    @Override // com.google.android.ump.ConsentInformation.a
    public void a(b5.c cVar) {
        t3 t3Var = this.s;
        synchronized (t3Var.f11900e) {
            t3Var.h = false;
        }
    }

    @Override // com.google.android.ump.ConsentInformation.b
    public void c() {
        t3 t3Var = this.s;
        synchronized (t3Var.f11900e) {
            t3Var.h = false;
        }
    }
}
