package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.l;

/* loaded from: classes2.dex */
public final class l<L> {

    /* renamed from: a, reason: collision with root package name */
    public final xa.a f6009a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f6010b;

    /* renamed from: c, reason: collision with root package name */
    public volatile a f6011c;

    public static final class a<L> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6012a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6013b;

        public a(L l10, String str) {
            this.f6012a = l10;
            this.f6013b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6012a == aVar.f6012a && this.f6013b.equals(aVar.f6013b);
        }

        public final int hashCode() {
            return this.f6013b.hashCode() + (System.identityHashCode(this.f6012a) * 31);
        }
    }

    public interface b<L> {
        void notifyListener(L l10);

        void onNotifyListenerFailed();
    }

    public l(Looper looper, L l10, String str) {
        this.f6009a = new xa.a(looper);
        com.google.android.gms.common.internal.p.g(l10, "Listener must not be null");
        this.f6010b = l10;
        com.google.android.gms.common.internal.p.d(str);
        this.f6011c = new a(l10, str);
    }

    public final void a(final b<? super L> bVar) {
        this.f6009a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.r0
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = this.f6036a;
                l.b bVar2 = bVar;
                Object obj = lVar.f6010b;
                if (obj == null) {
                    bVar2.onNotifyListenerFailed();
                    return;
                }
                try {
                    bVar2.notifyListener(obj);
                } catch (RuntimeException e10) {
                    bVar2.onNotifyListenerFailed();
                    throw e10;
                }
            }
        });
    }
}
