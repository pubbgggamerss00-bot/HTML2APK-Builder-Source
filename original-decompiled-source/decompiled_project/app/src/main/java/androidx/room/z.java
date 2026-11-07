package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.a;
import androidx.room.g0;
import androidx.room.j0;
import i6.c;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z extends androidx.room.a {

    /* renamed from: c, reason: collision with root package name */
    public final c f3099c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f3100d;

    /* renamed from: e, reason: collision with root package name */
    public final List<g0.b> f3101e;

    /* renamed from: f, reason: collision with root package name */
    public final x5.b f3102f;

    /* renamed from: g, reason: collision with root package name */
    public i6.b f3103g;

    public static final class a extends j0 {
        @Override // androidx.room.j0
        public final void createAllTables(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.j0
        public final void dropAllTables(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.j0
        public final void onCreate(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.j0
        public final void onOpen(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.j0
        public final void onPostMigrate(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.j0
        public final void onPreMigrate(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.j0
        public final j0.a onValidateSchema(h6.b connection) {
            kotlin.jvm.internal.r.e(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    public final class b extends c.a {
        public b(int i10) {
            super(i10);
        }

        @Override // i6.c.a
        public final void c(j6.f fVar) {
            z.this.f(new y5.a(fVar));
        }

        @Override // i6.c.a
        public final void d(j6.f fVar, int i10, int i11) {
            f(fVar, i10, i11);
        }

        @Override // i6.c.a
        public final void e(j6.f fVar) {
            y5.a aVar = new y5.a(fVar);
            z zVar = z.this;
            zVar.h(aVar);
            zVar.f3103g = fVar;
        }

        @Override // i6.c.a
        public final void f(j6.f fVar, int i10, int i11) {
            z.this.g(new y5.a(fVar), i10, i11);
        }
    }

    public z(c cVar, j0 j0Var) {
        int i10;
        x5.d dVar;
        g0.d dVar2 = cVar.f2863g;
        c.InterfaceC0132c interfaceC0132c = cVar.f2859c;
        String str = cVar.f2858b;
        this.f3099c = cVar;
        this.f3100d = j0Var;
        List<g0.b> list = cVar.f2861e;
        this.f3101e = list == null ? qg.z.f22752a : list;
        h6.c cVar2 = cVar.f2876t;
        if (cVar2 != null) {
            if (str == null) {
                dVar = new x5.d(new a.C0039a(this, cVar2));
            } else {
                a.C0039a c0039a = new a.C0039a(this, cVar2);
                int iOrdinal = dVar2.ordinal();
                if (iOrdinal == 1) {
                    i10 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + dVar2 + '\'').toString());
                    }
                    i10 = 4;
                }
                int iOrdinal2 = dVar2.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + dVar2 + '\'').toString());
                }
                dVar = new x5.d(c0039a, str, i10);
            }
            this.f3102f = dVar;
        } else {
            if (interfaceC0132c == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            Context context = cVar.f2857a;
            kotlin.jvm.internal.r.e(context, "context");
            this.f3102f = new y5.b(new cc.i(interfaceC0132c.a(new c.b(context, str, new b(j0Var.getVersion()), false, false))));
        }
        boolean z10 = dVar2 == g0.d.f2941c;
        i6.c cVarJ = j();
        if (cVarJ != null) {
            cVarJ.setWriteAheadLoggingEnabled(z10);
        }
    }

    @Override // androidx.room.a
    public final List<g0.b> c() {
        return this.f3101e;
    }

    @Override // androidx.room.a
    public final c d() {
        return this.f3099c;
    }

    @Override // androidx.room.a
    public final j0 e() {
        return this.f3100d;
    }

    public final i6.c j() {
        cc.i iVar;
        x5.b bVar = this.f3102f;
        y5.b bVar2 = bVar instanceof y5.b ? (y5.b) bVar : null;
        if (bVar2 == null || (iVar = bVar2.f33940a) == null) {
            return null;
        }
        return (i6.c) iVar.f5370a;
    }

    public z(c cVar, e0 e0Var) {
        g0.d dVar = cVar.f2863g;
        this.f3099c = cVar;
        this.f3100d = new a(-1, "", "");
        List<g0.b> list = cVar.f2861e;
        qg.z zVar = qg.z.f22752a;
        this.f3101e = list == null ? zVar : list;
        ArrayList arrayListP = qg.x.P(new a0(new y(this, 0)), list == null ? zVar : list);
        Context context = cVar.f2857a;
        String str = cVar.f2858b;
        c.InterfaceC0132c interfaceC0132c = cVar.f2859c;
        g0.e migrationContainer = cVar.f2860d;
        boolean z10 = cVar.f2862f;
        Executor queryExecutor = cVar.f2864h;
        Executor transactionExecutor = cVar.f2865i;
        Intent intent = cVar.f2866j;
        boolean z11 = cVar.f2867k;
        boolean z12 = cVar.f2868l;
        Set<Integer> set = cVar.f2869m;
        String str2 = cVar.f2870n;
        File file = cVar.f2871o;
        Callable<InputStream> callable = cVar.f2872p;
        List<Object> typeConverters = cVar.f2873q;
        List<Object> autoMigrationSpecs = cVar.f2874r;
        boolean z13 = cVar.f2875s;
        h6.c cVar2 = cVar.f2876t;
        tg.h hVar = cVar.f2877u;
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.r.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.r.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.r.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.r.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f3102f = new y5.b(new cc.i(g0.createConnectionManager$lambda$1((g0) e0Var.f2904b, new c(context, str, interfaceC0132c, migrationContainer, arrayListP, z10, dVar, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, typeConverters, autoMigrationSpecs, z13, cVar2, hVar))));
        boolean z14 = dVar == g0.d.f2941c;
        i6.c cVarJ = j();
        if (cVarJ != null) {
            cVarJ.setWriteAheadLoggingEnabled(z14);
        }
    }
}
