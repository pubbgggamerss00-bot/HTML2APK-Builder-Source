package androidx.work;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import k3.d;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3133a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f3134b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3135c = new AtomicInteger(-256);

    /* renamed from: d, reason: collision with root package name */
    public boolean f3136d;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0047a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3137a = androidx.work.b.f3129b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0047a.class != obj.getClass()) {
                    return false;
                }
                return this.f3137a.equals(((C0047a) obj).f3137a);
            }

            public final int hashCode() {
                return this.f3137a.hashCode() + (C0047a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f3137a + '}';
            }
        }

        public static final class b extends a {
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0048c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f3138a = androidx.work.b.f3129b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0048c.class != obj.getClass()) {
                    return false;
                }
                return this.f3138a.equals(((C0048c) obj).f3138a);
            }

            public final int hashCode() {
                return this.f3138a.hashCode() + (C0048c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f3138a + '}';
            }
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f3133a = context;
        this.f3134b = workerParameters;
    }

    public d.C0161d a() {
        return k3.d.a(new org.bouncycastle.pqc.jcajce.provider.bike.a());
    }

    public abstract d.C0161d b();
}
