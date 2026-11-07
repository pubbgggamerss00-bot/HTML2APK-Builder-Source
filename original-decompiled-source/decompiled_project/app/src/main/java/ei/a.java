package ei;

import di.y;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r;
import qg.a0;
import zh.i;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f8738a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f8739b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f8740c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f8741d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f8742e;

    public a() {
        a0 a0Var = a0.f22708a;
        this.f8738a = a0Var;
        this.f8739b = a0Var;
        this.f8740c = a0Var;
        this.f8741d = a0Var;
        this.f8742e = a0Var;
    }

    @Override // ei.b
    public final void a(y yVar) {
        this.f8738a.getClass();
        this.f8739b.getClass();
        this.f8740c.getClass();
        this.f8742e.getClass();
    }

    @Override // ei.b
    public final <T> zh.b<T> b(kh.c<T> kClass, List<? extends zh.b<?>> typeArgumentsSerializers) {
        r.e(kClass, "kClass");
        r.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f8738a.getClass();
        return null;
    }

    @Override // ei.b
    public final boolean c() {
        return false;
    }

    @Override // ei.b
    public final zh.a d(String str, kh.c baseClass) {
        r.e(baseClass, "baseClass");
        this.f8741d.getClass();
        this.f8742e.getClass();
        m0.c(1, null);
        return null;
    }

    @Override // ei.b
    public final <T> i<T> e(kh.c<? super T> baseClass, T value) {
        r.e(baseClass, "baseClass");
        r.e(value, "value");
        if (!baseClass.i(value)) {
            return null;
        }
        this.f8739b.getClass();
        this.f8740c.getClass();
        m0.c(1, null);
        return null;
    }
}
