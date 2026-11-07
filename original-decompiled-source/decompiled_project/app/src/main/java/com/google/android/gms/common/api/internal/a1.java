package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.h;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a1 extends kb.d implements h.a, h.b {

    /* renamed from: j, reason: collision with root package name */
    public static final jb.b f5930j = jb.e.f15676a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5931a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5932b;

    /* renamed from: c, reason: collision with root package name */
    public final jb.b f5933c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5934d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.internal.d f5935e;

    /* renamed from: f, reason: collision with root package name */
    public jb.f f5936f;

    /* renamed from: i, reason: collision with root package name */
    public m0 f5937i;

    public a1(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f5931a = context;
        this.f5932b = handler;
        this.f5935e = dVar;
        this.f5934d = dVar.f6091b;
        this.f5933c = f5930j;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void A() {
        this.f5936f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void b(pa.a aVar) {
        this.f5937i.b(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void c(int i10) {
        m0 m0Var = this.f5937i;
        j0 j0Var = (j0) m0Var.f6021f.f5977j.get(m0Var.f6017b);
        if (j0Var != null) {
            if (j0Var.f6000k) {
                j0Var.p(new pa.a(17));
            } else {
                j0Var.c(i10);
            }
        }
    }
}
