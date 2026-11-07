package androidx.work;

import androidx.work.c;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends s implements eh.a<c.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Worker f3139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Worker worker) {
        super(0);
        this.f3139a = worker;
    }

    @Override // eh.a
    public final c.a invoke() {
        return this.f3139a.c();
    }
}
