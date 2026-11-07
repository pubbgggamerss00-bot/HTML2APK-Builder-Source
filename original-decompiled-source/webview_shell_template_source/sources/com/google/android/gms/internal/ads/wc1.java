package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wc1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10159c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f10157a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final od1 f10160d = new od1();

    public wc1(int i6, int i7) {
        this.f10158b = i6;
        this.f10159c = i7;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f10157a;
            if (linkedList.isEmpty()) {
                return;
            }
            if (zzv.zzC().a() - ((ed1) linkedList.getFirst()).f4237d < this.f10159c) {
                return;
            }
            od1 od1Var = this.f10160d;
            od1Var.f7731f++;
            od1Var.f7727b.f7421t++;
            linkedList.remove();
        }
    }
}
