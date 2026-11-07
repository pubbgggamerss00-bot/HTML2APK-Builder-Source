package ph;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class t1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient y1 f21591a;

    public t1(String str, Throwable th2, y1 y1Var) {
        super(str);
        this.f21591a = y1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (!kotlin.jvm.internal.r.a(t1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = t1Var.f21591a;
        if (obj2 == null) {
            obj2 = e2.f21526b;
        }
        Object obj3 = this.f21591a;
        if (obj3 == null) {
            obj3 = e2.f21526b;
        }
        return kotlin.jvm.internal.r.a(obj2, obj3) && kotlin.jvm.internal.r.a(t1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.r.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f21591a;
        if (obj == null) {
            obj = e2.f21526b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f21591a;
        if (obj == null) {
            obj = e2.f21526b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
