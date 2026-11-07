package r9;

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import r9.k;
import z9.b;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static volatile k f23315e;

    /* renamed from: a, reason: collision with root package name */
    public final aa.a f23316a;

    /* renamed from: b, reason: collision with root package name */
    public final aa.a f23317b;

    /* renamed from: c, reason: collision with root package name */
    public final w9.e f23318c;

    /* renamed from: d, reason: collision with root package name */
    public final x9.q f23319d;

    public u(aa.a aVar, aa.a aVar2, w9.e eVar, x9.q qVar, final x9.u uVar) {
        this.f23316a = aVar;
        this.f23317b = aVar2;
        this.f23318c = eVar;
        this.f23319d = qVar;
        uVar.f33524a.execute(new Runnable() { // from class: x9.s
            @Override // java.lang.Runnable
            public final void run() {
                final u uVar2 = uVar;
                uVar2.f33527d.p(new b.a() { // from class: x9.t
                    @Override // z9.b.a
                    public final Object f() {
                        u uVar3 = uVar2;
                        Iterator it = uVar3.f33525b.x().iterator();
                        while (it.hasNext()) {
                            uVar3.f33526c.b((r9.r) it.next(), 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static u a() {
        k kVar = f23315e;
        if (kVar != null) {
            return kVar.f23300g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f23315e == null) {
            synchronized (u.class) {
                try {
                    if (f23315e == null) {
                        k.a aVar = new k.a();
                        context.getClass();
                        aVar.f23301a = context;
                        f23315e = aVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final s c(l lVar) {
        Set setUnmodifiableSet = lVar != null ? Collections.unmodifiableSet(lVar.a()) : Collections.singleton(new o9.b("proto"));
        lVar.getClass();
        return new s(setUnmodifiableSet, new j("cct", lVar.getExtras(), o9.c.f19063a), this);
    }
}
