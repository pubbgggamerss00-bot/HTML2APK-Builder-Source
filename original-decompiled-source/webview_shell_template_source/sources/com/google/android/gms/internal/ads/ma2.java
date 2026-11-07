package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ma2 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oa2 f7040b;

    public ma2(oa2 oa2Var, Handler handler) {
        this.f7040b = oa2Var;
        this.f7039a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        this.f7039a.post(new la2(i6, 0, this));
    }
}
