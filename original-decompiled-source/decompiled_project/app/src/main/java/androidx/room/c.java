package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.g0;
import i6.c;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2858b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0132c f2859c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.e f2860d;

    /* renamed from: e, reason: collision with root package name */
    public final List<g0.b> f2861e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2862f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.d f2863g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f2864h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f2865i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f2866j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2867k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2868l;

    /* renamed from: m, reason: collision with root package name */
    public final Set<Integer> f2869m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2870n;

    /* renamed from: o, reason: collision with root package name */
    public final File f2871o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable<InputStream> f2872p;

    /* renamed from: q, reason: collision with root package name */
    public final List<Object> f2873q;

    /* renamed from: r, reason: collision with root package name */
    public final List<Object> f2874r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2875s;

    /* renamed from: t, reason: collision with root package name */
    public final h6.c f2876t;

    /* renamed from: u, reason: collision with root package name */
    public final tg.h f2877u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2878v;

    public c(Context context, String str, c.InterfaceC0132c interfaceC0132c, g0.e migrationContainer, List list, boolean z10, g0.d dVar, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z13, h6.c cVar, tg.h hVar) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.r.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.r.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.r.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.r.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f2857a = context;
        this.f2858b = str;
        this.f2859c = interfaceC0132c;
        this.f2860d = migrationContainer;
        this.f2861e = list;
        this.f2862f = z10;
        this.f2863g = dVar;
        this.f2864h = queryExecutor;
        this.f2865i = transactionExecutor;
        this.f2866j = intent;
        this.f2867k = z11;
        this.f2868l = z12;
        this.f2869m = set;
        this.f2870n = str2;
        this.f2871o = file;
        this.f2872p = callable;
        this.f2873q = typeConverters;
        this.f2874r = autoMigrationSpecs;
        this.f2875s = z13;
        this.f2876t = cVar;
        this.f2877u = hVar;
        this.f2878v = true;
    }
}
