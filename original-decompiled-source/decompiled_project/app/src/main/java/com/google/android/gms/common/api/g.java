package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public abstract class g<O extends a.d> {
    protected final com.google.android.gms.common.api.internal.g zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final com.google.android.gms.common.api.internal.b zaf;
    private final Looper zag;
    private final int zah;

    @NotOnlyInitialized
    private final h zai;
    private final com.google.android.gms.common.api.internal.s zaj;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f5924c = new a(new com.google.android.gms.common.api.internal.a(), Looper.getMainLooper());

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.gms.common.api.internal.s f5925a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f5926b;

        public a(com.google.android.gms.common.api.internal.s sVar, Looper looper) {
            this.f5925a = sVar;
            this.f5926b = looper;
        }
    }

    public g(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    private final com.google.android.gms.common.api.internal.d zad(int i10, com.google.android.gms.common.api.internal.d dVar) {
        dVar.zak();
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        u0 u0Var = new u0(new h1(i10, dVar), gVar.f5976i.get(), this);
        zau zauVar = gVar.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(4, u0Var));
        return dVar;
    }

    private final Task zae(int i10, com.google.android.gms.common.api.internal.u uVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.s sVar = this.zaj;
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        gVar.g(taskCompletionSource, uVar.f6055c, this);
        u0 u0Var = new u0(new i1(i10, uVar, taskCompletionSource, sVar), gVar.f5976i.get(), this);
        zau zauVar = gVar.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(4, u0Var));
        return taskCompletionSource.getTask();
    }

    public h asGoogleApiClient() {
        return this.zai;
    }

    public d.a createClientSettingsBuilder() {
        GoogleSignInAccount googleSignInAccountB;
        GoogleSignInAccount googleSignInAccountB2;
        d.a aVar = new d.a();
        a.d dVar = this.zae;
        Account accountC = null;
        if (!(dVar instanceof a.d.b) || (googleSignInAccountB2 = ((a.d.b) dVar).b()) == null) {
            a.d dVar2 = this.zae;
            if (dVar2 instanceof a.d.InterfaceC0064a) {
                accountC = ((a.d.InterfaceC0064a) dVar2).c();
            }
        } else {
            String str = googleSignInAccountB2.f5856d;
            if (str != null) {
                accountC = new Account(str, "com.google");
            }
        }
        aVar.f6098a = accountC;
        a.d dVar3 = this.zae;
        Collection collectionD = (!(dVar3 instanceof a.d.b) || (googleSignInAccountB = ((a.d.b) dVar3).b()) == null) ? Collections.EMPTY_SET : googleSignInAccountB.d();
        if (aVar.f6099b == null) {
            aVar.f6099b = new p.b(0);
        }
        aVar.f6099b.addAll(collectionD);
        aVar.f6101d = this.zab.getClass().getName();
        aVar.f6100c = this.zab.getPackageName();
        return aVar;
    }

    public Task<Boolean> disconnectService() {
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        b0 b0Var = new b0(getApiKey());
        zau zauVar = gVar.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(14, b0Var));
        return b0Var.f5943b.getTask();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends l, A>> T doBestEffortWrite(T t3) {
        zad(2, t3);
        return t3;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends l, A>> T doRead(T t3) {
        zad(0, t3);
        return t3;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.o<A, ?>, U extends w<A, ?>> Task<Void> doRegisterEventListener(T t3, U u7) {
        com.google.android.gms.common.internal.p.f(t3);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(l.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends l, A>> T doWrite(T t3) {
        zad(1, t3);
        return t3;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final com.google.android.gms.common.api.internal.b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.l<L> registerListener(L l10, String str) {
        return com.google.android.gms.common.api.internal.m.a(this.zag, l10, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, j0 j0Var) {
        d.a aVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.d dVar = new com.google.android.gms.common.internal.d(aVarCreateClientSettingsBuilder.f6098a, aVarCreateClientSettingsBuilder.f6099b, null, aVarCreateClientSettingsBuilder.f6100c, aVarCreateClientSettingsBuilder.f6101d, jb.a.f15675a);
        a.AbstractC0063a abstractC0063a = this.zad.f5914a;
        com.google.android.gms.common.internal.p.f(abstractC0063a);
        a.f fVarBuildClient = abstractC0063a.buildClient(this.zab, looper, dVar, (com.google.android.gms.common.internal.d) this.zae, (h.a) j0Var, (h.b) j0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        return fVarBuildClient;
    }

    public final a1 zac(Context context, Handler handler) {
        d.a aVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new a1(context, handler, new com.google.android.gms.common.internal.d(aVarCreateClientSettingsBuilder.f6098a, aVarCreateClientSettingsBuilder.f6099b, null, aVarCreateClientSettingsBuilder.f6100c, aVarCreateClientSettingsBuilder.f6101d, jb.a.f15675a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public g(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, com.google.android.gms.common.api.internal.s sVar) {
        com.google.android.gms.common.internal.p.g(sVar, "StatusExceptionMapper must not be null.");
        Looper mainLooper = activity.getMainLooper();
        com.google.android.gms.common.internal.p.g(mainLooper, "Looper must not be null.");
        this(activity, (com.google.android.gms.common.api.a) aVar, (a.d) o10, new a(sVar, mainLooper));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.u<A, TResult> uVar) {
        return zae(2, uVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doRead(com.google.android.gms.common.api.internal.u<A, TResult> uVar) {
        return zae(0, uVar);
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.p<A, ?> pVar) {
        com.google.android.gms.common.internal.p.f(pVar);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(l.a<?> aVar, int i10) {
        com.google.android.gms.common.internal.p.g(aVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.g(taskCompletionSource, i10, this);
        u0 u0Var = new u0(new j1(aVar, taskCompletionSource), gVar.f5976i.get(), this);
        zau zauVar = gVar.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(13, u0Var));
        return taskCompletionSource.getTask();
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doWrite(com.google.android.gms.common.api.internal.u<A, TResult> uVar) {
        return zae(1, uVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public g(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, Looper looper, com.google.android.gms.common.api.internal.s sVar) {
        this(context, aVar, o10, new a(sVar, looper));
        com.google.android.gms.common.internal.p.g(looper, "Looper must not be null.");
        com.google.android.gms.common.internal.p.g(sVar, "StatusExceptionMapper must not be null.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public g(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, com.google.android.gms.common.api.internal.s sVar) {
        this(context, aVar, o10, new a(sVar, Looper.getMainLooper()));
        com.google.android.gms.common.internal.p.g(sVar, "StatusExceptionMapper must not be null.");
    }

    private g(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        String apiFallbackAttributionTag;
        com.google.android.gms.common.internal.p.g(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.p.g(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.p.g(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.p.g(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f5926b;
        com.google.android.gms.common.api.internal.b bVar = new com.google.android.gms.common.api.internal.b(aVar, dVar, apiFallbackAttributionTag);
        this.zaf = bVar;
        this.zai = new n0(this);
        com.google.android.gms.common.api.internal.g gVarH = com.google.android.gms.common.api.internal.g.h(applicationContext);
        this.zaa = gVarH;
        this.zah = gVarH.f5975h.getAndIncrement();
        this.zaj = aVar2.f5925a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.k fragment = com.google.android.gms.common.api.internal.j.getFragment(activity);
            a0 a0Var = (a0) fragment.b(a0.class, "ConnectionlessLifecycleHelper");
            a0Var = a0Var == null ? new a0(fragment, gVarH, pa.d.f21387d) : a0Var;
            a0Var.f5928e.add(bVar);
            gVarH.b(a0Var);
        }
        zau zauVar = gVarH.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public g(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }
}
