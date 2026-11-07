package jg;

import android.app.Application;
import b.k;
import jg.c;
import kotlin.jvm.internal.h0;

/* loaded from: classes2.dex */
public final class a implements mg.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile f8.b f15720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15721b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final k f15722c;

    /* renamed from: d, reason: collision with root package name */
    public final c f15723d;

    /* renamed from: jg.a$a, reason: collision with other inner class name */
    public interface InterfaceC0151a {
        f8.a b();
    }

    public a(k kVar) {
        this.f15722c = kVar;
        this.f15723d = new c(kVar);
    }

    public final f8.b a() {
        String str;
        k kVar = this.f15722c;
        if (kVar.getApplication() instanceof mg.b) {
            f8.a aVarB = ((InterfaceC0151a) b3.a.c(InterfaceC0151a.class, this.f15723d)).b();
            aVarB.getClass();
            return new f8.b(aVarB.f8870a, aVarB.f8871b);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(kVar.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + kVar.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final e b() {
        c cVar = this.f15723d;
        return ((c.b) c.a(cVar.f15725a, cVar.f15726b).a(h0.a(c.b.class))).f15730c;
    }

    @Override // mg.b
    public final Object generatedComponent() {
        if (this.f15720a == null) {
            synchronized (this.f15721b) {
                try {
                    if (this.f15720a == null) {
                        this.f15720a = a();
                    }
                } finally {
                }
            }
        }
        return this.f15720a;
    }
}
