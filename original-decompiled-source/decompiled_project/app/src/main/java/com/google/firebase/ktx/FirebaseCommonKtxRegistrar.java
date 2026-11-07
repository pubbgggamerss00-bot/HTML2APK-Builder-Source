package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.r;
import ph.g0;
import qg.p;
import sd.a;
import sd.l;
import sd.y;
import sd.z;

@pg.d
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements sd.d {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f6900a = new a<>();

        @Override // sd.d
        public final Object b(z zVar) {
            Object objG = zVar.g(new y<>(jd.a.class, Executor.class));
            r.d(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return bg.b.g((Executor) objG);
        }
    }

    public static final class b<T> implements sd.d {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f6901a = new b<>();

        @Override // sd.d
        public final Object b(z zVar) {
            Object objG = zVar.g(new y<>(jd.c.class, Executor.class));
            r.d(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return bg.b.g((Executor) objG);
        }
    }

    public static final class c<T> implements sd.d {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f6902a = new c<>();

        @Override // sd.d
        public final Object b(z zVar) {
            Object objG = zVar.g(new y<>(jd.b.class, Executor.class));
            r.d(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return bg.b.g((Executor) objG);
        }
    }

    public static final class d<T> implements sd.d {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f6903a = new d<>();

        @Override // sd.d
        public final Object b(z zVar) {
            Object objG = zVar.g(new y<>(jd.d.class, Executor.class));
            r.d(objG, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return bg.b.g((Executor) objG);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sd.a<?>> getComponents() {
        a.C0274a c0274aB = sd.a.b(new y(jd.a.class, g0.class));
        c0274aB.a(new l((y<?>) new y(jd.a.class, Executor.class), 1, 0));
        c0274aB.f24848f = a.f6900a;
        sd.a aVarB = c0274aB.b();
        a.C0274a c0274aB2 = sd.a.b(new y(jd.c.class, g0.class));
        c0274aB2.a(new l((y<?>) new y(jd.c.class, Executor.class), 1, 0));
        c0274aB2.f24848f = b.f6901a;
        sd.a aVarB2 = c0274aB2.b();
        a.C0274a c0274aB3 = sd.a.b(new y(jd.b.class, g0.class));
        c0274aB3.a(new l((y<?>) new y(jd.b.class, Executor.class), 1, 0));
        c0274aB3.f24848f = c.f6902a;
        sd.a aVarB3 = c0274aB3.b();
        a.C0274a c0274aB4 = sd.a.b(new y(jd.d.class, g0.class));
        c0274aB4.a(new l((y<?>) new y(jd.d.class, Executor.class), 1, 0));
        c0274aB4.f24848f = d.f6903a;
        return p.j(aVarB, aVarB2, aVarB3, c0274aB4.b());
    }
}
