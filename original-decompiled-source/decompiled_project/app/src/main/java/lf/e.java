package lf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class e implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f17035a;

    /* renamed from: b, reason: collision with root package name */
    public final l f17036b;

    public e() {
        this.f17035a = new cf.d();
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f17035a;
    }

    public final d a(cf.l lVar) {
        cf.b bVarV0 = this.f17035a.v0(cf.l.I);
        if (!(bVarV0 instanceof cf.d)) {
            return null;
        }
        cf.b bVarV02 = ((cf.d) bVarV0).v0(lVar);
        if (!(bVarV02 instanceof cf.d)) {
            return null;
        }
        d dVar = new d();
        dVar.f17034a = (cf.d) bVarV02;
        return dVar;
    }

    public final int b() {
        return this.f17035a.G0(cf.l.f5485k1, null, 40);
    }

    public final l c() throws IOException {
        l lVar = this.f17036b;
        if (lVar != null) {
            return lVar;
        }
        throw new IOException("No security handler for filter " + this.f17035a.J0(cf.l.B0));
    }

    public final int d() {
        return this.f17035a.G0(cf.l.A2, null, 0);
    }

    public final boolean e() {
        cf.b bVarV0 = this.f17035a.v0(cf.l.f5534x0);
        if (bVarV0 instanceof cf.c) {
            return ((cf.c) bVarV0).f5422b;
        }
        return true;
    }

    public e(cf.d dVar) {
        this.f17035a = dVar;
        m mVar = m.f17052b;
        Class cls = (Class) mVar.f17053a.get(dVar.J0(cf.l.B0));
        l lVar = null;
        if (cls != null) {
            try {
                lVar = (l) cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e13);
            }
        }
        this.f17036b = lVar;
    }
}
