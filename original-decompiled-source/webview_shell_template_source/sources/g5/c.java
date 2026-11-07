package g5;

import com.google.android.gms.ads.RequestConfiguration;
import g5.f;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import p5.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements f, Serializable {
    public final f s;

    /* renamed from: t, reason: collision with root package name */
    public final f.b f13267t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends k implements p<String, f.b, String> {
        public static final a s = new a(2);

        @Override // p5.p
        public final String b(String str, f.b bVar) {
            String str2 = str;
            f.b bVar2 = bVar;
            j.e("acc", str2);
            j.e("element", bVar2);
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public c(f.b bVar, f fVar) {
        j.e("left", fVar);
        j.e("element", bVar);
        this.s = fVar;
        this.f13267t = bVar;
    }

    @Override // g5.f
    public final f b(f.c<?> cVar) {
        j.e("key", cVar);
        f.b bVar = this.f13267t;
        f.b bVarT = bVar.t(cVar);
        f fVar = this.s;
        if (bVarT != null) {
            return fVar;
        }
        f fVarB = fVar.b(cVar);
        return fVarB == fVar ? this : fVarB == g.s ? bVar : new c(bVar, fVarB);
    }

    @Override // g5.f
    public final f e(f fVar) {
        return f.a.a(this, fVar);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i6 = 2;
            c cVar2 = cVar;
            int i7 = 2;
            while (true) {
                f fVar = cVar2.s;
                cVar2 = fVar instanceof c ? (c) fVar : null;
                if (cVar2 == null) {
                    break;
                }
                i7++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.s;
                cVar3 = fVar2 instanceof c ? (c) fVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i6++;
            }
            if (i7 == i6) {
                c cVar4 = this;
                while (true) {
                    f.b bVar = cVar4.f13267t;
                    if (!j.a(cVar.t(bVar.getKey()), bVar)) {
                        zA = false;
                        break;
                    }
                    f fVar3 = cVar4.s;
                    if (!(fVar3 instanceof c)) {
                        j.c("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", fVar3);
                        f.b bVar2 = (f.b) fVar3;
                        zA = j.a(cVar.t(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13267t.hashCode() + this.s.hashCode();
    }

    @Override // g5.f
    public final <R> R s(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        j.e("operation", pVar);
        return pVar.b((Object) this.s.s(r5, pVar), this.f13267t);
    }

    @Override // g5.f
    public final <E extends f.b> E t(f.c<E> cVar) {
        j.e("key", cVar);
        c cVar2 = this;
        while (true) {
            E e6 = (E) cVar2.f13267t.t(cVar);
            if (e6 != null) {
                return e6;
            }
            f fVar = cVar2.s;
            if (!(fVar instanceof c)) {
                return (E) fVar.t(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final String toString() {
        return "[" + ((String) s(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, a.s)) + ']';
    }
}
