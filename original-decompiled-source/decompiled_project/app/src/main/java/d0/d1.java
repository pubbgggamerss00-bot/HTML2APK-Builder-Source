package d0;

import d0.e2;
import d0.e2.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final h2 f7084a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<c2, pg.f0> f7085b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f7086c;

    /* renamed from: d, reason: collision with root package name */
    public e2 f7087d;

    public final class a implements c2 {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7088a = new ArrayList();

        public a() {
        }

        @Override // d0.c2
        public final void a(int i10) {
            long j10 = e1.f7096a;
            d1 d1Var = d1.this;
            e2 e2Var = d1Var.f7087d;
            if (e2Var == null) {
                return;
            }
            this.f7088a.add(e2Var.new a(i10, j10, d1Var.f7086c));
        }
    }

    public interface b {
        void a();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d1(h2 h2Var, eh.l<? super c2, pg.f0> lVar) {
        this.f7084a = h2Var;
        this.f7085b = lVar;
        this.f7086c = new f2();
    }

    public final b a(int i10, long j10) {
        e2 e2Var = this.f7087d;
        if (e2Var == null) {
            return f.f7120a;
        }
        e2.a aVar = e2Var.new a(i10, j10, this.f7086c);
        e2Var.f7100c.a(aVar);
        return aVar;
    }

    public d1() {
        this(null, null);
    }
}
