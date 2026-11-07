package g1;

import b0.a0;
import g1.i;
import h1.t;
import kotlin.jvm.internal.s;
import x0.q1;
import x0.s2;
import x0.u2;
import x0.u3;

/* loaded from: classes.dex */
public final class c<T> implements o, u2 {

    /* renamed from: a, reason: collision with root package name */
    public l<T, Object> f11276a;

    /* renamed from: b, reason: collision with root package name */
    public i f11277b;

    /* renamed from: c, reason: collision with root package name */
    public String f11278c;

    /* renamed from: d, reason: collision with root package name */
    public T f11279d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f11280e;

    /* renamed from: f, reason: collision with root package name */
    public i.a f11281f;

    /* renamed from: g, reason: collision with root package name */
    public final a f11282g = new a(this);

    public static final class a extends s implements eh.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<T> f11283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar) {
            super(0);
            this.f11283a = cVar;
        }

        @Override // eh.a
        public final Object invoke() {
            c<T> cVar = this.f11283a;
            l<T, Object> lVar = cVar.f11276a;
            T t3 = cVar.f11279d;
            if (t3 != null) {
                return lVar.b(cVar, t3);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public c(l<T, Object> lVar, i iVar, String str, T t3, Object[] objArr) {
        this.f11276a = lVar;
        this.f11277b = iVar;
        this.f11278c = str;
        this.f11279d = t3;
        this.f11280e = objArr;
    }

    @Override // g1.o
    public final boolean a(Object obj) {
        i iVar = this.f11277b;
        return iVar == null || iVar.a(obj);
    }

    @Override // x0.u2
    public final void b() {
        i.a aVar = this.f11281f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // x0.u2
    public final void c() {
        i.a aVar = this.f11281f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // x0.u2
    public final void d() {
        e();
    }

    public final void e() {
        String strC;
        i iVar = this.f11277b;
        if (this.f11281f != null) {
            throw new IllegalArgumentException(("entry(" + this.f11281f + ") is not null").toString());
        }
        if (iVar != null) {
            a aVar = this.f11282g;
            Object objInvoke = aVar.invoke();
            if (objInvoke == null || iVar.a(objInvoke)) {
                this.f11281f = iVar.d(this.f11278c, aVar);
                return;
            }
            if (objInvoke instanceof t) {
                t tVar = (t) objInvoke;
                if (tVar.a() == q1.f31878a || tVar.a() == u3.f31923a || tVar.a() == s2.f31913a) {
                    strC = "MutableState containing " + tVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strC = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strC = a0.c(objInvoke);
            }
            throw new IllegalArgumentException(strC);
        }
    }
}
