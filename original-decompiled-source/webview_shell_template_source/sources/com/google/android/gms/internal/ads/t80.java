package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t80 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f9125a;

    /* renamed from: b, reason: collision with root package name */
    public final b80 f9126b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9127c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9128d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9129e;

    /* renamed from: f, reason: collision with root package name */
    public float f9130f = 1.0f;

    public t80(Context context, b80 b80Var) {
        this.f9125a = (AudioManager) context.getSystemService("audio");
        this.f9126b = b80Var;
    }

    public final void a() {
        boolean z6 = this.f9128d;
        b80 b80Var = this.f9126b;
        AudioManager audioManager = this.f9125a;
        if (!z6 || this.f9129e || this.f9130f <= 0.0f) {
            if (this.f9127c) {
                if (audioManager != null) {
                    this.f9127c = audioManager.abandonAudioFocus(this) == 0;
                }
                b80Var.zzn();
                return;
            }
            return;
        }
        if (this.f9127c) {
            return;
        }
        if (audioManager != null) {
            this.f9127c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        b80Var.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        this.f9127c = i6 > 0;
        this.f9126b.zzn();
    }
}
