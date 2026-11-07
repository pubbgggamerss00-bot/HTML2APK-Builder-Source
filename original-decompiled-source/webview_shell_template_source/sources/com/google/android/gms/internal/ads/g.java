package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements w80 {

    /* renamed from: o, reason: collision with root package name */
    public static final hl2 f4833o = new hl2();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4835b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4836c;

    /* renamed from: d, reason: collision with root package name */
    public final o f4837d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4838e;

    /* renamed from: f, reason: collision with root package name */
    public final cp1 f4839f;

    /* renamed from: g, reason: collision with root package name */
    public final yw f4840g;
    public final el0 h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet f4841i;

    /* renamed from: j, reason: collision with root package name */
    public h f4842j;

    /* renamed from: k, reason: collision with root package name */
    public xo0 f4843k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f4844l;

    /* renamed from: m, reason: collision with root package name */
    public int f4845m;

    /* renamed from: n, reason: collision with root package name */
    public int f4846n;

    public g(il2 il2Var) {
        Context context = il2Var.f5809a;
        this.f4834a = context;
        c cVar = new c(this, context);
        this.f4835b = cVar;
        el0 el0Var = il2Var.f5814f;
        this.h = el0Var;
        j jVar = il2Var.f5810b;
        this.f4836c = jVar;
        jVar.f5890k = el0Var;
        o oVar = new o(new s70(8, this), jVar);
        this.f4837d = oVar;
        f fVar = il2Var.f5812d;
        y5.k(fVar);
        this.f4838e = fVar;
        this.f4839f = il2Var.f5813e;
        this.f4840g = new yw(jVar, oVar);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f4841i = copyOnWriteArraySet;
        this.f4846n = 0;
        new w(new tk2());
        copyOnWriteArraySet.add(cVar);
    }

    public static void a(g gVar, long j6, long j7) {
        yw ywVar = gVar.f4840g;
        ywVar.getClass();
        try {
            ((o) ywVar.f11095u).a(j6, j7);
        } catch (wa2 e6) {
            throw new a0(e6, (w) ywVar.f11096v);
        }
    }
}
