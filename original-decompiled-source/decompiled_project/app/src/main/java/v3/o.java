package v3;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public h f30601a;

    /* renamed from: b, reason: collision with root package name */
    public i f30602b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f30603c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f30604a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f30605b;

        public a(i iVar, Object obj) {
            this.f30604a = iVar;
            this.f30605b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f30604a.accept(this.f30605b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f30601a.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f30603c.post(new a(this.f30602b, objCall));
    }
}
