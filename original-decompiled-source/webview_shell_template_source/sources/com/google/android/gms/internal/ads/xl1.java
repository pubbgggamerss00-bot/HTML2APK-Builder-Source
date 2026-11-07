package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xl1 extends am1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ej0 f10625x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl1(CharSequence charSequence, ej0 ej0Var) {
        super(charSequence);
        this.f10625x = ej0Var;
    }

    @Override // com.google.android.gms.internal.ads.am1
    public final int a(int i6) {
        return ((Matcher) this.f10625x.f4318t).end();
    }

    @Override // com.google.android.gms.internal.ads.am1
    public final int b(int i6) {
        ej0 ej0Var = this.f10625x;
        if (((Matcher) ej0Var.f4318t).find(i6)) {
            return ((Matcher) ej0Var.f4318t).start();
        }
        return -1;
    }
}
