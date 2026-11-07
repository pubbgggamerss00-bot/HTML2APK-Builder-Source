package x5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import qg.x;

/* loaded from: classes.dex */
public final class e implements h6.b, yh.a {

    /* renamed from: a, reason: collision with root package name */
    public final h6.b f32104a;

    /* renamed from: b, reason: collision with root package name */
    public final yh.a f32105b;

    /* renamed from: c, reason: collision with root package name */
    public tg.h f32106c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f32107d;

    public e(h6.b delegate) {
        yh.c cVar = new yh.c();
        r.e(delegate, "delegate");
        this.f32104a = delegate;
        this.f32105b = cVar;
    }

    @Override // h6.b
    public final h6.d B0(String sql) {
        r.e(sql, "sql");
        return this.f32104a.B0(sql);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f32104a.close();
    }

    @Override // yh.a
    public final Object h(vg.c cVar) {
        return this.f32105b.h(cVar);
    }

    @Override // yh.a
    public final void l(Object obj) {
        this.f32105b.l(null);
    }

    public final void p(StringBuilder sb) {
        if (this.f32106c == null && this.f32107d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        tg.h hVar = this.f32106c;
        if (hVar != null) {
            sb.append("\t\tCoroutine: " + hVar);
            sb.append('\n');
        }
        Throwable th2 = this.f32107d;
        if (th2 != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            r.d(string, "toString(...)");
            Iterator it = x.y(1, mh.x.E(string)).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f32104a.toString();
    }
}
