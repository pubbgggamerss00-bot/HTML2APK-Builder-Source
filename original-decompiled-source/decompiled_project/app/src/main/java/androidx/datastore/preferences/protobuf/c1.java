package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.b2;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c1<T> implements o1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final w1<?, ?> f1997b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1998c;

    /* renamed from: d, reason: collision with root package name */
    public final u<?> f1999d;

    public c1(w1<?, ?> w1Var, u<?> uVar, MessageLite messageLite) {
        this.f1997b = w1Var;
        this.f1998c = uVar.e(messageLite);
        this.f1999d = uVar;
        this.f1996a = messageLite;
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final int a(AbstractMessageLite abstractMessageLite) {
        w1<?, ?> w1Var = this.f1997b;
        int i10 = w1Var.i(w1Var.g(abstractMessageLite));
        return this.f1998c ? this.f1999d.c(abstractMessageLite).g() + i10 : i10;
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final int b(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f1997b.g(generatedMessageLite).hashCode();
        if (!this.f1998c) {
            return iHashCode;
        }
        return this.f1999d.c(generatedMessageLite).f2166a.hashCode() + (iHashCode * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void c(T t3, c2 c2Var) throws IOException {
        j jVar;
        Iterator itL = this.f1999d.c(t3).l();
        while (itL.hasNext()) {
            Map.Entry entry = (Map.Entry) itL.next();
            x.a aVar = (x.a) entry.getKey();
            if (aVar.getLiteJavaType() != b2.b.MESSAGE || aVar.isRepeated() || aVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof h0.a) {
                int number = aVar.getNumber();
                h0 value = ((h0.a) entry).f2031a.getValue();
                if (value.f2037b != null) {
                    jVar = value.f2037b;
                } else {
                    synchronized (value) {
                        try {
                            if (value.f2037b != null) {
                                jVar = value.f2037b;
                            } else {
                                if (value.f2036a == null) {
                                    value.f2037b = j.f2038b;
                                } else {
                                    value.f2037b = value.f2036a.toByteString();
                                }
                                jVar = value.f2037b;
                            }
                        } finally {
                        }
                    }
                }
                ((n) c2Var).b(number, jVar);
            } else {
                ((n) c2Var).b(aVar.getNumber(), entry.getValue());
            }
        }
        w1<?, ?> w1Var = this.f1997b;
        w1Var.q(w1Var.g(t3), c2Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final boolean d(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        w1<?, ?> w1Var = this.f1997b;
        if (!w1Var.g(generatedMessageLite).equals(w1Var.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.f1998c) {
            return true;
        }
        u<?> uVar = this.f1999d;
        return uVar.c(generatedMessageLite).equals(uVar.c(generatedMessageLite2));
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void e(Object obj, l lVar, t tVar) throws IOException {
        w1<?, ?> w1Var = this.f1997b;
        x1 x1VarF = w1Var.f(obj);
        u<?> uVar = this.f1999d;
        x<T> xVarD = uVar.d(obj);
        while (lVar.a() != Integer.MAX_VALUE) {
            try {
                l lVar2 = lVar;
                t tVar2 = tVar;
                if (!g(lVar2, tVar2, uVar, xVarD, w1Var, x1VarF)) {
                    return;
                }
                lVar = lVar2;
                tVar = tVar2;
            } finally {
                w1Var.n(obj, x1VarF);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    @Override // androidx.datastore.preferences.protobuf.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(T t3, byte[] bArr, int i10, int i11, d.a aVar) throws IOException {
        c1<T> c1Var = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t3;
        x1 x1Var = generatedMessageLite.unknownFields;
        if (x1Var == x1.f2170f) {
            x1Var = new x1();
            generatedMessageLite.unknownFields = x1Var;
        }
        x1 x1Var2 = x1Var;
        x<GeneratedMessageLite.b> xVarEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t3).ensureExtensionsAreMutable();
        int iW = i10;
        GeneratedMessageLite.c cVar = null;
        while (iW < i11) {
            GeneratedMessageLite.c cVarB = cVar;
            int iR = d.r(bArr, iW, aVar);
            int i12 = aVar.f2000a;
            t tVar = aVar.f2003d;
            MessageLite messageLite = c1Var.f1996a;
            u<?> uVar = c1Var.f1999d;
            int i13 = 2;
            if (i12 == 11) {
                int i14 = 0;
                j jVar = null;
                while (iR < i11) {
                    iR = d.r(bArr, iR, aVar);
                    int i15 = aVar.f2000a;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 == i13) {
                        if (i17 == 0) {
                            iR = d.r(bArr, iR, aVar);
                            i14 = aVar.f2000a;
                            cVarB = uVar.b(tVar, messageLite, i14);
                        }
                        i13 = 2;
                    } else if (i16 == 3) {
                        if (cVarB != null) {
                            iR = d.e(k1.f2075c.a(cVarB.f1923c.getClass()), bArr, iR, i11, aVar);
                            xVarEnsureExtensionsAreMutable.p(cVarB.f1924d, aVar.f2002c);
                        } else if (i17 == 2) {
                            iR = d.a(bArr, iR, aVar);
                            jVar = (j) aVar.f2002c;
                        } else if (i15 == 12) {
                            break;
                        } else {
                            iR = d.w(i15, bArr, iR, i11, aVar);
                        }
                        i13 = 2;
                    }
                }
                if (jVar != null) {
                    x1Var2.f((i14 << 3) | 2, jVar);
                }
                c1Var = this;
                iW = iR;
            } else if ((i12 & 7) == 2) {
                cVarB = uVar.b(tVar, messageLite, i12 >>> 3);
                if (cVarB != null) {
                    iW = d.e(k1.f2075c.a(cVarB.f1923c.getClass()), bArr, iR, i11, aVar);
                    xVarEnsureExtensionsAreMutable.p(cVarB.f1924d, aVar.f2002c);
                } else {
                    iW = d.p(i12, bArr, iR, i11, x1Var2, aVar);
                }
            } else {
                iW = d.w(i12, bArr, iR, i11, aVar);
            }
            cVar = cVarB;
        }
        if (iW != i11) {
            throw e0.f();
        }
    }

    public final boolean g(l lVar, t tVar, u uVar, x xVar, w1 w1Var, Object obj) throws IOException {
        int i10 = lVar.f2079b;
        MessageLite messageLite = this.f1996a;
        if (i10 != 11) {
            if ((i10 & 7) != 2) {
                return lVar.y();
            }
            GeneratedMessageLite.c cVarB = uVar.b(tVar, messageLite, i10 >>> 3);
            if (cVarB == null) {
                return w1Var.l(obj, lVar, 0);
            }
            uVar.h(lVar, cVarB, tVar, xVar);
            return true;
        }
        GeneratedMessageLite.c cVarB2 = null;
        j jVarE = null;
        int iF = 0;
        while (lVar.a() != Integer.MAX_VALUE) {
            int i11 = lVar.f2079b;
            if (i11 == 16) {
                lVar.x(0);
                iF = lVar.f2078a.F();
                cVarB2 = uVar.b(tVar, messageLite, iF);
            } else if (i11 == 26) {
                if (cVarB2 != null) {
                    uVar.h(lVar, cVarB2, tVar, xVar);
                } else {
                    jVarE = lVar.e();
                }
            } else if (!lVar.y()) {
                break;
            }
        }
        if (lVar.f2079b != 12) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
        if (jVarE != null) {
            if (cVarB2 != null) {
                uVar.i(jVarE, cVarB2, tVar, xVar);
                return true;
            }
            w1Var.d(obj, iF, jVarE);
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final boolean isInitialized(T t3) {
        return this.f1999d.c(t3).j();
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void makeImmutable(T t3) {
        this.f1997b.j(t3);
        this.f1999d.f(t3);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void mergeFrom(T t3, T t10) {
        Class<?> cls = p1.f2127a;
        w1<?, ?> w1Var = this.f1997b;
        w1Var.o(t3, w1Var.k(w1Var.g(t3), w1Var.g(t10)));
        if (this.f1998c) {
            u<?> uVar = this.f1999d;
            x<T> xVarC = uVar.c(t10);
            if (xVarC.f2166a.isEmpty()) {
                return;
            }
            uVar.d(t3).n(xVarC);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final T newInstance() {
        MessageLite messageLite = this.f1996a;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }
}
