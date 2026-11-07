package ld;

import com.google.android.gms.common.api.internal.c;
import com.google.crypto.tink.shaded.protobuf.l1;

/* loaded from: classes2.dex */
public final class q implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17022b;

    public q(r rVar, l lVar, l1 l1Var) {
        this.f17022b = rVar;
        this.f17021a = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        this.f17022b.f17025c = z10;
        if (z10) {
            this.f17021a.a();
        } else if (this.f17022b.a()) {
            this.f17021a.b(this.f17022b.f17027e - System.currentTimeMillis());
        }
    }
}
