package androidx.compose.ui;

import androidx.compose.ui.d;
import eh.l;
import eh.p;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import x0.s1;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final d f1137b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1138c;

    /* renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    public static final class C0017a extends s implements p<String, d.b, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0017a f1139a = new C0017a(2);

        @Override // eh.p
        public final String invoke(String str, d.b bVar) {
            String str2 = str;
            d.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public a(d dVar, d dVar2) {
        this.f1137b = dVar;
        this.f1138c = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.d
    public final <R> R c(R r10, p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) this.f1138c.c(this.f1137b.c(r10, pVar), pVar);
    }

    @Override // androidx.compose.ui.d
    public final boolean d(l<? super d.b, Boolean> lVar) {
        return this.f1137b.d(lVar) && this.f1138c.d(lVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.a(this.f1137b, aVar.f1137b) && r.a(this.f1138c, aVar.f1138c);
    }

    public final int hashCode() {
        return (this.f1138c.hashCode() * 31) + this.f1137b.hashCode();
    }

    public final String toString() {
        return s1.a(new StringBuilder("["), (String) c("", C0017a.f1139a), ']');
    }
}
