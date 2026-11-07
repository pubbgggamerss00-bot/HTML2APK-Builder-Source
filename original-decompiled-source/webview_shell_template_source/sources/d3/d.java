package d3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import d3.a;
import d3.a.c;
import e3.c0;
import e3.e0;
import e3.r;
import e3.x;
import e3.z;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d<O extends a.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12713a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12714b;

    /* renamed from: c, reason: collision with root package name */
    public final d3.a<O> f12715c;

    /* renamed from: d, reason: collision with root package name */
    public final O f12716d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.a<O> f12717e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12718f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.j f12719g;
    public final e3.d h;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12720b = new a(new androidx.work.j(), Looper.getMainLooper());

        /* renamed from: a, reason: collision with root package name */
        public final androidx.work.j f12721a;

        public a(androidx.work.j jVar, Looper looper) {
            this.f12721a = jVar;
        }
    }

    public d() {
        throw null;
    }

    public d(Context context, d3.a<O> aVar, O o6, a aVar2) {
        com.google.android.gms.common.internal.l.g("Null context is not permitted.", context);
        com.google.android.gms.common.internal.l.g("Api must not be null.", aVar);
        com.google.android.gms.common.internal.l.g("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", aVar2);
        this.f12713a = context.getApplicationContext();
        String str = null;
        if (i3.g.b()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f12714b = str;
        this.f12715c = aVar;
        this.f12716d = o6;
        this.f12717e = new e3.a<>(aVar, o6, str);
        e3.d dVarE = e3.d.e(this.f12713a);
        this.h = dVarE;
        this.f12718f = dVarE.f12872z.getAndIncrement();
        this.f12719g = aVar2.f12721a;
        o3.f fVar = dVarE.E;
        fVar.sendMessage(fVar.obtainMessage(7, this));
    }

    public final c.a b() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        c.a aVar = new c.a();
        O o6 = this.f12716d;
        boolean z6 = o6 instanceof a.c.b;
        Account accountB = null;
        if (z6 && (googleSignInAccountA2 = ((a.c.b) o6).a()) != null) {
            String str = googleSignInAccountA2.f2388v;
            if (str != null) {
                accountB = new Account(str, "com.google");
            }
        } else if (o6 instanceof a.c.InterfaceC0046a) {
            accountB = ((a.c.InterfaceC0046a) o6).b();
        }
        aVar.f2421a = accountB;
        Collection<? extends Scope> collectionL = (!z6 || (googleSignInAccountA = ((a.c.b) o6).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.l();
        if (aVar.f2422b == null) {
            aVar.f2422b = new w.b<>(0);
        }
        aVar.f2422b.addAll(collectionL);
        Context context = this.f12713a;
        aVar.f2424d = context.getClass().getName();
        aVar.f2423c = context.getPackageName();
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p c(int i6, c0 c0Var) {
        v3.f fVar = new v3.f();
        e3.d dVar = this.h;
        o3.f fVar2 = dVar.E;
        int i7 = c0Var.f12881c;
        p pVar = fVar.f14800a;
        if (i7 != 0) {
            x xVar = null;
            if (dVar.a()) {
                n nVar = com.google.android.gms.common.internal.m.a().f2468a;
                e3.a<O> aVar = this.f12717e;
                boolean z6 = true;
                if (nVar == null) {
                    xVar = new x(dVar, i7, aVar, !z6 ? System.currentTimeMillis() : 0L, z6 ? SystemClock.elapsedRealtime() : 0L);
                } else {
                    if (nVar.f2470t) {
                        boolean z7 = nVar.f2471u;
                        r rVar = (r) dVar.B.get(aVar);
                        if (rVar != null) {
                            Object obj = rVar.f12894t;
                            if (obj instanceof com.google.android.gms.common.internal.b) {
                                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) obj;
                                if (!bVar.hasConnectionInfo() || bVar.isConnecting()) {
                                    z6 = z7;
                                } else {
                                    com.google.android.gms.common.internal.d dVarA = x.a(rVar, bVar, i7);
                                    if (dVarA != null) {
                                        rVar.D++;
                                        z6 = dVarA.f2430u;
                                    }
                                }
                                xVar = new x(dVar, i7, aVar, !z6 ? System.currentTimeMillis() : 0L, z6 ? SystemClock.elapsedRealtime() : 0L);
                            }
                        }
                    }
                    xVar = null;
                }
            }
            if (xVar != null) {
                fVar2.getClass();
                pVar.a(new e3.n(fVar2, 0), xVar);
            }
        }
        fVar2.sendMessage(fVar2.obtainMessage(4, new z(new e0(i6, c0Var, fVar, this.f12719g), dVar.A.get(), this)));
        return pVar;
    }
}
