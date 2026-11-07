package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2342b;

    public /* synthetic */ h(int i6, Object obj) {
        this.f2341a = i6;
        this.f2342b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2341a) {
            case 0:
                zzu zzuVar = (zzu) this.f2342b;
                zzuVar.setEnabled(true);
                zzuVar.zza.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2341a) {
            case 0:
                zzu zzuVar = (zzu) this.f2342b;
                zzuVar.setEnabled(true);
                zzuVar.zza.setEnabled(true);
                break;
            default:
                ((y4.c) this.f2342b).f15271b.i(false);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2341a) {
            case 0:
                zzu zzuVar = (zzu) this.f2342b;
                zzuVar.setEnabled(false);
                zzuVar.zza.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
