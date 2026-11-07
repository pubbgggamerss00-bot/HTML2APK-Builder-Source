package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f6539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6540b;

    public l(n nVar, DisplayManager displayManager) {
        this.f6540b = nVar;
        this.f6539a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i6) {
        if (i6 == 0) {
            n.a(this.f6540b, this.f6539a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i6) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i6) {
    }
}
