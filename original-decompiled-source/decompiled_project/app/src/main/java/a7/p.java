package a7;

import android.content.Context;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f98a;

    /* renamed from: b, reason: collision with root package name */
    public final i<Boolean> f99b;

    /* renamed from: c, reason: collision with root package name */
    public final c f100c;

    /* renamed from: d, reason: collision with root package name */
    public final i<y6.g> f101d;

    /* renamed from: e, reason: collision with root package name */
    public final i<Boolean> f102e;

    public p() {
        throw null;
    }

    public p(Context context, e7.c cVar) {
        Context applicationContext = context.getApplicationContext();
        r.d(applicationContext, "context.applicationContext");
        a aVar = new a(applicationContext, cVar);
        Context applicationContext2 = context.getApplicationContext();
        r.d(applicationContext2, "context.applicationContext");
        c cVar2 = new c(applicationContext2, cVar);
        Context applicationContext3 = context.getApplicationContext();
        r.d(applicationContext3, "context.applicationContext");
        String str = m.f96a;
        l lVar = new l(applicationContext3, cVar);
        Context applicationContext4 = context.getApplicationContext();
        r.d(applicationContext4, "context.applicationContext");
        n nVar = new n(applicationContext4, cVar);
        this.f98a = context;
        this.f99b = aVar;
        this.f100c = cVar2;
        this.f101d = lVar;
        this.f102e = nVar;
    }
}
