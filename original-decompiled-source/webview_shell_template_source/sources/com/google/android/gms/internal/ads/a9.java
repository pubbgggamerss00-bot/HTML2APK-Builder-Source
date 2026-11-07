package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a9 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2615e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f2616a;

    /* renamed from: b, reason: collision with root package name */
    public int f2617b;

    /* renamed from: c, reason: collision with root package name */
    public int f2618c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2619d;

    public final void a(int i6, int i7, byte[] bArr) {
        if (this.f2616a) {
            int i8 = i7 - i6;
            byte[] bArr2 = this.f2619d;
            int length = bArr2.length;
            int i9 = this.f2617b + i8;
            if (length < i9) {
                this.f2619d = Arrays.copyOf(bArr2, i9 + i9);
            }
            System.arraycopy(bArr, i6, this.f2619d, this.f2617b, i8);
            this.f2617b += i8;
        }
    }
}
