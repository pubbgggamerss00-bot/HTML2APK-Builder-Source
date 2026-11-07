package tg;

import eh.p;
import java.io.Serializable;
import kotlin.jvm.internal.r;
import tg.h;
import x0.s1;

/* loaded from: classes2.dex */
public final class d implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f28765a;

    /* renamed from: b, reason: collision with root package name */
    public final h.a f28766b;

    public d(h.a element, h left) {
        r.e(left, "left");
        r.e(element, "element");
        this.f28765a = left;
        this.f28766b = element;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int i10 = 2;
            d dVar2 = dVar;
            int i11 = 2;
            while (true) {
                h hVar = dVar2.f28765a;
                dVar2 = hVar instanceof d ? (d) hVar : null;
                if (dVar2 == null) {
                    break;
                }
                i11++;
            }
            d dVar3 = this;
            while (true) {
                h hVar2 = dVar3.f28765a;
                dVar3 = hVar2 instanceof d ? (d) hVar2 : null;
                if (dVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                d dVar4 = this;
                while (true) {
                    h.a aVar = dVar4.f28766b;
                    if (!r.a(dVar.get(aVar.getKey()), aVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = dVar4.f28765a;
                    if (!(hVar3 instanceof d)) {
                        r.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        h.a aVar2 = (h.a) hVar3;
                        zA = r.a(dVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    dVar4 = (d) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // tg.h
    public final <R> R fold(R r10, p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke((Object) this.f28765a.fold(r10, pVar), this.f28766b);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> key) {
        r.e(key, "key");
        d dVar = this;
        while (true) {
            E e10 = (E) dVar.f28766b.get(key);
            if (e10 != null) {
                return e10;
            }
            h hVar = dVar.f28765a;
            if (!(hVar instanceof d)) {
                return (E) hVar.get(key);
            }
            dVar = (d) hVar;
        }
    }

    public final int hashCode() {
        return this.f28766b.hashCode() + this.f28765a.hashCode();
    }

    @Override // tg.h
    public final h minusKey(h.b<?> key) {
        r.e(key, "key");
        h.a aVar = this.f28766b;
        h.a aVar2 = aVar.get(key);
        h hVar = this.f28765a;
        if (aVar2 != null) {
            return hVar;
        }
        h hVarMinusKey = hVar.minusKey(key);
        return hVarMinusKey == hVar ? this : hVarMinusKey == i.f28768a ? aVar : new d(aVar, hVarMinusKey);
    }

    @Override // tg.h
    public final h plus(h context) {
        r.e(context, "context");
        return context == i.f28768a ? this : (h) context.fold(this, new g());
    }

    public final String toString() {
        return s1.a(new StringBuilder("["), (String) fold("", new c()), ']');
    }
}
