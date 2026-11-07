package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wl1 extends am1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ml1 f10230x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl1(CharSequence charSequence, ml1 ml1Var) {
        super(charSequence);
        this.f10230x = ml1Var;
    }

    @Override // com.google.android.gms.internal.ads.am1
    public final int a(int i6) {
        return i6 + 1;
    }

    @Override // com.google.android.gms.internal.ads.am1
    public final int b(int i6) {
        CharSequence charSequence = this.f2798u;
        int length = charSequence.length();
        sl1.b(i6, length);
        while (i6 < length) {
            if (this.f10230x.a(charSequence.charAt(i6))) {
                return i6;
            }
            i6++;
        }
        return -1;
    }
}
