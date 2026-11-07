package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 extends Exception {
    public final c3.b s;

    public h0(c3.b bVar) {
        l.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f2166t == 0 || bVar.f2167u == null) ? false : true);
        this.s = bVar;
    }
}
