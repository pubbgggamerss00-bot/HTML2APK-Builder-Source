package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;

/* loaded from: classes2.dex */
public abstract class u<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    public final pa.c[] f6053a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6054b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6055c;

    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        public q f6056a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6057b;

        /* renamed from: c, reason: collision with root package name */
        public pa.c[] f6058c;

        /* renamed from: d, reason: collision with root package name */
        public int f6059d;

        public final b1 a() {
            com.google.android.gms.common.internal.p.a("execute parameter required", this.f6056a != null);
            return new b1(this, this.f6058c, this.f6057b, this.f6059d);
        }
    }

    public u(pa.c[] cVarArr, boolean z10, int i10) {
        this.f6053a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f6054b = z11;
        this.f6055c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        a<A, ResultT> aVar = new a<>();
        aVar.f6057b = true;
        aVar.f6059d = 0;
        return aVar;
    }
}
