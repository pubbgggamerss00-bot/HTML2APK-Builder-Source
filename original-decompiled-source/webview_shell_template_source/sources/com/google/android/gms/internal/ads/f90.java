package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f90 extends pc {

    /* renamed from: c, reason: collision with root package name */
    public static final f90 f4564c = new f90();

    @Override // com.google.android.gms.internal.ads.pc
    public final sc a(String str) {
        if ("moov".equals(str)) {
            return new uc();
        }
        if (!"mvhd".equals(str)) {
            return new wc(str, 0);
        }
        vc vcVar = new vc("mvhd");
        vcVar.F = 1.0d;
        vcVar.G = 1.0f;
        vcVar.H = t92.f9150j;
        return vcVar;
    }
}
