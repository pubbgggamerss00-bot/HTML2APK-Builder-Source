package com.htmltoapk.template;

import android.graphics.Bitmap;
import w2.a0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements p5.l {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12573t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12574u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12575v;

    public /* synthetic */ j0(int i6, int i7, Object obj, Object obj2) {
        this.s = i7;
        this.f12574u = obj;
        this.f12573t = i6;
        this.f12575v = obj2;
    }

    @Override // p5.l
    public final Object invoke(Object obj) {
        switch (this.s) {
            case 0:
                return ConsentFlow.privacyOptions$lambda$3((ConsentFlow) this.f12574u, this.f12573t, (p5.l) this.f12575v, (String) obj);
            default:
                a0.b bVar = (a0.b) this.f12574u;
                a0.c cVar = (a0.c) this.f12575v;
                Bitmap bitmap = (Bitmap) obj;
                kotlin.jvm.internal.j.e("bitmap", bitmap);
                if (bVar.f14876y == this.f12573t) {
                    cVar.h(bVar, bitmap);
                }
                return d5.j.f12745a;
        }
    }
}
