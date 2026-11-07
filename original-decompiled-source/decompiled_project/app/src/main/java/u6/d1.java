package u6;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.work.c f29282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f29285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.work.c cVar, boolean z10, String str, z0 z0Var) {
        super(1);
        this.f29282a = cVar;
        this.f29283b = z10;
        this.f29284c = str;
        this.f29285d = z0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Throwable th3 = th2;
        if (th3 instanceof w0) {
            this.f29282a.f3135c.compareAndSet(-256, ((w0) th3).f29357a);
        }
        if (this.f29283b && (str = this.f29284c) != null) {
            z0 z0Var = this.f29285d;
            c2.y yVar = z0Var.f29369e.f3128m;
            int iHashCode = z0Var.f29365a.hashCode();
            yVar.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                m6.b.b(iHashCode, m6.a.c(str));
            } else {
                String strC = m6.a.c(str);
                try {
                    if (m6.a.f17671d == null) {
                        m6.a.f17671d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    m6.a.f17671d.invoke(null, Long.valueOf(m6.a.f17668a), strC, Integer.valueOf(iHashCode));
                } catch (Exception e10) {
                    m6.a.a("asyncTraceEnd", e10);
                }
            }
        }
        return pg.f0.f21461a;
    }
}
