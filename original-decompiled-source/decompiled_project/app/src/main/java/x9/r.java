package x9;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r implements t9.b<q> {

    /* renamed from: a, reason: collision with root package name */
    public final og.a<Context> f33515a;

    /* renamed from: b, reason: collision with root package name */
    public final og.a<s9.e> f33516b;

    /* renamed from: c, reason: collision with root package name */
    public final og.a<y9.d> f33517c;

    /* renamed from: d, reason: collision with root package name */
    public final w9.g f33518d;

    /* renamed from: e, reason: collision with root package name */
    public final og.a<Executor> f33519e;

    /* renamed from: f, reason: collision with root package name */
    public final og.a<z9.b> f33520f;

    /* renamed from: g, reason: collision with root package name */
    public final og.a<y9.c> f33521g;

    public r(og.a aVar, og.a aVar2, og.a aVar3, w9.g gVar, og.a aVar4, og.a aVar5, og.a aVar6) {
        this.f33515a = aVar;
        this.f33516b = aVar2;
        this.f33517c = aVar3;
        this.f33518d = gVar;
        this.f33519e = aVar4;
        this.f33520f = aVar5;
        this.f33521g = aVar6;
    }

    @Override // og.a
    public final Object get() {
        return new q(this.f33515a.get(), this.f33516b.get(), this.f33517c.get(), (w) this.f33518d.get(), this.f33519e.get(), this.f33520f.get(), new aa.c(), new aa.b(), this.f33521g.get());
    }
}
