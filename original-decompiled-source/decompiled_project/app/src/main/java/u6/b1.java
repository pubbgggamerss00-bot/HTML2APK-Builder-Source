package u6;

import androidx.work.c;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import ph.u1;
import u6.z0;

@vg.e(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b1 extends vg.i implements eh.p<ph.i0, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f29263b;

    @vg.e(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super z0.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29264a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z0 f29265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0 z0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f29265b = z0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f29265b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super z0.b> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29264a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            this.f29264a = 1;
            Object objA = z0.a(this.f29265b, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(z0 z0Var, tg.e<? super b1> eVar) {
        super(2, eVar);
        this.f29263b = z0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b1(this.f29263b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Boolean> eVar) {
        return ((b1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        final z0.b aVar;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f29262a;
        final z0 z0Var = this.f29263b;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                u1 u1Var = z0Var.f29377m;
                a aVar3 = new a(z0Var, null);
                this.f29262a = 1;
                obj = ph.h.e(u1Var, aVar3, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            aVar = (z0.b) obj;
        } catch (w0 e10) {
            aVar = new z0.b.c(e10.f29357a);
        } catch (CancellationException unused) {
            aVar = new z0.b.a(0);
        } catch (Throwable th2) {
            t6.s.d().c(g1.f29296a, "Unexpected error in WorkerWrapper", th2);
            aVar = new z0.b.a(0);
        }
        Object objRunInTransaction = z0Var.f29372h.runInTransaction((Callable<Object>) new Callable() { // from class: u6.a1
            /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                z0 z0Var2 = z0Var;
                String str = z0Var2.f29367c;
                WorkSpecDao workSpecDao = z0Var2.f29373i;
                z0.b bVar = aVar;
                boolean z10 = bVar instanceof z0.b.C0300b;
                t6.c0 c0Var = t6.c0.f27994a;
                boolean z11 = true;
                boolean z12 = false;
                if (z10) {
                    c.a c0047a = ((z0.b.C0300b) bVar).f29386a;
                    t6.c0 c0VarR = workSpecDao.r(str);
                    z0Var2.f29372h.workProgressDao().a(str);
                    if (c0VarR != null) {
                        if (c0VarR == t6.c0.f27995b) {
                            WorkSpec workSpec = z0Var2.f29365a;
                            String str2 = z0Var2.f29376l;
                            if (c0047a instanceof c.a.C0048c) {
                                String str3 = g1.f29296a;
                                t6.s.d().e(str3, "Worker result SUCCESS for " + str2);
                                if (workSpec.c()) {
                                    z0Var2.c();
                                } else {
                                    workSpecDao.x(t6.c0.f27996c, str);
                                    androidx.work.b bVar2 = ((c.a.C0048c) c0047a).f3138a;
                                    kotlin.jvm.internal.r.d(bVar2, "success.outputData");
                                    workSpecDao.m(str, bVar2);
                                    z0Var2.f29370f.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    DependencyDao dependencyDao = z0Var2.f29374j;
                                    ArrayList arrayListB = dependencyDao.b(str);
                                    int size = arrayListB.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj2 = arrayListB.get(i11);
                                        i11++;
                                        String str4 = (String) obj2;
                                        if (workSpecDao.r(str4) == t6.c0.f27998e && dependencyDao.c(str4)) {
                                            t6.s.d().e(g1.f29296a, "Setting status to enqueued for ".concat(str4));
                                            workSpecDao.x(c0Var, str4);
                                            workSpecDao.n(str4, jCurrentTimeMillis);
                                        }
                                    }
                                }
                            } else if (c0047a instanceof c.a.b) {
                                String str5 = g1.f29296a;
                                t6.s.d().e(str5, "Worker result RETRY for " + str2);
                                z0Var2.b(-256);
                                z12 = z11;
                            } else {
                                String str6 = g1.f29296a;
                                t6.s.d().e(str6, "Worker result FAILURE for " + str2);
                                if (workSpec.c()) {
                                    z0Var2.c();
                                } else {
                                    if (c0047a == null) {
                                        c0047a = new c.a.C0047a();
                                    }
                                    z0Var2.d(c0047a);
                                }
                            }
                            z11 = false;
                            z12 = z11;
                        } else {
                            if (c0VarR.a()) {
                                z11 = false;
                            } else {
                                z0Var2.b(-512);
                            }
                            z12 = z11;
                        }
                    }
                } else if (bVar instanceof z0.b.a) {
                    z0Var2.d(((z0.b.a) bVar).f29385a);
                } else {
                    if (!(bVar instanceof z0.b.c)) {
                        throw new pg.l();
                    }
                    int i12 = ((z0.b.c) bVar).f29387a;
                    t6.c0 c0VarR2 = workSpecDao.r(str);
                    if (c0VarR2 == null || c0VarR2.a()) {
                        String str7 = g1.f29296a;
                        t6.s.d().a(str7, "Status for " + str + " is " + c0VarR2 + " ; not doing any work");
                        z11 = false;
                        z12 = z11;
                    } else {
                        String str8 = g1.f29296a;
                        t6.s.d().a(str8, "Status for " + str + " is " + c0VarR2 + "; not doing any work and rescheduling for later execution");
                        workSpecDao.x(c0Var, str);
                        workSpecDao.p(i12, str);
                        workSpecDao.e(str, -1L);
                        z12 = z11;
                    }
                }
                return Boolean.valueOf(z12);
            }
        });
        kotlin.jvm.internal.r.d(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
        return objRunInTransaction;
    }
}
