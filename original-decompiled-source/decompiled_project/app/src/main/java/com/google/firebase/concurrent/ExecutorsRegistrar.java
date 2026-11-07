package com.google.firebase.concurrent;

import b.o;
import com.google.firebase.components.ComponentRegistrar;
import i8.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import jd.b;
import jd.c;
import jd.d;
import sd.a;
import sd.q;
import sd.x;
import sd.y;
import td.r;
import td.s;
import td.t;

/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final q<ScheduledExecutorService> f6872a = new q<>(new td.q());

    /* renamed from: b, reason: collision with root package name */
    public static final q<ScheduledExecutorService> f6873b = new q<>(new r());

    /* renamed from: c, reason: collision with root package name */
    public static final q<ScheduledExecutorService> f6874c = new q<>(new s());

    /* renamed from: d, reason: collision with root package name */
    public static final q<ScheduledExecutorService> f6875d = new q<>(new t());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        y yVar = new y(jd.a.class, ScheduledExecutorService.class);
        y[] yVarArr = {new y(jd.a.class, ExecutorService.class), new y(jd.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(yVar);
        for (y yVar2 : yVarArr) {
            x.a(yVar2, "Null interface");
        }
        Collections.addAll(hashSet, yVarArr);
        a aVar = new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o(), hashSet3);
        y yVar3 = new y(b.class, ScheduledExecutorService.class);
        y[] yVarArr2 = {new y(b.class, ExecutorService.class), new y(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(yVar3);
        for (y yVar4 : yVarArr2) {
            x.a(yVar4, "Null interface");
        }
        Collections.addAll(hashSet4, yVarArr2);
        a aVar2 = new a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new org.bouncycastle.asn1.x509.a(), hashSet6);
        y yVar5 = new y(c.class, ScheduledExecutorService.class);
        y[] yVarArr3 = {new y(c.class, ExecutorService.class), new y(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(yVar5);
        for (y yVar6 : yVarArr3) {
            x.a(yVar6, "Null interface");
        }
        Collections.addAll(hashSet7, yVarArr3);
        a aVar3 = new a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new n(), hashSet9);
        a.C0274a c0274aB = a.b(new y(d.class, Executor.class));
        c0274aB.f24848f = new org.bouncycastle.cert.ocsp.a();
        return Arrays.asList(aVar, aVar2, aVar3, c0274aB.b());
    }
}
